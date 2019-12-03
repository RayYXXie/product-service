package com.example.bookstore.vo;

public class BookStore {

    private String name;

    private String classify;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public BookStore(String name, String classify) {
        this.name = name;
        this.classify = classify;
    }
}
