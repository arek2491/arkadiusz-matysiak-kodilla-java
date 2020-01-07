package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Article article;
    private LocalDateTime orderDate;


    public OrderRequest(final User user, final Article article, final LocalDateTime orderDate) {
        this.user = user;
        this.article = article;
        this.orderDate = orderDate;

    }

    public User getUser() {
        return user;
    }

    public Article getArticle() {
        return article;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
