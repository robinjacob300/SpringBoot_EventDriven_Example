package com.example.demo.event;

import org.springframework.context.ApplicationEvent;

public class Please<S, T extends GenericBook<S>> extends ApplicationEvent{

	/**
	 * 
	 */
	T datas;
	private static final long serialVersionUID = 1L;

	public Please(Object source,T datao) {
		super(source);
		// TODO Auto-generated constructor stub
		System.out.println("Inside Generic code");
		datas=datao;
		System.out.println( "our T data is "+ datas.getData());
	}

}
