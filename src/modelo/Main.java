package modelo;

public class Main {
    public static void main(String[] args) {
        boolean crearNave = true;

        if (crearNave) {
            Nave miNave = createNave();
            System.out.println("Id: " + miNave.getId());
            System.out.println("Nombre: " + miNave.getNombre());
            System.out.println("Pais: " + miNave.getPais());
            System.out.println("Tipo: " + miNave.getTipo());
            System.out.println("Velocidad registrada: " + miNave.getVelocidadRegistrada());
        }
    }

    public static Nave createNave() {
        Nave nave = new Nave();
        nave.setId(1);
        nave.setNombre("Nave espacial");
        nave.setPais("Estados Unidos");
        nave.setTipo("Exploración");
        nave.setVelocidadRegistrada(25000);
        return nave;
    }
}
