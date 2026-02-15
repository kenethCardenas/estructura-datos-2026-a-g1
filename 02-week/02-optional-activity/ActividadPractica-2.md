### Actividad 2 sobre Array y tipo de datos
## 1. Array Unidimensional (Ventas semanales)
Este array registra la cantidad de **Smartphones** vendidos en una tienda durante la última semana laboral.

**Definición:** `ventasSemanales = [12, 18, 15, 22, 30]`

**¿Qué representa cada posición del array?**
Cada índice corresponde a un día cronológico de ventas en la tienda principal:
* **Índice 0 (Lunes):** 12 unidades vendidas.
* **Índice 1 (Martes):** 18 unidades vendidas.
* **Índice 2 (Miércoles):** 15 unidades vendidas.
* **Índice 3 (Jueves):** 22 unidades vendidas.
* **Índice 4 (Viernes):** 30 unidades vendidas (día de mayor demanda).

---

## 2. Matriz (Distribución de Stock por Color y Sucursal)
Esta matriz de **3x3** organiza el stock del **Smartphone**, pero dividido por **Color** (filas) y **Sucursal** (columnas).

**Definición:** `stockPorColor = 
   **Fila 0: Smartphones Color Negro** [50, 30, 20]  
   **Fila 1: Smartphones Color Plata** [15, 25, 40]  
   **Fila 2: Smartphones Color Azul** [10, 10, 12]   


**¿Qué representa cada fila?**
Cada fila segmenta el inventario total del modelo según su presentación comercial:
* **Fila 0:** Representa el stock del modelo en **Color Negro** en las 3 sucursales. Es el color con más existencia en la Sucursal 1.
* **Fila 1:** Representa el stock del modelo en **Color Plata**. Se observa que la Sucursal 3 es la que más unidades tiene de este tono.
* **Fila 2:** Representa el stock del modelo en **Color Azul**. Es la variante con menos disponibilidad general en la cadena.

---

## 3. Operación con los datos
**Operación:** Cálculo de Existencias Totales por Variante.

**Descripción:** Se realiza una **suma horizontal de los elementos de una fila** para conocer el inventario global de un color específico sin importar la sucursal. 
* **Ejemplo:** Si sumamos la **Fila 0**, obtenemos $50 + 30 + 20 = 100$. 
* **Resultado:** La suma informa que existen 100 Smartphones de color Negro en total, lo que permite decidir si debe pedir más unidades de ese color a fábrica.
