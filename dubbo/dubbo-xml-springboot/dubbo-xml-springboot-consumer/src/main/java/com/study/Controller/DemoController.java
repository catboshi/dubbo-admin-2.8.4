package com.study.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.study.service.DubboService;
@RestController
public class DemoController {
	@Autowired
	private DubboService dubboService; 
	
	@RequestMapping("/sayHello")
	public String sayHello(@RequestParam String name) {
		return dubboService.sayHello(name);
	}

}
