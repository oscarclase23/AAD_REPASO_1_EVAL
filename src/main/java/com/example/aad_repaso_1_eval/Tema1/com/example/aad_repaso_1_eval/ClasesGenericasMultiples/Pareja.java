package com.example.aad_repaso_1_eval.Tema1.com.example.aad_repaso_1_eval.ClasesGenericasMultiples;

/*

Aquí tienes el Ejercicio 1: La Pareja (Clave-Valor) detallado:

1. La Clase:

Crea una clase llamada Pareja que use dos tipos genéricos: K (por "Key" o Clave) y V (por "Value" o Valor).

Atributos: Define dos atributos privados usando esos tipos:

clave (de tipo K)

valor (de tipo V)

2. Los Métodos:

Constructor: Debe recibir dos parámetros (clave y valor) para inicializar los atributos.

Getters y Setters: Crea los métodos para leer y modificar clave y valor.

toString(): Sobrescríbelo para que devuelva un String bonito, por ejemplo: "Clave: [clave] - Valor: [valor]".

3. El Main (Prueba):

Dentro del main, crea una instancia de Pareja.

Para la K (clave), usa un String (ej: "ID_Usuario").

Para la V (valor), usa un Integer (ej: 12345).
*/
public class Pareja<K, V> {
    private K clave;
    private V valor;

    public Pareja(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public K getClave() {
        return clave;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Clave: " + clave + " Valor: " + valor;
    }

    public static void main(String[] args) {
        Pareja<String, Integer> pareja = new Pareja<>("Manolo", 254);

        System.out.println(pareja.toString());
    }

}
