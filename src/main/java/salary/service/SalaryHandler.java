package salary.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import salary.dao.SalaryRepository;
import salary.entity.Salary;

@Component
@RequiredArgsConstructor
public class SalaryHandler {

    //Handler가 mvc에서 controller역할을 해준다.

    private final SalaryRepository salaryRepository;

    public Mono<ServerResponse> findById(ServerRequest serverRequest){
        String id = serverRequest.pathVariable("id");
        Mono<Salary> salary = salaryRepository.findById(Long.valueOf(id));
        return ServerResponse.ok().body(salary,Salary.class);
    }

    public Mono<ServerResponse> salaryView(ServerRequest request) {
        return ServerResponse.ok().render("/main");
    }

    public Mono<ServerResponse> findAll(ServerRequest serverRequest) {
        Flux<Salary> salary = salaryRepository.findAll();
        return ServerResponse.ok().body(salary,Salary.class);
    }
}
