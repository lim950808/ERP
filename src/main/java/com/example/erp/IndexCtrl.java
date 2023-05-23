package com.example.erp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexCtrl {

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
