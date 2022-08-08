package com.study.server;

import org.springframework.stereotype.Service;

import com.study.service.DubboService;

@Service("dubboService")
public class DubboServiceImpl implements DubboService{

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "hello"+name;
	}
	
}
