package com.kodilla.good.patterns.distributors;

public class Supplier {

    private String supplierName;
    private Order order;


    public Supplier(String supplierName, Order order) {
        this.supplierName = supplierName;
        this.order = order;

    }
}
