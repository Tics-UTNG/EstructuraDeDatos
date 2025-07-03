# 📚 Estructura de Datos con Java

Este repositorio contiene ejemplos prácticos y explicaciones de las principales estructuras de datos implementadas en Java, organizadas por unidades temáticas.

---

## 📑 Índice

1. [Unidad 1: Conceptos Básicos de Estructuras de Datos Orientadas a Objetos](#unidad-1-estructuras-lineales)
2. [Unidad 2: Estructuras De Datos Básicas](#unidad-2-estructuras-no-lineales)
3. [Unidad 3: Estructuras De Datos Avanzadas](#unidad-3-estructuras-dinámicas-y-avanzadas)

---

## 🧩 Unidad 1:  Conceptos Básicos de Estructuras de Datos Orientadas a Objetos
🎯 Propósito  
El estudiante desarrollará habilidades para implementar estructuras de datos utilizando tipos de datos abstractos, recursividad, arreglos, clases parametrizadas y tipos genéricos con el fin de optimizar la gestión y manipulación de información en entornos de programación.

### ✅ Contenidos:
- Tipo de datos abstractos.
- Recursividad
- Arreglos
- Clases parametrizadas y tipos genéricos
 
### 📄 Ejemplo: Pila en Java

```java
public class Pila {
    private int[] stack;
    private int top;

    public Pila(int capacidad) {
        stack = new int[capacidad];
        top = -1;
    }

    public void push(int valor) {
        if (top < stack.length - 1) {
            stack[++top] = valor;
        }
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return -1;
    }
}
