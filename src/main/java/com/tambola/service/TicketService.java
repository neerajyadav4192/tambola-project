package com.tambola.service;

import com.tambola.dto.PageableResponse;
import com.tambola.entity.Ticket;

public interface TicketService {

    public void create(int n);

    //get all users
    PageableResponse<Ticket> getAll(int pageNumber, int pageSize, String sortBy, String sortDir);



    }

