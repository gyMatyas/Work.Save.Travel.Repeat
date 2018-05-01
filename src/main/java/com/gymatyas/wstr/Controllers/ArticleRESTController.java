package com.gymatyas.wstr.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleRESTController {

    @GetMapping(value = "/")
    public String index() {
        return "Hello Traveller!";
    }

}
