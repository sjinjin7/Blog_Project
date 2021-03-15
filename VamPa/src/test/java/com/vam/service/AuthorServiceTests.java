package com.vam.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vam.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AuthorServiceTests {
	
	/*AuthoreService 의존성 주입*/
	@Autowired
	private AuthorService service;
	
	/* 작가 등록 테스트 */
	/*
	@Test
	public void authorEnrollTest() throws Exception {

		AuthorVO author = new AuthorVO();
		
		author.setNationId("01");
		author.setAuthorName("테스트");
		author.setAuthorIntro("테스트 소개");
		
		service.authorEnroll(author);
		
	}
	*/
	
	/* 작가 목록 구현 */
	/*
	@Test	
	public void authorGetListTest() throws Exception{
		
		Criteria cri = new Criteria(3, 10);
		
		List list = service.authorGetList(cri);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list" + i + "......." + list.get(i));
		}
		
	}
	*/
	
	/*작가 상세 페이지*/
	@Test
	public void authorGetDetailTest() throws Exception{
		
		int authorId = 20;
		
		System.out.println("author......" + service.authorGetDetail(authorId));
				
	}

}
