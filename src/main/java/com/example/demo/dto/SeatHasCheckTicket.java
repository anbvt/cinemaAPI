package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import org.seasar.doma.Column;
import org.seasar.doma.DomainConverters;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;

import com.example.demo.entity.Seat;

import lombok.Data;
import lombok.NoArgsConstructor;
// @DomainConverters({StringListConverter.class})
@Data
@NoArgsConstructor
@Entity
public class SeatHasCheckTicket extends Seat {
    /*
     * name of seat
     */
    @Column
    private String row;

    @Column
    private String seats;

}
