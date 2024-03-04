package com.bezerra.test.services;

import org.springframework.stereotype.Service;

import com.bezerra.test.model.Snack;
import com.bezerra.test.repository.SnackRepository;

@Service
public class SnackService {
    
    private SnackRepository snackRepository;

    public SnackService(SnackRepository snackRepository){
        this.snackRepository = snackRepository;
    }

    public Snack saveSnack(){
        Snack newSnack = new Snack();
        newSnack.setBeverage("Cerveja");
        newSnack.setMainSnack("Pizza");
        newSnack.setSideDish("Batata Frita");
        return this.snackRepository.save(newSnack);
    }

}
