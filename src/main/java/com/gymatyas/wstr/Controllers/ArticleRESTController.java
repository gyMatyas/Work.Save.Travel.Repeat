package com.gymatyas.wstr.Controllers;

import com.gymatyas.wstr.Models.Article;
import com.gymatyas.wstr.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleRESTController {

    @Autowired
    private ArticleService articleService;


    @GetMapping(value = "/")
    public String index() {
        return "Hello Traveller!";
    }

    @PutMapping(value = "/articles")
    public Article createArticle(@RequestBody Article article) {
        return articleService.save(article);
    }

}
