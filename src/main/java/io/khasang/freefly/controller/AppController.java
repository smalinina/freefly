package io.khasang.freefly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//controller MVC
@Controller
public class AppController {

    @RequestMapping("/")
    public String getHelloPage(){
        return "hello";
    }

}
