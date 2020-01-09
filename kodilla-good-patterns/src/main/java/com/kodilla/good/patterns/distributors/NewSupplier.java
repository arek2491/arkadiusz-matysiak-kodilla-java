package com.kodilla.good.patterns.distributors;

public class NewSupplier implements OrderExecute{

   private Supplier supplier;

   public NewSupplier(Supplier supplier) {
       this.supplier = supplier;
   }

    public void process() {
       System.out.println("Veryfying: " + new OrderRetreiever());
       System.out.println("Order Accepted");
    }
}
