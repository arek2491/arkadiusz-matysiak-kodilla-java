package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;



    @Test
    public void testInvoiceDaoSave() {

        Product product = new Product("Unknown product 1");
        Product product2 = new Product("Unknown product 2");
        Product product3 = new Product("Unknown product 3");
        Item item = new Item(new BigDecimal(120), 15, new BigDecimal(120));
        Item item2 = new Item(new BigDecimal(200), 40, new BigDecimal(200));
        Item item3 = new Item(new BigDecimal(300), 100, new BigDecimal(300));
        Invoice invoice = new Invoice("1/2020");

        item.setProduct(product);
        item2.setProduct(product2);
        item3.setProduct(product3);
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        invoice.setItems(invoice.getItems());
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Assert.assertNotEquals(0, id);

        //invoiceDao.deleteById(id);









    }


}
