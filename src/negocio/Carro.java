package negocio;

public class Carro {
    public int potencia;
    public double velocidad;

    public Carro(int potencia, double velocidad){
        this.potencia = potencia;
        this.potencia = velocidad;
    }

    public void acelerar(){
        velocidad += potencia;
    }

    void frenar(){
        velocidad /= 2;
    }
}
