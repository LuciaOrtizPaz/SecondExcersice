interface Controlable {
    void encender();
    void apagar();
}

abstract class Vehiculo {
    protected int velocidadMaxima;

    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    abstract void mostrarTipo();
}

class Coche extends Vehiculo implements Controlable {
    public Coche(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    void mostrarTipo() {
        System.out.println("Coche");
    }

    void mostrarTipo(String mensaje) {
        System.out.println("Coche: " + mensaje);
    }

    @Override
    public void encender() {
        System.out.println("El coche está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El coche está apagado.");
    }
}

class Motocicleta extends Vehiculo implements Controlable {
    public Motocicleta(int velocidadMaxima) {
        super(velocidadMaxima);
    }

    @Override
    void mostrarTipo() {
        System.out.println("Motocicleta");
    }

    @Override
    public void encender() {
        System.out.println("La motocicleta está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La motocicleta está apagada.");
    }
}