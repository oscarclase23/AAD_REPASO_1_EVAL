package com.example.aad_repaso_1_eval.Tema1.WildCard;
/*
Ejercicio 5: El Comodín "Selectivo" (Wildcard con Extends) 🎯
Nivel: Avanzado - El favorito de los exámenes

Ahora vamos a mezclar lo que aprendiste en el Ejercicio 2 (extends Number) con lo que acabas de hacer (?).

En el archivo WildCardRestringido.java de tu profesor, hay un método llamado sumarLista. Vamos a recrear esa lógica.

El Problema: Con List<?> tratamos todo como Object, así que no podemos sumar (+) ni multiplicar, porque los Objetos no se suman. Queremos un método que acepte cualquier lista de números (ya sean Integer, Double, Float) y los sume.

1. La Clase: Sigue usando Utilidades o crea una nueva Calculadora.

2. El Método:

Crea un método estático sumarValores.

El Parámetro: Necesitamos una lista de "algo que sea un Número o hijo de Número".

Sintaxis: List<? extends Number> lista.

El Bucle:

Ahora, dentro del for, ya no usas Object. ¿Qué tipo garantiza Java que hay ahí dentro? ¡Number!

Usa: for (Number num : lista) { ... }

La Lógica:

Crea una variable double total = 0;.

Suma los valores. Recuerda que Number tiene el método .doubleValue() para unificarlos todos a decimales.

3. El Main:

Crea una List<Integer> (ej: 2, 4, 6). Llama al método.

Crea una List<Double> (ej: 1.5, 2.5). Llama al método.

Imprime los resultados.
*/
import java.util.List;

public class Calculadora {

    public static void sumarValores(List<? extends Number> lista){ // Os fillos de Number (Integer, Double, etc)
    
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
