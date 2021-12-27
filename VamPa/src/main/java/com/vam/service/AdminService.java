package com.vam.service;

import java.util.List;

import com.vam.model.AttachImageVO;
import com.vam.model.BookVO;
import com.vam.model.CateVO;
import com.vam.model.Criteria;
import com.vam.model.OrderDTO;

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
	
	/* 상품 정보 삭제 */
	public int goodsDelete(int bookId);	
	
	/* 지정 상품 이미지 정보 얻기 */
	public List<AttachImageVO> getAttachInfo(int bookId);		
	
	/* 주문 상품 리스트 */
	public List<OrderDTO> getOrderList(Criteria cri);
	
	/* 주문 총 갯수 */
	public int getOrderTotal(Criteria cri);		
	
}
