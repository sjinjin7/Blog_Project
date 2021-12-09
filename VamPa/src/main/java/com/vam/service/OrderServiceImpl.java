package com.vam.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vam.mapper.OrderMapper;
import com.vam.model.OrderPageItemDTO;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<OrderPageItemDTO> getGoodsInfo(List<OrderPageItemDTO> orders) {

		List<OrderPageItemDTO> result = new ArrayList<OrderPageItemDTO>();		
		
		for(OrderPageItemDTO ord : orders) {
			
			OrderPageItemDTO goodsInfo = orderMapper.getGoodsInfo(ord.getBookId());			

			goodsInfo.setBookCount(ord.getBookCount());	
			
			goodsInfo.initSaleTotal();			
			
			result.add(goodsInfo);			
		}		
		
		return result;
		
	}
	
	
	
}
