public class Map {
    private Seat[][] map;
    private int maxCol;
    private int maxRow;

    public Map(Seat[][] map) {
        this.map = map;
        this.maxCol = map[0].length;
        this.maxRow = map[0].length;
    }

    public void initializeMap() {
        for (int i = 0; i < maxCol; i++) {
            for (int j = 0; j < maxRow; j++) {
                Seat seat = new Seat("L");
                map[i][j] = seat;
            }
        }
    }

    public void printMap() {
        System.out.println("Map:");
        for (int i = 0; i < maxCol; i++) {
            System.out.print("|");
            for (int j = 0; j < maxRow; j++) {
                System.out.print(map[i][j].getState());
                if (j != map[i].length - 1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }

    public boolean seatIsEmpty(int seatCol, int seatRow) {
        Seat seat = map[seatCol][seatRow];
        String seatState = seat.getState();
        return !seatState.equals("X");
    }

    public void reserveSeat(int seatCol, int seatRow) {
        Seat seat = map[seatCol][seatRow];
        seat.reserveSeat();
    }
}
