package salary.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import salary.service.SalaryHandler;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Component
public class SalaryRouter {

    @Bean
    RouterFunction<ServerResponse> composedRoutes(SalaryHandler salaryHandler){
        return
            route(GET("/salary/{id}"), salaryHandler::findById)
            .andRoute(GET("/salary"),salaryHandler::salaryView)
            .andRoute(GET("/salaryAll"),salaryHandler::findAll);
    }


}
