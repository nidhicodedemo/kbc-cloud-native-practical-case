package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocktailAPIController {


    @GetMapping("/cocktails")
    public String search(@RequestParam String search)

    {



        return "Cocktail API";
    }


}
