package com.proya.ws;


import com.proya.bean.Order;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderWS {

	@WebMethod
    Order getOrderById(int id);
}
