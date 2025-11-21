package com.example.aad_repaso_1_eval.Tema1.ClasesGenericasMultiples;

import java.util.ArrayList;

/*
Crea una clase genérica Lista<T> que internamente use un ArrayList<T> para
almacenar elementos.
Debe permitir:
● addElemento(T elemento)
● getElemento(int indice)
● mostrarElementos()
Ejemplo de uso esperado:
Lista<String> nombres = new Lista<>();
nombres.addElemento("Ana");
nombres.addElemento("Luis");
nombres.mostrarElementos(); // Muestra "Ana" y "Luis"
Pregunta: ¿Qué ventaja tiene este Lista<T> frente a una lista de Object?
*/
public class Lista<T> {
    private ArrayList<T> elementos;

    public Lista() {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(T elemento) {
        elementos.add(elemento);
    }

    public T getElemento(int indice) {
        return elementos.get(indice);
    };

    public void mostrarElementos() {
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(elementos.get(i));
        }
    }

    public static void main(String[] args) {
        Lista<String> nombres = new Lista<>();

        nombres.addElemento("Manolo");
        nombres.addElemento("Paqui");
        nombres.addElemento("Chanchito");

        nombres.mostrarElementos();

    }
}
