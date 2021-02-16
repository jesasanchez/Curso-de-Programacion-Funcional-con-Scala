package colecciones

object listas extends App{

  var lista1 = List(8, 9, 24, 35)
  lista1 = lista1:+45
  lista1 = 5+:lista1

  var lista2 = List(7,8,9,10)
  var lista3 = lista1::lista2

  var lista4 = lista1:::lista2



}
