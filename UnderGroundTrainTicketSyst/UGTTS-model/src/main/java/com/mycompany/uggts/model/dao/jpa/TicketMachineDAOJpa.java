/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uggts.model.dao.jpa;


import com.mycompany.model.dto.Ticket;
import java.util.List;

/**
 *
 * @author manop
 */
public interface TicketMachineDAOJpa {

    public List<Ticket> getTicket();

    

    public void insertMoney(int amount);

    public void printTicket();
}
