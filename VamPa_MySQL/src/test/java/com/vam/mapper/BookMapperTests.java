package com.vam.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.BookVO;
import com.vam.model.CateFilterDTO;
import com.vam.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BookMapperTests {
	@Autowired
	private BookMapper mapper;
	/*
	@Test
	public void getGoodsListTest() {
		
		Criteria cri = new Criteria();
		// 테스트 키워드
		cri.setKeyword("test");
		System.out.println("cri : " + cri);
		
		List<BookVO> list = mapper.getGoodsList(cri);
		System.out.println("list : " + list);
		
		System.out.println("==========");
		int goodsTotal = mapper.goodsGetTotal(cri);
		System.out.println("totla : " + goodsTotal);
		
	}
	*/
	
	/* 작가 id 리스트 요청 */
	/*
	@Test
	public void getAuthorId() {
		
		String keyword = "폴";
		
		String[] list = mapper.getAuthorIdList(keyword);
		
		System.out.println("결과 : " + list.toString());
		
		for(String id : list) {
			System.out.println("개별 결과 : " + id);
		}
		
		
	}
	*/
	
	/* 카테고리 리스트 얻기 */
	/*
	@Test
	public void getCateListTest1() {
		
		Criteria cri = new Criteria();
		
		String type = "T";
		String keyword = "test";
		//String type = "A";
		//String keyword = "test";		

		cri.setType(type);
		cri.setKeyword(keyword);
		//cri.setAuthorArr(mapper.getAuthorIdList(keyword));		
		
		String[] cateList = mapper.getCateList(cri)		;
		for(String codeNum : cateList) {
			System.out.println("codeNum ::::: " + codeNum);
		}
		
		
	}
	*/
	
	
	/* 카테고리 정보 얻기 */	
	/*
	@Test
	public void getCateInfoTest1() {
		
		Criteria cri = new Criteria();
		
		String type = "TC";
		String keyword = "test";	
		String cateCode="104001";

		cri.setType(type);
		cri.setKeyword(keyword);
		cri.setCateCode(cateCode);
		
		mapper.getCateInfo(cri);
		
	}	
	*/
	/* 상품 정보 */
	@Test
	public void getGoodsInfo() {
		int bookId = 26;
		BookVO goodsInfo = mapper.getGoodsInfo(bookId);
		System.out.println("===========================");
		System.out.println(goodsInfo);
		System.out.println("===========================");
		
	}
	
	
	
	
}
