package com.example.aad_repaso_1_eval.Tema1.ClasesGenericasSimples;
/*
Ejercicio 1: La Clase Bolsa<T>
Crea una clase llamada Bolsa que pueda guardar un objeto de cualquier tipo.
Debe tener un atributo privado T elemento.
Un constructor que reciba el elemento.
Métodos get y set.
Extra: Sobrescribe el método toString() para que devuelva algo como: "Bolsa que contiene: [valor del elemento]".
*/

public class Bolsa<T> {
    private T elemento;

    public Bolsa(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "Bolsa que contiene: " + elemento;
    }

    public static void main(String[] args) {
        Bolsa<String> bolsa = new Bolsa<>("Platanos");
        System.out.println(bolsa.toString());

        Bolsa<Integer> bolsaInt = new Bolsa<>(25);
        System.out.println(bolsaInt.toString());

    }
}