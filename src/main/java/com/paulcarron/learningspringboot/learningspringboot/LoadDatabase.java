package com.paulcarron.learningspringboot.learningspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init (ChapterRepository repository) {
        return args -> {
            Flux.just(
                    new Chapter("Quick Start With Java"),
                    new Chapter("Reactive Web With Spring Boot"),
                    new Chapter("... and more"))
                    .flatMap(repository::save)
                    .subscribe(System.out::println);
        };
    }
}
