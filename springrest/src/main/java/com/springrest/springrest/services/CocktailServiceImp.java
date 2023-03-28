package com.springrest.springrest.services;

import com.springrest.springrest.entities.Cocktails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CocktailServiceImp implements CocktailService {

    List<Cocktails> list;
    public CocktailServiceImp (){

        list =new ArrayList<>();
        list..add(new Cocktails("145","Margerita","Cocktail Glass","Rub the rim of the glass with the lime slice to make the salt stick to it"))
    }



    @Override
    public List<Cocktails> getCocktails() {
        return list;
    }
}
