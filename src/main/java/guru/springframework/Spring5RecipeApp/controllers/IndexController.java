package guru.springframework.Spring5RecipeApp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index.html", ""})
    public String getIndexPage(){
        System.out.println("sdfsdf hhbkhk");
        return "index";
    }
}
