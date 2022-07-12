package jangbogo.jangbogospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {

    @GetMapping("/category/fruit")
    public String fruit()
    {
        return "category/fruit";
    }

    @GetMapping("/category/meat")
    public String meat()
    {
        return "category/meat";
    }

    @GetMapping("/category/seafood")
    public String seafood()
    {
        return "category/seafood";
    }

    @GetMapping("/category/vegeta")
    public String vegeta()
    {
        return "category/vegeta";
    }
}
