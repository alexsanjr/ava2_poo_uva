package app;

import entities.Aviao;
import entities.Navio;
import entities.Transporte;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Transporte> transportes = new ArrayList<>();

        try {

            for (int i = 1; i <= 10; i++) {
                transportes.add(new Aviao());
                transportes.add(new Navio());
            }

            int n = 1;
            for (Transporte transporte : transportes) {
                transporte.entrada(n);
                n++;
            }

            n = 1;
            for (Transporte transporte : transportes) {
                transporte.imprimir(n);
                n++;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
