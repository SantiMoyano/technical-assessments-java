import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {


    public static void main(String[] args) {
        final int MAXCOL = 10;
        final int MAXROW = 10;

        Seat[][] map = new Seat[MAXCOL][MAXROW];

        Map seatMap = new Map(map);

        seatMap.initializeMap();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = "";
            while (!input.equals("EXIT")) {
                System.out.println("Ingresa 'M' para ver el mapa, 'A' para reservar un asiento, o 'exit' para salir");
                input = reader.readLine().trim().toUpperCase();

                if (input.equals("M")) {
                    seatMap.printMap();
                } else if (input.equals("A")) {
                    int seatCol = -1;
                    int seatRow = -1;

                    while (seatCol < 0 || seatCol >= MAXCOL) {
                        System.out.println("Ingresa columna del asiento a ocupar (0 a " + (MAXCOL - 1) + ")");
                        try {
                            seatCol = Integer.parseInt(reader.readLine().trim());
                            if (seatCol < 0 || seatCol >= MAXCOL) {
                                System.out.println("Columna fuera de rango. Inténtalo de nuevo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Ingresa un número.");
                        }
                    }

                    while (seatRow < 0 || seatRow >= MAXROW) {
                        System.out.println("Ingresa fila del asiento a ocupar (0 a " + (MAXROW - 1) + ")");
                        try {
                            seatRow = Integer.parseInt(reader.readLine().trim());
                            if (seatRow < 0 || seatRow >= MAXROW) {
                                System.out.println("Fila fuera de rango. Inténtalo de nuevo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Ingresa un número.");
                        }
                    }

                    System.out.println("Columna: " + seatCol + " Fila: " + seatRow);

                    if (seatMap.seatIsEmpty(seatRow, seatCol)) {
                        seatMap.reserveSeat(seatRow, seatCol);
                        System.out.println("Asiento reservado: Columna: " + seatCol + " Fila: " + seatRow);
                    } else {
                        System.out.println("Asiento ocupado.");
                    }
                }
            }
        } catch (Exception exc) {
            System.out.print("Error: "+exc);
        }


    }
}