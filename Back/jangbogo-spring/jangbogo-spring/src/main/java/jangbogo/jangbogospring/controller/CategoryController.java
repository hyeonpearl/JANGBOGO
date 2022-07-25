package jangbogo.jangbogospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/fruit")
    public ModelAndView fruit()
    {
        ModelAndView mav = new ModelAndView("category/fruit");
        return mav;
    }

    @GetMapping("/meat")
    public ModelAndView meat()
    {
        ModelAndView mav = new ModelAndView("category/meat");
        return mav;
    }

    @GetMapping("/seafood")
    public ModelAndView seafood()
    {
        ModelAndView mav = new ModelAndView("category/seafood");
        return mav;
    }

    @GetMapping("/vegeta")
    public ModelAndView vegeta()
    {
        ModelAndView mav = new ModelAndView("category/vegeta");
        return mav;
    }
}
