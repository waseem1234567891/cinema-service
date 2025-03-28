package com.example.LambdaDemo5.controller;


import com.example.LambdaDemo5.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/cinema")
public class TicketController {

    List<Ticket> ticketList=new ArrayList<>();
    @PostMapping(path = "/ticket")
    public Ticket addTicket(@RequestBody Ticket ticket)
    {

        ticketList.add(ticket);
        return ticket;
    }
    @GetMapping(path = "/ticket")
    public List<Ticket> getTicketList()
    {
        return ticketList;
    }
}
