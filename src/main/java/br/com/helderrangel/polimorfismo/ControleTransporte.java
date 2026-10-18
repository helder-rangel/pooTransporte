package br.com.helderrangel.polimorfismo;

import java.util.ArrayList;
import java.util.Random;

public class ControleTransporte {
    final static ArrayList<Transporte> listaTransporte = new ArrayList<>();


    public static void main(String[] args) {
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            Transporte transporteAtual = null;
            int num = gerador.nextInt(0, 3) + 1;
            System.out.println(num);
            switch (num) {
                case 1:
                    transporteAtual = new Onibus(gerador.nextInt(0, 20),    //quanidade de Paradas
                            gerador.nextInt(20, 90),                        // capacidade
                            gerador.nextDouble(5.00, 200.00)                //valorBase
                    );
                    break;
                case 2:
                    transporteAtual = new Taxi(gerador.nextDouble(0.1, 115),    //quilometragem
                            gerador.nextInt(2, 6),                        //capacidade
                            gerador.nextDouble(8.00, 800.00)             //valorBase
                    );
                    break;
                case 3:
                    transporteAtual = new Transporte(gerador.nextInt(1, 1000),    //capacidade
                            gerador.nextDouble(1.00, 1000000.00)  //valor base
                    );

            }
            listaTransporte.add(transporteAtual);
        }
        mostrarTarifas();
    }

    public static void mostrarTarifas() {
        if(listaTransporte == null){
            System.out.println("Lista vazia");
            return;
        }
        for (Transporte t : listaTransporte) {
            if (t instanceof Onibus) {
                System.out.println("Tarifa do Ônibus: ");
            } else if (t instanceof Taxi) {
                System.out.println("Tarifa do Ônibus: ");
            } else {
                System.out.println("Tarifa de Transporte: ");
            }
            System.out.printf("%.2f \n", t.calcularTarifa());
        }
    }
}