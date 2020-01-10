package com.kodilla.good.patterns.distributors;

public class NewSupplier implements OrderExecute{

   private String supplierName;
   private Order order;

   public NewSupplier(String supplierName, Order order) {
       this.supplierName = supplierName;
       this.order = order;
   }

    public void process() {
       System.out.println("Veryfying: " + new OrderRetreiever());
       System.out.println("Order Accepted");
    }
}
