# JFo 7.1 y 7.2 - Actividad 09

## Crea una clase Prisoner

Define propiedades y el comportamiento think().

Crea la clase `Prisoner` con los campos `name`, `height` (double) y `sentence` (int) y el método `void think()`, que muestra `<nombre> está pensando`. Crea dos presos (Bubba: 1.75, 4; Twitch: 1.68, 3), muestra sus datos y llama a `think()` en cada uno.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Bubba mide 1.75 y cumple 4 años
Bubba está pensando
Twitch mide 1.68 y cumple 3 años
Twitch está pensando
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_1_7_2_actividad09/Actividad09.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad09Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
