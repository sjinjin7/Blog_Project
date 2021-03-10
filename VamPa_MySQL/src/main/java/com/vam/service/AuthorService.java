package com.vam.service;

import java.util.List;

import com.vam.model.AuthorVO;
import com.vam.model.Criteria;

public interface AuthorService {

	/* 작가 등록 */
	public void authorEnroll(AuthorVO author) throws Exception;	
	
	/* 작가 목록 */
	public List<AuthorVO> authorGetList(Criteria cri) throws Exception;
		
}
