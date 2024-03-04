package com.bezerra.test.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezerra.test.model.Test;

@RestController
@RequestMapping("api/test")
public class TestController {
    
@GetMapping
public Test getTest(){
    System.out.println("Estou pegando alguma coisa!");
    return new Test();
}

}
