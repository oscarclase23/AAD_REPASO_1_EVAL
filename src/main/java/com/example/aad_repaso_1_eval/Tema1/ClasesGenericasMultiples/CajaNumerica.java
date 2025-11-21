package com.example.aad_repaso_1_eval.Tema1.ClasesGenericasMultiples;

/*
 * Ejercicio 2: La Caja Numérica (Nivel Intermedio)
 * Objetivo: Restringir el tipo genérico para que solo acepte números y poder
 * operar con ellos.
 * 
 * En tu ejercicio anterior (Pareja), la K o la V podían ser cualquier cosa (un
 * String, un Coche, un Pokemon...). Ahora queremos crear una caja que SOLO
 * acepte números (Integer, Double, Float...) y que dé error si intentamos meter
 * un texto.
 * 
 * 1. La Clase:
 * 
 * Crea la clase CajaNumerica con un tipo genérico N.
 * 
 * El Reto: No pongas solo <N>, tienes que decirle a Java que N debe ser hijo de
 * la clase Number. (Pista: usa extends).
 * 
 * Define un atributo contenido de tipo N y su constructor.
 * 
 * 2. El Método Lógico:
 * 
 * Aquí viene la magia. Como Java sabe que N es un número, puedes usar métodos
 * de números.
 * 
 * Crea un método boolean esPositivo().
 * 
 * Pista: Para comparar, transforma el contenido a double usando .doubleValue()
 * (todos los números en Java tienen este método) y mira si es mayor que 0.
 * 
 * 3. El Main (Prueba):
 * 
 * Crea una CajaNumerica con un Integer (ej: 10) y prueba el método.
 * 
 * Crea otra con un Double (ej: -5.5) y prueba el método.
 * 
 * (Mentalmente): Si intentaras poner <String>, el IDE debería ponerte una línea
 * roja antes incluso de compilar.
 */
public class CajaNumerica<N extends Number> {
    private N contenido;

    public CajaNumerica(N contenido) {
        this.contenido = contenido;
    }

    public boolean esPositivo() {
        return contenido.doubleValue() > 0;
    }

    public static void main(String[] args) {
        CajaNumerica<Integer> caja = new CajaNumerica<>(10);

        System.out.println(caja.esPositivo());

        CajaNumerica<Double> caja2 = new CajaNumerica<Double>(-5.5);

        System.out.println(caja2.esPositivo());

    }
}
