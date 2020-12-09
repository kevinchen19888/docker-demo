package com.kevin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RestController
public class DockerDemoController {
    private final AtomicInteger count = new AtomicInteger(0);

    @GetMapping("/docker")
    public String helloDocker() {
        log.info("this is No:{} visit...", count.addAndGet(1));
        return "hello Docker!";
    }
}
