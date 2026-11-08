# JFo 7.1 y 7.2 - Actividad 13

## Aplica interés usando un método con retorno

Suma al saldo el valor devuelto por calcInterest().

Usa la clase `SavingsAccount` (`balance = 1200`, `interestRate = 0.05`) con el método `double calcInterest()`, que devuelve con `return` el interés mensual (`balance * interestRate / 12`). Muestra el interés y súmalo al saldo.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Interés: 5.0
Nuevo saldo: 1205.0
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo7_1_7_2_actividad13/Actividad13.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad13Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
