
### 🎓 Examen Final: El Sistema de Logística Universal 🚚

**Contexto:**
Trabajas para una empresa de logística futurista. Necesitan un sistema capaz de mover mercancías de un contenedor a otro y procesar datos, sin importar si transportan manzanas, tornillos o datos digitales.

Tienes 3 misiones en este examen. Hazlas en orden.

#### 📦 Misión 1: El Contenedor (La Clase Genérica)
Crea una clase llamada `Contenedor<T>`.
* Debe tener un atributo privado para guardar **un solo** objeto de tipo `T`.
* Un constructor para iniciarla vacía o con algo (puedes hacerlo como quieras, pero que sea funcional).
* Un método `void guardar(T objeto)`.
* Un método `T sacar()` (que devuelva el objeto).

#### 🔄 Misión 2: El Trasvasador (El Jefe Final - Wildcards PECS)
Crea una clase de utilidades llamada `Logistica`.
* Crea un método estático llamado `trasvasar`.
* **Objetivo:** Debe recibir dos listas: una de **origen** y una de **destino**. El método debe copiar todos los elementos de la lista `origen` a la lista `destino`.
* **El Reto:** El método debe ser lo suficientemente flexible para permitir:
    * Pasar elementos de una `List<Integer>` a una `List<Number>`.
    * Pasar elementos de una `List<String>` a una `List<Object>`.
* **Pista:** Recuerda la regla: *Si lees (origen) usa `extends`, si escribes (destino) usa `super`*.

#### 🔢 Misión 3: La Auditoría (Método Genérico Restringido)
En la misma clase `Logistica`, añade un método llamado `auditarContenedor`.
* Debe recibir **un** `Contenedor` (el de la Misión 1).
* **Restricción:** Este método solo debe aceptar contenedores que guarden **números** (`Number` o hijos).
* **Acción:** El método debe imprimir el valor del número contenido multiplicado por 2.

---

**Tu tarea:**
Escribe el código completo (las clases y un `main` que pruebe las 3 misiones).

* En el `main`:
    1.  Crea una lista de `Integer` (origen) con datos y una de `Number` (destino) vacía. Llama a `trasvasar`.
    2.  Crea un `Contenedor` con un `Double` (ej: 10.5) y llama a `auditarContenedor`.
    3.  Intenta (mentalmente) pasar un `Contenedor<String>` a la auditoría; debería dar error si lo has hecho bien.

