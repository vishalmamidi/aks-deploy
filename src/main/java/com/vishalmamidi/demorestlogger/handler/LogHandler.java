package com.vishalmamidi.demorestlogger.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import static org.springframework.http.MediaType.APPLICATION_JSON;

@Component
@Slf4j
public class LogHandler {
    public Mono<ServerResponse> justLog(ServerRequest request) {
        log.info("logging: {}", request);
        return ServerResponse.status(HttpStatus.ACCEPTED)
                .contentType(APPLICATION_JSON)
                .body(Mono.just("Awasome!, Deploy Successfull.\ncurrent time:"+java.time.LocalDateTime.now().toString()), String.class);
    }
}