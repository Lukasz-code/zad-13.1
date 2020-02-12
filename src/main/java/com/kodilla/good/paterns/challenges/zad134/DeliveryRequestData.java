package com.kodilla.good.paterns.challenges.zad134;

import java.time.LocalDateTime;

public class DeliveryRequestData {

    public DeliveryRequest data () {

        Customer customer = new Customer ("Dan McDan", "kiele Paczesiów");
        OrderList orderList = new OrderList();
        orderList.add(new Product("salad"));
        orderList.add(new Product("Gluten Free Bread"));
        orderList.add(new Product("fat free cheese"));

        LocalDateTime deliveryDate = LocalDateTime.of(2020,02,20,16,00);

        return new DeliveryRequest(customer, orderList, deliveryDate);
    }


}
