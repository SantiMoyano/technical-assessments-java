package main;

import model.Client;
import model.Ticket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client(1, 51702139, "Santiago", "Moyano");
        Client client2 = new Client(2, 51702139, "Martín", "Morales");

        Ticket ticket1 = new Ticket(
                1, 1, 1, 20.0, LocalDate.now(), LocalDate.now().plusDays(1), client1);
        Ticket ticket2 = new Ticket(
                2, 2, 1, 40.0, LocalDate.now(), LocalDate.now().plusDays(1), client1);
        Ticket ticket3 = new Ticket();
        ticket3.setNumber(1);
        ticket3.setRow(1);
        ticket3.setSeat(5);
        ticket3.setPrice(80.0);
        ticket3.setBuyDate(LocalDate.now());
        ticket3.setValidateDate(LocalDate.now().plusDays(1));
        ticket3.setClient(client2);

        client1.addTicket(ticket1);
        client1.addTicket(ticket2);
        client2.addTicket(ticket3);

        System.out.println("Tickets del cliente: " +client2.getTickets());

        List<Ticket> ticketList = new ArrayList<Ticket>();

        ticketList.add(ticket1);
        ticketList.add(ticket2);
        ticketList.add(ticket3);

        double total = sumTicketPrices(ticketList);

        System.out.println("Suma de precios de los tickets: " + total);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String input = "";
            System.out.println("Ingresa la fila de los tickets que deseas ver: ");
            int row = Integer.parseInt(reader.readLine().trim());
            List<Ticket> ticketsFromRow = ticketsFromRow(ticketList, row);
            System.out.println("Datos de los tickets: ");
            for (Ticket ticket: ticketsFromRow) {
                System.out.println(ticket.toString());
            }
        } catch (Exception exc) {
            System.out.println("Error: "+ exc);
        }
    }

    public static List<Ticket> ticketsFromRow(List<Ticket> ticketList, int row) {
        List<Ticket> ticketListResult = new ArrayList<Ticket>();
        for (Ticket ticket : ticketList) {
            if (ticket.getRow() == row)
                ticketListResult.add(ticket);
        }
        return ticketListResult;
    }

    public static double sumTicketPrices(List<Ticket> ticketList) {
        double total = 0;
        for (Ticket ticket : ticketList) {
            total += ticket.getPrice();
        }
        return total;
    }
}