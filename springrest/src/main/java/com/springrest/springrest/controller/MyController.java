package com.springrest.springrest.controller;



import com.springrest.springrest.entities.Cocktails;
import com.springrest.springrest.services.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MyController {

    @Autowired
    public CocktailService  cocktailService;


    @GetMapping ("/cocktails")
    public String search(@RequestParam String search)

    {
        return "this is Cocktail API";
    }

//get the list of cocktails -create a method to return the list of cocktails, map it to the GET HTTP method.



    @GetMapping ("/cocktails")
    public String search(@RequestParam String search)
    public List<Cocktails> getCocktails ()
    {


return this.cocktailService.getCocktails();



    }


}




