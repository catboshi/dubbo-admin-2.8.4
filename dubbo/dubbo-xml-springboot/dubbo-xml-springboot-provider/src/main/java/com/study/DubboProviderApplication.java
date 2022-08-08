package com.study;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Jackie Wang
 ** 项目名称：dubbo-xml-springboot-provider  
 * 类名称：DubboProviderApplication  
 * 类描述：springboot-dubbo启动类
 * 创建时间：2022年5月4日 下午8:47:04  
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.study"})
@ImportResource(locations = "classpath:provider.xml")
public class DubboProviderApplication implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DubboProviderApplication.class, args);
	}

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		// TODO Auto-generated method stub
		factory.setPort(getRandomPort());
	}
	
	public static int getRandomPort() {
		int portStart = 8000;
		int portEnd = 10000;
		Random r = new Random();
		int ra = r.nextInt(portEnd-portStart)+portStart;
		return ra;
		
	}

}
