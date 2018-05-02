package com.gymatyas.wstr.Services;

import com.gymatyas.wstr.Models.Article;
import com.gymatyas.wstr.Repositories.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    public List<Article> getAll() {
        return repository.findAll();
    }

    public Article save(Article toSave) {
        return repository.save(toSave);
    }

}
