package com.gymatyas.wstr.Controllers;

import com.gymatyas.wstr.Models.Article;
import com.gymatyas.wstr.Services.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleRESTController {

    @Autowired
    private ArticleService articleService;


    @GetMapping(value = "/")
    public String index() {
        return "Hello Traveller!";
    }

    @PostMapping(value = "/articles")
    public Article createArticle(@RequestBody Article article) {
        return articleService.save(article);
    }

    @GetMapping(value = "/articles")
    public List<Article> getAllArticles() {
        return articleService.getAll();
    }

    @DeleteMapping(value = "/articles/{id:\\d+}")
    public String deleteArticle(@PathVariable Long id) {
        boolean toDelete = articleService.isArticleExists(id);
        if (toDelete) {
            articleService.delete(id);
            return "Deleted";
        }
        return "Article does not exist.";
    }

    @GetMapping(value = "/articles/{id:\\d+}")
    public Article getArticle(@PathVariable Long id) {
        if (!articleService.isArticleExists(id)) {
            return null;
        }
        return articleService.getArticle(id);
    }

    @PutMapping(value = "/articles/{id:\\d+}")
    public Article updateArticle(@PathVariable Long id, @RequestBody Article updated ) {
        return articleService.updateArticle(id, updated);
    }

}
