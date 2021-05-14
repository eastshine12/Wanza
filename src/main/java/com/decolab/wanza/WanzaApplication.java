package com.decolab.wanza;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.decolab.wanza")
public class WanzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WanzaApplication.class, args);
	}

}
