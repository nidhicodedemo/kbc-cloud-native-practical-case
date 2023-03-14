package com.springrest.springrest.controller;


import com.springrest.springrest.services.CocktailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.com.springrest.springrest.entities.Cocktails;

import java.util.List;

@RestController
public class MyController {


    @Autowired
    public CocktailsService cocktailsService;

    }


    @GetMapping ("/search")
    public String search()

    {
        return "This is cocktail";
    }


    //get the list of cocktails
    @GetMapping("/search")
    public List<Cocktails> getCocktails()

    {

        return this.cocktailsService.getCocktails();

    }
}




