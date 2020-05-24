package com.hellokoding.springboot.restful.product;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ProductController {
    @GetMapping("/")
    public String list(){
        log.info("--- Product request");
        return "products";
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        log.info("--- Test request");
        return ResponseEntity.ok("Test!");
    }

}
