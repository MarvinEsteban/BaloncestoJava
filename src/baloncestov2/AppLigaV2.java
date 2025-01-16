package baloncestov2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class AppLigaV2 {

    ArrayList<JugadorV2> jugadores = new ArrayList<>();

    public static void main(String[] args) {

        AppLigaV2 liga = new AppLigaV2();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean exit = false;

        liga.loadPlayers();

        do {

            System.out.println("===========================");
            System.out.println("Stucom Basquet Club");
            System.out.println("===========================");
            System.out.println("");
            System.out.println("1) Consultar jugador");
            System.out.println("2) Calcular puntos totales");
            System.out.println("3) Anotar puntos");
            System.out.println("4) Mostrar maximo anotador");
            System.out.println("5) Salir");
            System.out.println("--------------------------------------");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    liga.consultPlayer();
                    break;

                case 2:
                    liga.calcularTotalDePuntos();
                    break;

                case 3:
                    liga.anotarPuntos();
                    break;

                case 4:
                    liga.calcularMaximoAnotador();
                    break;

                case 5:
                    exit = true;
                    break;
            }
        } while (!exit);

    }

    //creación de 3 jugadores
    public void loadPlayers() {

        JugadorV2 jugador1 = new JugadorV2("Shaq", 18, 5);
        JugadorV2 jugador2 = new JugadorV2("Stephen", 20, 1);
        JugadorV2 jugador3 = new JugadorV2("Kobe", 19, 5);

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);

    }

    public void consultPlayer() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge un jugador: ");

        String player = sc.nextLine();
        for (JugadorV2 jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(player)) {
                jugador.mostrarInformacion();
            }
        }
    }

    public void calcularTotalDePuntos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge un jugador: ");

        String player = sc.nextLine();
        for (JugadorV2 jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(player)) {
                System.out.println("Los puntos totales anotados por " + jugador.getNombre() + " son " + jugador.getPuntosTotales());
            }
        }

    }

    public void anotarPuntos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge un jugador: ");

        String player = sc.nextLine();
        for (JugadorV2 jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(player)) {
                System.out.println("Escoge un partido(0-4):");
                int partido = sc.nextInt();

                System.out.println("Cuantos puntos?");
                int puntos = sc.nextInt();

                jugador.setPuntos(puntos, partido);
            }
        }
    }

    public void calcularMaximoAnotador() {
        int puntosMaximos = 0;

        for (JugadorV2 jugador : jugadores) {

            if (jugador.getPuntosTotales() > puntosMaximos) {
                puntosMaximos = jugador.getPuntosTotales();

            }

        }
        for (JugadorV2 jugador : jugadores) {
            if (jugador.getPuntosTotales() == puntosMaximos) {
                System.out.println("El maximo anotador es " + jugador.getNombre());
            }
        }
    }

}
