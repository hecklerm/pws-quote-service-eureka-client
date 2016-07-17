package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class QuoteServiceApplication {
    @Autowired
    @Bean
    CommandLineRunner commandLineRunner(QuoteRepository quoteRepository) {
        return args->{
            quoteRepository.save(new Quote("A target makes a poor impression.", "John Dunbar, Dances with Wolves"));
            quoteRepository.save(new Quote("All you need to create an asylum is an empty room and the right kind of people.", "Eugene Pallet in My Man Godfrey"));
            quoteRepository.save(new Quote("Tomorrow is another day.", "Scarlet O'Hara, Gone with the Wind"));

            quoteRepository.findAll().forEach(System.out::println);
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(QuoteServiceApplication.class, args);
	}
}
