package model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private double id;
    private int dni;
    private String name;
    private String surname;
    private List<Ticket> tickets;

    public Client() {
    }

    public Client(double id, int dni, String name, String surname) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.tickets = new ArrayList<Ticket>();
    }

    public void addTicket(Ticket newTicket) {
        tickets.add(newTicket);
    }

    public List<Ticket> getTickets() {
        return new ArrayList<Ticket>(tickets);
    }

    public double getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
