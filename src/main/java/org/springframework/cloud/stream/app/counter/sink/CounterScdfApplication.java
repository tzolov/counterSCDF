package org.springframework.cloud.stream.app.counter.sink;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CounterSinkConfiguration.class)
@Slf4j
public class CounterScdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterScdfApplication.class, args);
		LOGGER.info("shipra :: ");
	}

}
