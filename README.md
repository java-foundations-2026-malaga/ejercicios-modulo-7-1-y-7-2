# JFo 7.1 y 7.2 - Creación de clases e instanciación de objetos

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige una clase sin estructura válida
02. Corrige una instancia mal creada
03. Corrige el uso del operador de punto
04. Corrige una comparación incorrecta de objetos
05. Corrige una referencia compartida accidentalmente
06. Crea una clase CheckingAccount
07. Añade un método deposit
08. Añade un método withdraw con validación
09. Crea una clase Prisoner
10. Compara dos objetos Prisoner
11. Demuestra dos referencias al mismo objeto
12. Modela una cuenta de ahorro
13. Aplica interés usando un método con retorno
14. Modela un bono de ahorro
15. Simula la vida de un bono

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
