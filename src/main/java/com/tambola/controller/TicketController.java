package com.tambola.controller;

import com.tambola.dto.PageableResponse;
import com.tambola.entity.Ticket;
import com.tambola.service.TicketServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Scanner;

@RestController
@RequestMapping
public class TicketController {
    private Logger logger= LoggerFactory.getLogger(TicketController.class);


    @Autowired
    private TicketServiceImpl ticketService;

    @GetMapping("/ticketsets/{N}")
    public void createTickets(@PathVariable int N) throws IOException {


        ticketService.create(N);
        logger.info("All sets generated!!");

    }

    @GetMapping("/getTickets")
    public ResponseEntity<PageableResponse<Ticket>> getAlltickets(
            @RequestParam(value = "pageNumber", defaultValue = "0", required = false) int pageNumber,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = "id", required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir
    ) {
        return new ResponseEntity<>(ticketService.getAll(pageNumber, pageSize, sortBy, sortDir), HttpStatus.OK);
    }

    }

