package com.devian.store;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appname;


    @RequestMapping("/") // this annotation serve as a sending request to the root, it specifies as forward slash ("/")
    public String index(){
        System.out.println("Application Name : "+appname);
        return "index.html";
    }


}
