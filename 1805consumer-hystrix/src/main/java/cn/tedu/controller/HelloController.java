package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.client.EurekaServiceFeign;

@RestController
public class HelloController {
	@Autowired //调用接口
	private EurekaServiceFeign feign;
	
	@GetMapping("/hello/{name}")
	@HystrixCommand(fallbackMethod="fallbackHello")
	public String hello(@PathVariable String name){
		return feign.hello(name);//调用服务提供者
	}
	
	public String fallbackHello(String name){
		return "tony";
	}
}
