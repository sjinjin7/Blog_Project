package com.vam.service;

import java.util.List;

import com.vam.model.OrderDTO;
import com.vam.model.OrderPageItemDTO;

public interface OrderService {

	/* 주문 정보 */
	public List<OrderPageItemDTO> getGoodsInfo(List<OrderPageItemDTO> orders);	
	
	/* 주문 */
	public void  order(OrderDTO orw);	
	
}
