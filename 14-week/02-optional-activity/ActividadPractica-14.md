#  Análisis de eficiencia de algoritmos

Algoritmo A

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

Algoritmo B
java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}

1. ¿Cuál crece más rápido cuando n aumenta?

El Algoritmo B crece más rápido.

Algoritmo A: realiza n iteraciones. Complejidad: O(n) (crecimiento lineal)

Algoritmo B: realiza n × n = n² iteraciones. Complejidad: O(n²) (crecimiento cuadrático)

n	A: operaciones	B: operaciones
1	1	1
2	2	4
5	5	25
10	10	100
100	100	10,000
Cuando n = 100, el algoritmo B realiza 100 veces más operaciones que el A.

2. ¿Cuál es más eficiente?
El Algoritmo A es más eficiente.

Para un mismo n, el algoritmo A requiere muchas menos operaciones, consumiendo menos tiempo y recursos computacionales.

3. Explicación detallada
Algoritmo A
Tiene un solo bucle.

Complejidad temporal: O(n) (tiempo lineal)

Si n se duplica, el tiempo también se duplica aproximadamente.

Algoritmo B
Tiene dos bucles anidados.

Complejidad temporal: O(n²) (tiempo cuadrático)

Si n se duplica, el tiempo se multiplica por 4.

Conclusión
Para valores pequeños de n, la diferencia es poca.

Para valores grandes de n, el algoritmo B se vuelve mucho más lento.

Elegir algoritmos eficientes (como A) es fundamental cuando se trabaja con grandes volúmenes de datos.

✅ Respuestas finales
Pregunta	Respuesta
¿Cuál crece más rápido?	Algoritmo B (O(n²))
¿Cuál es más eficiente?	Algoritmo A (O(n))
¿Por qué?	Porque O(n) es menor que O(n²) a medida que n aumenta

