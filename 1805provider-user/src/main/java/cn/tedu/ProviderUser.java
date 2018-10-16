package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient//标示这个服务是一个Eureka客户端
@SpringBootApplication
public class ProviderUser {
	public static void main(String[] args) {
		SpringApplication.run(ProviderUser.class, args);
	}
}
