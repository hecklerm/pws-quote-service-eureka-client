package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by markheckler on 7/14/16.
 */
@Entity
public class Quote {
    @Id
    @GeneratedValue
    private Long id;
    private String text;
    private String source;

    public Quote() { // JPA & JSON
    }

    public Quote(String text, String source) {
        this.text = text;
        this.source = source;
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "com.example.Quote{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
