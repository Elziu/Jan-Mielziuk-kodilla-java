package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product apple = new Product("apple");
        Product pear = new Product("pear");
        Product orange = new Product("orange");

        Item item1 = new Item(apple, new BigDecimal(21500000),2);
        Item item2 = new Item(pear, new BigDecimal(12500000),1);
        Item item3 = new Item(orange, new BigDecimal(3200000),3);

        Invoice invoice1 = new Invoice("1234/11");
        Invoice invoice2 = new Invoice("4587/03");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item1);
        invoice2.getItems().add(item3);

        //When
        invoiceDao.saveAll(Arrays.asList(invoice1,invoice2));
        int invoice1Id = invoice1.getId();
        int invoice2Id = invoice2.getId();

        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);

        //CleanUp
        try {
            invoiceDao.deleteAll();
            itemDao.deleteAll();
            productDao.deleteAll();

        } catch (Exception e) {
            //do nothing
        }
    }
}