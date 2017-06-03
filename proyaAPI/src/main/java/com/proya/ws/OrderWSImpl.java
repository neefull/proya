package com.proya.ws;

import com.proya.bean.Order;

import javax.jws.WebService;


@WebService
public class OrderWSImpl implements OrderWS {

	
	public OrderWSImpl()  {
		System.out.println("OrderWSImpl()");
	}
	
	@Override
	public Order getOrderById(int id) {
		System.out.println("server getOrderById() "+id);
		return new Order(id, "飞机", 10000000);
	}

}
