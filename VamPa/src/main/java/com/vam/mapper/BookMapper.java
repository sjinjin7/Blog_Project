package com.vam.mapper;

import java.util.List;

import com.vam.model.BookVO;
import com.vam.model.Criteria;

public interface BookMapper {

	/* 상품 검색 */
	public List<BookVO> getGoodsList(Criteria cri);
	
	/* 상품 총 갯수 */
	public int goodsGetTotal(Criteria cri);		
	
}
