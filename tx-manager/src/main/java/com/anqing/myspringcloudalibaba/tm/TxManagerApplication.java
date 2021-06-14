package com.anqing.myspringcloudalibaba.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxManagerApplication.class, args);
	}

}

