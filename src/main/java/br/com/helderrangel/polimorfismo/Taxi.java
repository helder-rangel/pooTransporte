package br.com.helderrangel.polimorfismo;

public class Taxi extends Transporte{
    private double quilometragem;


    public Taxi(double quilometragem, int capacidade, double valorBase) {
        super(capacidade, valorBase);
        this.quilometragem = quilometragem;
    }

    @Override
    public double calcularTarifa(){
        return getValorBase() + (quilometragem * 2.00);
    }
}
