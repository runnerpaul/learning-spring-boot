package com.paulcarron.learningspringboot.learningspringboot;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {

    Flux<Employee> findByFirstName(Mono<String> name);

}
