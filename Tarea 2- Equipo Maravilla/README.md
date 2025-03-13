# Sistema de Registro de Estudiantes

## Descripción
Este proyecto es una aplicación de consola en Java que permite registrar, buscar, mostrar y eliminar estudiantes.

## Funcionalidades
- **Registrar Estudiante**: Permite ingresar datos como nombre, edad, matrícula y carrera.
- **Mostrar Estudiantes**: Lista todos los estudiantes registrados.
- **Buscar Estudiante**: Encuentra un estudiante por matrícula.
- **Eliminar Estudiante**: Borra un estudiante del registro.

## Requisitos
- Java 8 o superior
- Un IDE (IntelliJ IDEA, Eclipse, NetBeans) o terminal con `javac`

## Ejecución
1. Clona el repositorio:
   ```sh
   git clone https://github.com/tu_usuario/SistemaRegistroEstudiantes.git
   ```
2. Compila el código:
   ```sh
   javac -d bin src/clases/Estudiantes.java src/SistemaRegistroEsrtudiante.java
   ```
3. Ejecuta el programa:
   ```sh
   java -cp bin SistemaRegistroEsrtudiante
   ```

## Colaboración en GitHub
- Cada funcionalidad debe desarrollarse en su propia rama:
  - `registrar-estudiante`
  - `mostrar-estudiantes`
  - `buscar-estudiante`
  - `eliminar-estudiante`
- Hacer `commit` con mensajes claros:
  ```sh
  git commit -m "Implementada función para registrar estudiantes"
  ```
- Crear un `pull request` para fusionar los cambios en `main`.

## Licencia
Este proyecto es de uso educativo y puede ser modificado libremente.
