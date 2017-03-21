package com.anfe0690.hotswapspringtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);
    
    @GetMapping("/")
    public String homeGet() {
        return "home";
    }
    
    /*@ResponseBody
    @GetMapping("/test")
    public String testGet() {
        return "test";
    }*/
    
    /*@ResponseBody
    @GetMapping("/testb")
    public String testBGet() {
        return "Test B";
    }*/
    
}
