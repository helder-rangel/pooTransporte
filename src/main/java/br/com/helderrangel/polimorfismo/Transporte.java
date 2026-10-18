package br.com.helderrangel.polimorfismo;

public class Transporte {
    protected int capacidade;
    protected double valorBase;

    public Transporte(int capacidade, double valorBase){
        this.capacidade = capacidade;
        this.valorBase = valorBase;
    }

    public Transporte(){}

    public double calcularTarifa(){
        return valorBase;
    }

    public double getValorBase() {
        return valorBase;
    }
}
