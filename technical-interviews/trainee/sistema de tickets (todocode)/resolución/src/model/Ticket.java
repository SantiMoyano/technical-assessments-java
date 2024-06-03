package model;

import java.time.LocalDate;

public class Ticket {

    private int number;
    private int row;
    private int seat;
    private double price;
    private LocalDate buyDate;
    private LocalDate validateDate;
    private Client client;

    public Ticket(int number, int row, int seat, double price, LocalDate buyDate, LocalDate validateDate, Client client) {
        this.number = number;
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.buyDate = buyDate;
        this.validateDate = validateDate;
        this.client = client;
    }

    public Ticket() {
    }

    public int getNumber() {
        return number;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public LocalDate getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(LocalDate validateDate) {
        this.validateDate = validateDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", row=" + row +
                ", seat=" + seat +
                ", price=" + price +
                ", buyDate=" + buyDate +
                ", validateDate=" + validateDate +
                ", client=" + client.getName() +
                '}';
    }
}
