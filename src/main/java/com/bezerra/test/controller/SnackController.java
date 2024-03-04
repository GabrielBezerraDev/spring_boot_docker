package com.bezerra.test.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezerra.test.services.SnackService;

@RestController
@RequestMapping("api/snack")
public class SnackController {
    
    private SnackService snackService;
    
    public SnackController(SnackService snackService){
        this.snackService = snackService;
    }
    
@PostMapping
private void postSnack(){
    this.snackService.saveSnack();
}

}
