package com.vam.mapper;

import com.vam.model.OrderPageItemDTO;

public interface OrderMapper {

	/* 주문 상품 정보 */	
	public OrderPageItemDTO getGoodsInfo(int bookId);	
	
}
