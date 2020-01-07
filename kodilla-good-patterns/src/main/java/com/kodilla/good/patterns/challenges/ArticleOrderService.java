package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ArticleOrderService implements OrderService {
    @Override
    public boolean order(User user, Article article, LocalDateTime orderDate) {
        return true;
    }
}
