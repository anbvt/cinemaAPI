package com.example.demo.dto;

import com.example.demo.entity.Bill;
import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Data
@Entity
public class BillDetailsDto extends Bill {
	@Column
    private String poster;
    @Column(name = "paymentmethod")
    private String paymentMethod;
    @Column(name = "starttime")
    private Time startTime;
    @Column(name = "showdate")
    private Date showDate;
    @Column(name = "movie")
    private String movieName;
    @Column(name = "movie_status")
    private int movieStatus;
    @Column(name = "language")
    private String languageName;
    @Column(name = "limitage")
    private int limitAge;
    @Column(name = "yearofmanufacture")
    private int yearOfManufacture;
    @Column
    private String country;
    @Column(name = "room")
    private String roomName;
    @Column(name = "branch")
    private String branchName;
    @Column(name = "branch_address")
    private String branchAddress;
    @Column(name = "customer")
    private String customerName;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "customer_email")
    private String customerEmail;
    @Column(name = "seats")
    private String seats;
    @Column(name = "topping")
    private String toppingName;
    @Column(name = "topping_totalprice")
    private double toppingTotalPrice;
    @Column(name = "ticket_totalprice")
    private double ticketTotalPrice;
    @Column(name = "ticket_vat")
    private double ticketVat;
    @Column(name = "ticket_quantity")
    private double ticketQuantity;
    @Column(name = "topping_quantity")
    private double toppingQuantity;
    @Column(name = "total_price")
    private double totalPrice;
    @Transient
    private List<TicketDto> tickets;
}
