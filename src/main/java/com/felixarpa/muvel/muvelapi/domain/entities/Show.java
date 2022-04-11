package com.felixarpa.muvel.muvelapi.domain.entities;

import lombok.Data;

@Data
public class Show {
    private String id;
    private String name;
    private String rawDate;
    private ShowDate date;
    private Price ticketPrice;
    private Price travelPrice;
    private Price totalPrice;
}