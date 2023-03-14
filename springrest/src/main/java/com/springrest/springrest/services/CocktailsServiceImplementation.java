package com.springrest.springrest.services;

import org.springframework.stereotype.Service;
import src.main.java.com.springrest.springrest.entities.Cocktails;

import java.util.ArrayList;
import java.util.List;


@Service
public class CocktailsServiceImplementation implements CocktailsService{

    List<Cocktails> list;
    public CocktailsServiceImplementation(){

        list =new ArrayList<>();
       list.add("23b3d85a-3928-41c0-a533-6538a71e17c4","Margerita","Cocktail glass","Rub the rim of the glass with the lime slice to make the salt stick to it. Take care to moisten..",
               "https://www.thecocktaildb.com/images/media/drink/wpxpvu1439905379.jpg"));


    }


    @Override
    public List<Cocktails> getCocktails() {
        return list;
    }
}
