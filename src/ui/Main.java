package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> misTour = gestor.cargarTours("src/resources/tours.txt");

        System.out.println("LISTA DE TOURS");
        for (Tour t : misTour){
            System.out.println(t.toString());
        }
        System.out.println("\n--- FILTRADO: TOURS DE AVENTURA ---");
        for (Tour t : misTour) {
            if (t.getTipo().equalsIgnoreCase("Aventura")) {
                System.out.println("Encontrado: " + t.getNombre());
            }
        }

    }

}