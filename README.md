# Proyecto - Matrices

## Descripción del Problema

En este ejercio se va a crear 2 matrices a partir de 2 archivos

Con las matrices se deberán realizar las operaciones de Suma y Multiplicación

Se te porporciona un clase llamada Util_LeeArchivo el cual contiene un solo método
ObtenLineas. Este método retorna un ArrayList de String, con cada una de las líneas de
archivo.

Dentro de la carpeta Resources se encuentran los 2 archivos que podrás utilizar para crear las matrices.

La clase Util_CreaMatriz contiene un método CreaMatriz que deberás implementar por medio de la clase que lee el archivo.

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
Leyendo matriz A...
Leyendo matriz B...

Sumando Matrices:

1 3
-1 0
+
4 5
-1 0
=
5 8
-2 0

Multiplicando matrices:
1 3
-1 0
*
4 5
-1 0
=
1 5
-4 -5

## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: Matriz
---
classDiagram
      class Matriz
      Matriz: -NumRenglones
      Matriz: -NumColumnas
      Matriz: -[][]Elementos
      Matriz: +getNumRenglones()
      Matriz: +getNumColumnas()
      Matriz: +agregaNumero(valor,x,y)
      Matriz: +GetValor(x,y)
      Matriz: +sumaMatriz(Matriz)
      Matriz: +MultiplicaMatriz(Matriz)
      Matriz: +RegresaMatriz()
      Matriz: +ComparaMatrices([][],[][])

---
title: Util_CreaMatriz
---
classDiagram
      class Util_CreaMatriz
      Util_CreaMatriz: CreaMatriz(String )

```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).
## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
### Ejecutar ambos comandos en 1 sólo paso:
```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```

### Ejecutar Todas la pruebas locales de 1 Test Case
```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case
```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
