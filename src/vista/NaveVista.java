package vista;

import modelo.Nave;

import java.util.List;

public class NaveVista {
    public void printNaveDetails(int id, String nombre, String pais, String tipo, int velocidadRegistrada) {
        System.out.println("Id: " + id);
        System.out.println("nombre: " + nombre);
        System.out.println("pais: " + pais);
        System.out.println("tipo: " + tipo);
        System.out.println("velocidad registrada: " + velocidadRegistrada);
    }

    public void printAllNave(List<Nave> naves) {
        for (Nave nave : naves) {
            printNaveDetails(nave.getId(), nave.getNombre(), nave.getPais(), nave.getTipo(), nave.getVelocidadRegistrada());
        }
    }
}
