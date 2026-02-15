# Análisis de Estructuras de Datos: Instagram

### 1. Aplicación seleccionada (opción 1)
**Instagram** (Enfoque en el Feed de usuario)
### 2. Tipos de datos detectados
* **Multimedia (BLOB/Files):** Las imágenes y videos que subimos (el contenido "pesado").
* **Contadores (Integers):** El número de "likes" y de reproducciones en cada post.
* **Cadenas de texto (Strings):** Los pies de foto (captions), comentarios y nombres de usuario.
### 3. Organización de los datos
Instagram podría organizar esto como una **Lista Enlazada o un Feed Cronológico**.

>"Cada publicación es un bloque que contiene la imagen, los comentarios y el número de likes. El sistema los ordena por fecha o relevancia (algoritmo) para que, al deslizar el dedo, los datos aparezcan uno tras otro de forma fluida."

# Análisis de Estructuras de Datos: WhatsApp

### 1. Aplicación seleccionada (opción 2)
**WhatsApp** (Enfoque en Chats y Mensajería)

### 2. Tipos de datos detectados
* **Cadenas de texto (Strings):** El contenido de cada mensaje enviado o recibido.
* **Marca de tiempo (Timestamps):** La hora y fecha exacta (ej. 12:44 PM) en que el mensaje llega al servidor.
* **Metadatos de Contacto (Objects/Strings):** El número telefónico y el nombre que tienes guardado en tu agenda.

### 3. Organización de los datos
Los chats se organizan como una **Pila (Stack)** o una **Cola (Queue)** de mensajes.

> "Los mensajes individuales dentro de un chat siguen una fila (cola): el primero que llega es el primero que lees arriba. Sin embargo, la lista principal de chats se comporta como una pila: el contacto que te escribió hace un segundo 'salta' automáticamente a la parte superior de la pantalla, desplazando a los demás hacia abajo."
