package com.example.aad_repaso_1_eval.Tema1.com.example.aad_repaso_1_eval.ClasesGenericasSimples;

/*
Ejercicio 2: La Clase Botella<T>
Crea una clase Botella que pueda contener un líquido (o cualquier cosa).
Atributo T contenido.
Constructor vacío (la botella empieza vacía/null).
Método llenar(T liquido): asigna el valor.
Método vaciar(): pone el contenido a null.
Método estaVacia(): devuelve true si el contenido es null.
*/

public class Botella<T> {
    private T contenido;

    public Botella() {
        this.contenido = null;
    }

    public void llenar(T contenido) {
        this.contenido = contenido;
    }

    public void vaciar() {
        this.contenido = null;
    }

    public boolean estaVacia() {
        if (contenido == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Botella<String> miBotella = new Botella<>();
        System.out.println("¿Está vacía? " + miBotella.estaVacia());

        miBotella.llenar("Agua");
        System.out.println("¿Está vacía? " + miBotella.estaVacia());

        miBotella.vaciar();
        System.out.println("¿Está vacía? " + miBotella.estaVacia());
    }
}
