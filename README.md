Practica 1
filmoteca - Compose
===============
### Ejercicio 1. Creación del proyecto

- Se creó un proyecto nuevo compatoble con dispositivos Android 7.0+ usando API 24
- Se creó un nuevo activity About con su respectivo archivo XML
---------------
### Ejercicio 2. Probando la aplicación

- Se ejecuto el proyecto en un dispositivo Virtual
---------------
Ejercicio 3. Añadiendo contenido a la actividad

- Se agregó contendio al nuestro Activiy About
  - Un TextView para presentar quien ha creado el proyecto
  - Un imageView para presentar una imagen propia como recurso Drawable
  - 3 botones en Stack para opciones Sitio web, Soporte, Volver
---------------
Ejercicio 4. Internacionalización

- Se agregaron recursos para que tengamos soporte en español e inglés
---------------
Ejercicio 5. Reimplementación de la Actividad utilizando Jetpack Compose

- Se reimplemeto el activity About con su interface en Compose, soportando Binding y compose respectivamente
---------------

Problemas y soluciones
===============
Problema: Al desarrollar la interface con Compose y qurer usar el elemento setContent no se tenía disponible

Solucion: tras ina investigación y apoyo del profesor se encontró que el problema era la ausencia de una dependencia en nuestro archivo buil.gradle.kts, al agregarse dicha dependecia se soluciono el problema.
