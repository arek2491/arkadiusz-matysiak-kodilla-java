package com.kodilla.good.patterns.challenges;

public class OrderMain {

    public static void main(String [] args) {

        OrderRequestRetreiever orderRequestRetreiever = new OrderRequestRetreiever();
        OrderRequest orderRequest = orderRequestRetreiever.retreieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new ArticleOrderService(), new ArticleOrderRepository());
        productOrderService.process(orderRequest);
    }
}
