# Game Vehicle

![](img_1.png){ width="400" }


## Objectiu general

Crear un mini projecte en Java que simuli **vehicles que es mouen en un circuit** utilitzant:

* **Herència abstracta** (`Vehicle` és abstracta)
* **Polimorfisme** (mateix codi, diferents comportaments segons el vehicle)
* **Casting** (per utilitzar funcionalitats específiques d’una subclasse)
* **Interacció gràfica** amb teclat (`JPanel` + `KeyListener`)

Has de completar el codi de les subclasses i la interacció gràfica.

---

## 1. Classe Vehicle (abstracta)

* Té atributs `x` i `y` per la posició
* Té **mètodes abstractes**: `right()`, `left()`, `up()`, `down()`
* Té un mètode `final` `copyRight()` que no es pot sobreescriure

## 2. Subclasses: `Car`, `Moto`, `Bike`

* Implementen els moviments amb valors diferents per `x` i `y`
* `Car` té un mètode exclusiu `turbo()`
* `Moto` té l'atribut `cc`
* `Car` té l'atribut `seats`
* `Bike` no té atributs addicionals

Valors de moviment per cada subclasse:


| Vehicle | Right (→) | Left (←) | Up (↑) | Down (↓) | Turbo (només Car) |
|---------|-----------|----------|--------|----------|-------------------|
| Car     | +10       | -8       | +8     | -6       | +50               |
| Moto    | +5        | -3       | +4     | -4       | –                 |
| Bike    | +3        | -2       | +2     | -1       | –                 |




## 3. Main.java

* S’utilitza **només per provar els vehicles**
* Conté exemples de polimorfisme i casting (`instanceof` o `getClass`)

## 4. Game.java (interacció gràfica)

* Conté el panell gràfic amb un vehicle i un circuit
* Ja està creat el frame i la càrrega de la imatge
* Has de **completar el codi de moviment** en el `switch` del `KeyAdapter`


---

## Objectius pedagògics

* Entendre **herència abstracta**
* Entendre **polimorfisme i overriding**
* Entendre **casting i instanceof o getClass**
* Manipular **atributs de posició** (`x` i `y`)
* Programar una **interacció gràfica bàsica** amb Swing



!!! abstract "Fitxers"
    Descarrega els fitxers inicials:<br />

    [TestUnit.java](TestUnit.java "download")<br />



---

<small>**License and Copyright**</small>

<small>Copyright (C) Joan Sèculi ([joan.seculi@gmail.com](mailto:joan.seculi@gmail.com)).</small>

<small>Permission is granted to copy, distribute, and/or modify this document under the terms of the **GNU Free Documentation License**, Version 1.3 or any later version published by the Free Software Foundation; with no Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts.</small>

<small>A copy of the license is available at: [http://www.gnu.org/licenses/fdl.txt](http://www.gnu.org/licenses/fdl.txt)</small>


