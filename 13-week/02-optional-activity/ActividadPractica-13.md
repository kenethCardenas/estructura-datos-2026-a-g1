# 🏗️ Diseño de un sistema con múltiples estructuras de datos

## 1. Descripción del sistema

**Sistema:** Gestor de Biblioteca Digital

El sistema permite gestionar los préstamos de libros en una biblioteca. Los usuarios pueden solicitar libros, devolverlos, consultar el historial de préstamos de un usuario y ver el catálogo de libros organizado por categorías.

---

## 2. Tipos de datos que manejará

| Tipo de dato | Ejemplo |
|--------------|---------|
| Solicitudes de préstamo | Usuario A solicita el libro "Cien años de soledad" |
| Historial de préstamos por usuario | Usuario B pidió "El Quijote" el 10/03/2025 |
| Turnos de espera | Usuario C espera el libro "1984" |
| Catálogo de libros | Libros organizados por género (Ficción, Ciencia, Historia, etc.) |

---

## 3. Estructura de datos asignada

| Tipo de información | Estructura de datos |
|---------------------|----------------------|
| Solicitudes activas | **Cola (Queue)** |
| Historial por usuario | **Pila (Stack)** |
| Turnos de espera por libro | **Cola (Queue)** |
| Catálogo por categorías | **Árbol binario (Binary Tree)** |

---

## 4. Justificación de cada estructura

### 📌 Cola para solicitudes activas
- Las solicitudes se atienden en **orden de llegada** (FIFO).
- La primera en llegar es la primera en ser procesada.

### 📌 Pila para historial del usuario
- El usuario siempre ve primero su **préstamo más reciente** (LIFO).
- Ideal para mostrar "últimos 5 préstamos" o deshacer acciones.

### 📌 Cola para turnos de espera por libro
- Si un libro está prestado, los siguientes usuarios esperan en **orden justo**.
- Cuando se devuelve, se asigna al primero en la cola.

### 📌 Árbol binario para el catálogo
- Permite **búsquedas rápidas** por orden alfabético (ABB).
- Fácil insertar, eliminar y recorrer por géneros o títulos.

---

## 5. Interacción entre las estructuras

1. Un usuario busca un libro en el **árbol del catálogo**.
2. Si está disponible, su solicitud va a la **cola de solicitudes activas**.
3. Si no está disponible, el usuario entra a la **cola de turnos** de ese libro.
4. Cuando se devuelve un libro:
   - Se **apila** en el historial del usuario.
   - Se atiende al siguiente en la **cola de turnos**.
5. El usuario puede consultar su **pila de historial** para ver préstamos pasados.

Usuario → Busca libro (Árbol)
↓
¿Disponible?
/
Sí No
↓ ↓
Cola activa Cola de turnos
↓ ↓
Préstamo Espera
↓ ↓
Devuelve Cuando se libera
↓ ↓
Historial → Cola activa
(Pila)


---

## ✅ Conclusión

Este diseño muestra cómo diferentes estructuras de datos se complementan en un sistema real:
- **Colas** para orden justo.
- **Pilas** para historial reciente.
- **Árboles** para búsqueda eficiente.

El sistema es escalable, eficiente y fácil de mantener.

---

