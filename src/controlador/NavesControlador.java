package controlador;

import modelo.Nave;

import java.util.ArrayList;
import java.util.List;

public class NavesControlador {
    private List<Nave> naves = new ArrayList<>();
    private Nave nave;

    public void createNave(int id, String nombre, String pais, String tipo, int velocidadRegistrada) {
        Nave employee = new Nave(id, nombre, pais, tipo, velocidadRegistrada);
        naves.add(nave);
    }
    public Nave readNave(int id) {
        for (Nave nave : naves) {
            if (nave.getId() == id) {
                return nave;
            }
        }
        return null;
    }
    public void updateNave(int id, String nombre, String pais, String tipo, int velocidadRegistrada) {
        Nave nave = readNave(id);
        if (nave != null) {
            nave.setNombre(nombre);
            nave.setPais(pais);
            nave.setTipo(tipo);
            nave.setVelocidadRegistrada(velocidadRegistrada);
        }
    }
    public void deleteNave(int id) {
        Nave nave = readNave(id);
        if (nave != null) {
            naves.remove(nave);
        }
    }
    public List<Nave> getAllNave() {
        return naves;
    }
}

