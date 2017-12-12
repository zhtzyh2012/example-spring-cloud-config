package com.qds.optimize.config.luck;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * spring cloud client
 *
 * @author neutron
 */
@ComponentScan("com.qds.optimize.config.luck.**")
@SpringBootApplication
public class LuckApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuckApplication.class, args);
	}

}
