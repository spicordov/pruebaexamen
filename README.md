# Paso de diagramas de clases UML a código Java


## Ejercicio 1. Biblioteca

Una aplicación necesita tener información sobre una biblioteca. 
La biblioteca tiene copias de libros. Estos últimos se caracterizan por su nombre, tipo (novela,
teatro, poesía, ensayo), editorial, año y autor.
Los autores se caracterizan por su nombre, nacionalidad y fecha de nacimiento.
Cada copia tiene un identificador, y puede estar en la biblioteca, prestada, con retraso o en
reparación.
Los lectores pueden tener un máximo de 3 libros en préstamo.
Cada libro se presta un máximo de 30 días, por cada día de retraso se impone una multa de dos días
sin posibilidad de coger un nuevo libro.

### Diagrama de clases diseñado con PlantUML

![Diagrama clases Biblioteca](http://www.plantuml.com/plantuml/png/VLBBRjHG3DtVhxZAXeUOj1MxggfQ0KAL027DbesJU6OCDtRaEA1IzODOiE8JviUuZqnJJGLP-PvZ7_lOkHeDrAO--8QQG6BOWdksCnl6yvEJ8G0dicwbFsa3ZEEg8zWgzCwDtuW7YA7FnBMPKZCPthJ2Q_g9_jGvvAdtxv5HnLzS-FH41IDXVtdfxvoF7yjt3913Gp2L70w2u_vtWP57k1LtF-kzYoDt_zOR57D2VYYQmbZYnU1CfUbRsl_X9Eso2_z61e9PQHLpDgZ8ROJE_GqRRb5dgZGvdwV9PL6cYAob9NaGoKFA4m6Mlb6CyDgKU3kZ7IcsiPgF2SE06s5Py4Etpxh_5OVebux4r5BAV0k6CxOXFW3t1xCVgD6boiYc8CTziICJ9GZ7n2s2FZ5bD2I5SlAbqVKKDVpTVvqp9DiGg8FkcDjWkuDFCQ4dP9D7HigzgjEwVbtvrIf7PrMvW7kUsLVbzSBNzR8hLsvKZS2vRIUfV5M0z4_uB-oBriSfMBg_OaiDFhJ4hzWF0JGbdjNrorIljDrPKWbfirLPi2jhhgHHU9pSoG-EgP1sKvKLEUUkaBkf3ty1)