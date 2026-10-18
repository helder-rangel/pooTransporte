package br.com.helderrangel.polimorfismo;

public class Onibus extends Transporte {
    private int quantidadeParadas;

    public Onibus(int quantidadeParadas, int capacidade, double valorBase) {
        super(capacidade, valorBase);
        this.quantidadeParadas = quantidadeParadas;
    }

    @Override
    public double calcularTarifa(){
        return getValorBase() + (quantidadeParadas * 0.50);
    }


}
