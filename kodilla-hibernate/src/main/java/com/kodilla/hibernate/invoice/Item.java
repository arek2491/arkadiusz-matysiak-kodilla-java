package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public class Item {

    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;
    private Product product;

    public Item() {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }


    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "Product_ID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
