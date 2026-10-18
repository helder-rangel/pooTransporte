package br.com.helderrangel.polimorfismo;

import java.util.ArrayList;
import java.util.Random;

import net.datafaker.Faker;

public class ControleTransporte2 {
    private static ArrayList<Transporte> listaTransporte = new ArrayList<>();

    public static void main(String[] args) {
        TipoTransporte[] opcoes = TipoTransporte.values();
        Random gerador = new Random();
            for(int i =0; i<100; i++){
                //Sorteia uma das opções de Enum aleatoriamente
                TipoTransporte tipoSorteado = opcoes[gerador.nextInt(opcoes.length)];

                Transporte transporteAtual = switch (tipoSorteado) {
                    case ONIBUS -> new Onibus(
                            gerador.nextInt(0,20),
                            gerador.nextInt(20,90),
                            gerador.nextDouble(5.00, 200.00)
                    );
                    case TAXI -> new Taxi(
                            gerador.nextDouble(0.1, 115),
                            gerador.nextInt(2,6),
                            gerador.nextDouble(8.00, 800.00)
                    );
                    case TRANSPORTE_GENERICO -> new Transporte(
                            gerador.nextInt(1, 1000),
                            gerador.nextDouble(1.00, 100000.00)
                    );
                };
                listaTransporte.add(transporteAtual);
            }
            mostrarTarifas();
    }
    private static void mostrarTarifas(){
        if(listaTransporte == null){
            System.out.println("Lista de transporte está vazia");
            return;
        }
        for(Transporte t: listaTransporte) {
            if(t instanceof Onibus){
                System.out.println("Tarifa de Ônibus");
            } else if(t instanceof Taxi) {
                System.out.println("Tarifa de Taxi");
            } else {
                System.out.println("Tarifa transporte genérico");
            }
        }
    }
}
