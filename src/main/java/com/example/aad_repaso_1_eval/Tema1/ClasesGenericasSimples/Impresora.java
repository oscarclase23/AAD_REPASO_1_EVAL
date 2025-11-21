package com.example.aad_repaso_1_eval.Tema1.ClasesGenericasSimples;

/*
Ejercicio 3: La Clase Impresora<T>
Crea una clase Impresora que reciba un objeto de tipo T en su constructor.
Debe tener un método imprimir() que muestre por consola el valor del objeto
 con el formato: >>> Valor: [valor] <<<.
 */
public class Impresora<T> {
    private T valor;

    public Impresora(T valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(">>> Valor: " + valor + " <<<");
    }

    public static void main(String[] args) {
        Impresora<String> contenido = new Impresora<>("Hola Mundo");

        contenido.imprimir();
    }
}
