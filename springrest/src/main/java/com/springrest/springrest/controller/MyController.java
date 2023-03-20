package com.springrest.springrest.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class MyController {
    @GetMapping ("/cocktails")
    public String search(@RequestParam String search)

    {



        return "this is Cocktail API";
    }



}




