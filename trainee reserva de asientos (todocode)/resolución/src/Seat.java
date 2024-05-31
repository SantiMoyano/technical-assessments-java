public class Seat {

    private String state;

    public Seat(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public void reserveSeat() {
        this.state = "X";
    }
}
