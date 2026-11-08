# JFo 7.1 y 7.2 - Actividad 14

## Modela un bono de ahorro

Asigna la tasa según el plazo del bono.

Crea la clase `Bond` con los campos `term` (meses) y `rate` y el método `setTermAndRate(int term)`, que guarda el plazo y asigna la tasa: menos de 12 meses → `0.015`; de 12 a 59 meses → `0.025`; 60 meses o más → `0.03`. Configura un bono de 36 meses y muestra plazo y tasa.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Plazo: 36
Tasa: 0.025
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_1_7_2_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
