package modelo;

public class Nave {
    private int id;
    private String nombre;
    private String pais;
    private String tipo;
    private int velocidadRegistrada;

    public Nave(int id, String nombre, String pais, String tipo, int velocidadRegistrada) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.tipo = tipo;
        this.velocidadRegistrada = velocidadRegistrada;
    }

    public Nave() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidadRegistrada() {
        return velocidadRegistrada;
    }

    public void setVelocidadRegistrada(int velocidadRegistrada) {
        this.velocidadRegistrada = velocidadRegistrada;
    }


}
