package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

//    @Test
//    void testInvoiceDaoSave() {
//        //Given
//        Product product1 = new Product("Name1");
//        Product product2 = new Product("Name2");
//        Item item1 = new Item(product1, new BigDecimal(47856), 5, new BigDecimal(4785692));
//        Item item2 = new Item(product2, new BigDecimal(266589), 7, new BigDecimal(58964));
//        Invoice invoice1 = new Invoice(5, new ArrayList<>());
//        Invoice invoice2 = new Invoice(4, new ArrayList<>());
//
//        invoice1.getItems().add(item1);
//        invoice1.getItems().add(item2);
//
//        //When
//        invoiceDao.save(invoice1);
//        int id = invoice1.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.deleteById(id);
//    }
}
