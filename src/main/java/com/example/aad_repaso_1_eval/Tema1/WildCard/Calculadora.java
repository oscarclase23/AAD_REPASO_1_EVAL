package com.example.aad_repaso_1_eval.Tema1.WildCard;

import java.util.List;

public class Calculadora {

    public static void sumarValores(List<? extends Number> lista){
    
        double total = 0;

        for(Number numero : lista){
            total = numero.doubleValue()+total;
        }
        System.out.println("Total: "+total);
    }  

    public static void main(String[] args) {
        sumarValores(List.of(1,2,3,4,5));
        sumarValores(List.of(1.0,1.2,1.3));
    }
}
