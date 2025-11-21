# Ejercicios de Clases Genéricas

Aquí tienes una lista de ejercicios para practicar clases genéricas, empezando por lo más básico.

## Bloque 1: Genéricos Simples (Un solo tipo `<T>`)

Estos ejercicios son similares a `Caja<T>`, donde la clase maneja un único tipo de dato genérico.

### Ejercicio 1: La Clase `Bolsa<T>`
Crea una clase llamada `Bolsa` que pueda guardar un objeto de cualquier tipo.
- Debe tener un atributo privado `T elemento`.
- Un constructor que reciba el elemento.
- Métodos `get` y `set`.
- **Extra**: Sobrescribe el método `toString()` para que devuelva algo como: `"Bolsa que contiene: [valor del elemento]"`.

### Ejercicio 2: La Clase `Botella<T>`
Crea una clase `Botella` que pueda contener un líquido (o cualquier cosa).
- Atributo `T contenido`.
- Constructor vacío (la botella empieza vacía/null).
- Método `llenar(T liquido)`: asigna el valor.
- Método `vaciar()`: pone el contenido a `null`.
- Método `estaVacia()`: devuelve `true` si el contenido es `null`.

### Ejercicio 3: La Clase `Impresora<T>`
Crea una clase `Impresora` que reciba un objeto de tipo `T` en su constructor.
- Debe tener un método `imprimir()` que muestre por consola el valor del objeto con el formato: `>>> Valor: [valor] <<<`.

---

## Bloque 2: Genéricos Múltiples (Para más adelante)

### Ejercicio 4: La Clase `Par<A, B>`
Crea una clase que pueda guardar dos objetos, posiblemente de tipos diferentes.
- Atributos `A primero` y `B segundo`.
- Constructor que reciba ambos.
- Métodos `getPrimero()` y `getSegundo()`.
- Método `toString()` que muestre `(valorA, valorB)`.