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

    public void delete(long toDelete) {
        repository.deleteById(toDelete);
    }

    public Article getArticle(long id) {
        return repository.getOne(id);
    }

    public boolean isArticleExists(long id) {
        return repository.existsById(id);
    }

    public Article updateArticle(Long id, Article updated) {
        if (isArticleExists(id)) {
            Article toUpdate = getArticle(id);
            toUpdate.setBody(updated.getBody());
            toUpdate.setTitle(updated.getTitle());
            return save(toUpdate);
        }
        return null;
    }
}
