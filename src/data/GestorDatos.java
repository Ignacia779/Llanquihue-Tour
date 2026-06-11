package data;

import model.Tour;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorDatos {
    public ArrayList<Tour> cargarTours(String rutaArchivos){
        ArrayList<Tour> lista = new ArrayList<>();
        try{
            File archivo = new File(rutaArchivos);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()){
                String linea = lector.nextLine();

                String[] partes = linea.split(";");
                if (partes.length == 3){
                    String nombre = partes[0];
                    String tipo = partes[1];
                    int precio = Integer.parseInt(partes[2]);

                    lista.add(new Tour(nombre, tipo, precio));

                }
            }
            lector.close();
        } catch (Exception e) {
         System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }
}
