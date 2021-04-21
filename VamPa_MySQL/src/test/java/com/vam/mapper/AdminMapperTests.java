package com.vam.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BookVO;
import com.vam.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AdminMapperTests {

	@Autowired
	private AdminMapper mapper;
	
	/* 상품 등록 */
	/*
	@Test
	public void bookEnrollTest() throws Exception{
		
		BookVO book = new BookVO();
		
		book.setBookName("mapper 테스트");
		book.setAuthorId(123);
		book.setPubleYear("2021-03-18");
		book.setPublisher("출판사");
		book.setCateCode("0231");
		book.setBookPrice(20000);
		book.setBookStock(300);
		book.setBookDiscount(0.23);
		book.setBookIntro("책 소개 ");
		book.setBookContents("책 목차 ");
		
		mapper.bookEnroll(book);
	}
	*/
	
	/* 카테고리 리스트 */
	/*
	@Test
	public void cateListTest() throws Exception{
		
		System.out.println("cateList()..........." + mapper.cateList());
		
	}
	*/
	
	
	/* 상품 리스트 & 상품 총 개수*/
	/*
	@Test
	public void goodsGetListTests() {
		
		Criteria cri = new Criteria();
		
		cri.setKeyword("test");
		
		// 상품 리스트 
		List list = mapper.goodsGetList(cri);
		for(int i = 0; i < 10; i++) {
			System.out.println("result..........." +i + " : " + list.get(i) );
		}
		
		
		
		/// 상품 총 개수 
		//int result = mapper.goodsGetTotal(cri);
		//System.out.println("resout........." + result);
		
	}
	*/
	
	/* 상품 조회 페이지 */
	@Test
	public void goodsGetDetailTest() {
		
		int bookId = 150;
		
		BookVO result = mapper.goodsGetDetail(bookId);
		
		System.out.println("상품 조회 데이터 : " + result);
		
		
	}
	
}
