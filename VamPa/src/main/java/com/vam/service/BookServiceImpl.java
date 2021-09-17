package com.vam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.AttachMapper;
import com.vam.mapper.BookMapper;
import com.vam.model.AttachImageVO;
import com.vam.model.BookVO;
import com.vam.model.Criteria;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;
	
	@Autowired
	private AttachMapper attachMapper;
	
	/* 상품 검색 */
	@Override
	public List<BookVO> getGoodsList(Criteria cri) {
		
		log.info("getGoodsList().......");
		
		String type = cri.getType();
		String[] typeArr = type.split("");
		String[] authorArr = bookMapper.getAuthorIdList(cri.getKeyword());
		
		
		if(type.equals("A") || type.equals("AC") || type.equals("AT") || type.equals("ACT")) {
			if(authorArr.length == 0) {
				return new ArrayList();
			}
		}
		
		for(String t : typeArr) {
			if(t.equals("A")) {
				cri.setAuthorArr(authorArr);
			}
		}		
		
		List<BookVO> list = bookMapper.getGoodsList(cri);
		
		list.forEach(book -> {
			
			int bookId = book.getBookId();
			
			List<AttachImageVO> imageList = attachMapper.getAttachList(bookId);
			
			book.setImageList(imageList);
			
		});
		
		return list;
	}

	/* 사품 총 갯수 */
	@Override
	public int goodsGetTotal(Criteria cri) {
		
		log.info("goodsGetTotal().......");
		
		return bookMapper.goodsGetTotal(cri);
		
	}	
	
}
