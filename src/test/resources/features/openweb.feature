#author: Daniel Porras
#language: es

Característica: Abrir una pagina web

  Yo como usuario
  Quiero realizar una prueba de abrir una pagina en el navegador
  Para comprobar la disponibilidad de automatizar partiendo desde el proyecto base

  @successful
  Escenario: abrir con el navegador la pagina web x
    Dado que "Daniel" abre el navegador
    Cuando ingresa al sitio web de pruebas
    Entonces visualizara en el titulo de la pagina "demoqa"