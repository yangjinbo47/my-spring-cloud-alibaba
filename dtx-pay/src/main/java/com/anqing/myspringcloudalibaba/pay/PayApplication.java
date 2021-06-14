package com.anqing.myspringcloudalibaba.pay;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.anqing.myspringcloudalibaba.pay"})
@EnableDiscoveryClient
@EnableDistributedTransaction
@EnableFeignClients("com.anqing.myspringcloudalibaba.pay")
public class PayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayApplication.class, args);
	}

}

