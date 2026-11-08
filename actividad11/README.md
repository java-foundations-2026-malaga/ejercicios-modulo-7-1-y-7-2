# JFo 7.1 y 7.2 - Actividad 11

## Demuestra dos referencias al mismo objeto

Asigna una referencia a otra y observa el cambio compartido.

Crea la clase `Prisoner`, crea `bubba` y asigna `twitch = bubba`. Cambia el nombre a `Nuevo nombre` a través de una de las referencias, muestra el nombre desde ambas y compáralas con `==`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
bubba: Nuevo nombre
twitch: Nuevo nombre
Misma referencia: true
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_1_7_2_actividad11/Actividad11.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad11Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
