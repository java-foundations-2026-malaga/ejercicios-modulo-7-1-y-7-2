# JFo 7.1 y 7.2 - Actividad 08

## Añade un método withdraw con validación

Retira solo cantidades válidas con saldo suficiente.

Añade el método `withdraw(double amount)`: si la cantidad es positiva y hay saldo suficiente, la resta y muestra `Retirada realizada`; si no, muestra `Fondos insuficientes`. En `main` retira `300` y luego `800`, mostrando el saldo tras cada retirada.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Retirada realizada
Saldo: 700.0
Fondos insuficientes
Saldo: 700.0
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_1_7_2_actividad08/Actividad08.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad08Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
