package com.example.aad_repaso_1_eval.Tema1.WildCard;
/*
Ejercicio 4: El Método Universal
1. La Clase: Crea una clase nueva llamada Utilidades. No hace falta que la clase sea genérica.

2. El Método: Escribe un método estático llamado imprimirTodo.

Parámetro: Aquí está el truco. Usa List<?> lista. Esto significa "Una lista de... lo que sea, no me importa".

Cuerpo: Recorre la lista con un for-each e imprime cada elemento.

Pregunta para reflexionar mientras lo haces: Dentro del bucle, ¿de qué tipo es la variable que itera? (Ej: for (Tipo variable : lista)). ¿Qué tipo es seguro usar ahí?

3. El Main:

Crea una lista de Integer y llénala.

Crea una lista de String y llénala.

Llama a imprimirTodo con ambas listas. ¡Debería funcionar sin rechistar!
*/
import java.util.List;

public class Utilidades {
    public static void imprimirTodo(List<?> lista){
        for(Object elemento : lista){
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        imprimirTodo(List.of(1,2,3,4,5));
        imprimirTodo(List.of("String1","String2","String3"));
    }
}
