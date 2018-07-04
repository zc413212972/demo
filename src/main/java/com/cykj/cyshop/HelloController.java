package com.cykj.cyshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
    @GetMapping("/say")
    public String say(@PathVariable("id") Integer id){
        return "id:"+id;
    }
}
