package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetreiever {

    public OrderRequest retreieve() {
        User user = new User("Arkadiusz" , "Matysiak");
        Article article = new Article("Toothbrush" , 2);
        LocalDateTime orderDate = LocalDateTime.of(2020, 1,2,10,36);

        return new OrderRequest(user, article, orderDate);
    }

}
