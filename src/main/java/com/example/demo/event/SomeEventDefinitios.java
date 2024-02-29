package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

public class SomeEventDefinitios extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SomeEventDefinitios(Object source,String elop) {
		super(source);
		// TODO Auto-generated constructor stub
		System.out.println("inside the constructor :"+elop);
	}

}
