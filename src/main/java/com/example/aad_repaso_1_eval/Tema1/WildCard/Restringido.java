package com.example.aad_repaso_1_eval.Tema1.WildCard;

import java.util.ArrayList;
import java.util.List;

/*
Ejercicio 6: El Rellenador (Wildcard con Super)
Mira el archivo WildCardRestringido.java de tu profesor. Ahí usa ? super Integer. Vamos a replicarlo.

1. La Clase: Sigue con Calculadora o Utilidades.

2. El Método:

Crea un método estático agregarTresNumeros.

Parámetro: List<? super Integer> lista.

Traducción: "Acepto cualquier lista, siempre que sea de Integers o de sus padres (Number, Object)".

Cuerpo:

Añade el número 1 a la lista.

Añade el número 2 a la lista.

Añade el número 3 a la lista.

3. El Main:

Crea una List<Number> vacía (new ArrayList<Number>()). Pásasela al método.

Crea una List<Object> vacía (new ArrayList<Object>()). Pásasela al método.

Imprime las listas después para ver si se llenaron.
*/
public class Restringido {
    public static void agregarTresNumeros(List<? super Integer> lista){ //Aceptas ese tipo concreto ou o de un supertipo
        lista.add(2);
        lista.add(4);
        lista.add(2);
    }

    public static void main(String[] args) {
        List<Number> lista1 = new ArrayList<Number>();
        agregarTresNumeros(lista1);
        List<Object> lista2 = new ArrayList<Object>();
        agregarTresNumeros(lista2);

        System.out.println(lista1);
        System.out.println(lista2);
    }
}
