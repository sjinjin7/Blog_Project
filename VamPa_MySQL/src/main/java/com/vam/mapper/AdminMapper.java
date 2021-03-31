package com.vam.mapper;

import java.util.List;

import com.vam.model.BookVO;
import com.vam.model.CateVO;

public interface AdminMapper {

	/* 상품 등록 */
	public void bookEnroll(BookVO book);
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();	
	
}