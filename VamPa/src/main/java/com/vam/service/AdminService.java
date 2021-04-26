package com.vam.service;

import java.util.List;

import com.vam.model.BookVO;
import com.vam.model.CateVO;
import com.vam.model.Criteria;

public interface AdminService {

	/* 상품 등록 */
	public void bookEnroll(BookVO book);	
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();
	
	/* 상품 리스트 */
	public List<BookVO> goodsGetList(Criteria cri);
	
	/* 상품 총 개수 */
	public int goodsGetTotal(Criteria cri);		
	
	/* 상품 조회 페이지 */
	public BookVO goodsGetDetail(int bookId);	
	
	/* 상품 수정 */
	public int goodsModify(BookVO vo);		
	
}
