package com.gymatyas.wstr.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Article {

    @GeneratedValue
    @Id
    private Long Id;

    private String title;

    @Column(length = 5000)
    private String body;

    public Article(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Article() {

    }
}
