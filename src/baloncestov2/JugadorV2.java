package baloncestov2;

import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class JugadorV2 {

    private String nombre;
    private int edad;
    private int dorsal;
    private int[] puntosAnotados = new int[5];

    public JugadorV2() {
        this.nombre = "noName";
        this.edad = 0;
        this.dorsal = 0;

    }

    public JugadorV2(String nombre, int edad, int dorsal) {
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int[] getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int[] puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public int getPuntosTotales() {
        int puntosTotales = 0;

        for (int i = 0; i < puntosAnotados.length; i++) {
            puntosTotales += puntosAnotados[i];
        }

        return puntosTotales;
    }

    public void setPuntos(int puntos, int pos) {

        if (pos >= 0 && pos < puntosAnotados.length) {
            this.puntosAnotados[pos] = puntos;
        } else {
            System.out.println("Partido fuera de rango.");
        }

    }
    
    public void mostrarInformacion(){

            
                System.out.println("Nombre: " + getNombre());
                System.out.println("Edad: " + getEdad());
                System.out.println("Dorsal: " + getDorsal());
                for (int i = 0; i < puntosAnotados.length; i++) {
                System.out.println("Partido " + i + " Puntos anotados: " + puntosAnotados[i]);
                    
                }
                System.out.println("Puntos totales: " + getPuntosTotales());
            
    }
}
