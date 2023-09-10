package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSeatModel {
    private String id;
    private String orderSeat;
    private double priceCommon;
    private double priceDetails;
}
