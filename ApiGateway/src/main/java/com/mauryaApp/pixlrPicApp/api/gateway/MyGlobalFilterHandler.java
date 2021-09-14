package com.mauryaApp.pixlrPicApp.api.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import reactor.core.publisher.Mono;

@Configuration
public class MyGlobalFilterHandler {
	
	final Logger logger = LoggerFactory.getLogger(MyGlobalFilterHandler.class);
	
	@Order(1)
	@Bean
	public GlobalFilter secondPreFilter() {
		
		return (exchange, chain) ->{
			logger.info("My Second global pre-filter is excecuted");
			
				return chain.filter(exchange).then(Mono.fromRunnable(()->{
					logger.info("My Second global post-filter is excecuted");
				}));
		};
	}
	
	@Order(2)
	@Bean
	public GlobalFilter thirdPreFilter() {
		
		return (exchange, chain) ->{
			logger.info("My Third global pre-filter is excecuted");
			
				return chain.filter(exchange).then(Mono.fromRunnable(()->{
					logger.info("My Third global post-filter is excecuted");
				}));
		};
	}
	
	@Order(3)
	@Bean
	public GlobalFilter fourthPreFilter() {
		
		return (exchange, chain) ->{
			logger.info("My Fourth global pre-filter is excecuted");
			
				return chain.filter(exchange).then(Mono.fromRunnable(()->{
					logger.info("My Fourth global post-filter is excecuted");
				}));
		};
	}

}
