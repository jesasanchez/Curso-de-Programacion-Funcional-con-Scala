package colecciones

object map extends App{
  // Conjunto de elementos formados por clave valor

  var map1 = Map((1,"Raul"), (2, "Pedro"), (3, "Rosa"))
  var map2 = Map("ES" -> "España", "USA" -> "Estados Unidos")
  map2("ES")
  map1 + (4 -> "Maria")
  map1 + (5 -> "Rosa")
  map1 = map1 - (1)

}
