package petru.springframework.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
         System.out.println("Some message..12345");
        return "index";
    }
}
