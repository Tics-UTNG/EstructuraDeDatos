# 📚 Estructura de Datos con Java

Este repositorio contiene ejemplos prácticos y explicaciones de las principales estructuras de datos implementadas en Java, organizadas por unidades temáticas.

---

## 📑 Índice

1. [Unidad 1: Estructuras Lineales](#unidad-1-estructuras-lineales)
2. [Unidad 2: Estructuras No Lineales](#unidad-2-estructuras-no-lineales)
3. [Unidad 3: Estructuras Dinámicas y Avanzadas](#unidad-3-estructuras-dinámicas-y-avanzadas)

---

## 🧩 Unidad 1: Estructuras Lineales

### ✅ Contenidos:
- Listas Enlazadas
- Pilas (Stacks)
- Colas (Queues)

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
