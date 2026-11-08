# JFo 7.1 y 7.2 - Actividad 15

## Simula la vida de un bono

Aplica interés mensual y controla el vencimiento.

Crea la clase `Bond` con `balance = 1000`, `monthlyRate = 0.005` y `monthsRemaining = 2`, y el método `earnInterest()`: si quedan meses, suma al saldo el interés del mes, resta un mes y muestra `Meses restantes` y `Saldo`; si no quedan, muestra `El bono ha vencido`. Llama a `earnInterest()` tres veces.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Meses restantes: 1
Saldo: 1005.0
Meses restantes: 0
Saldo: 1010.025
El bono ha vencido
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_1_7_2_actividad15/Actividad15.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad15Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
