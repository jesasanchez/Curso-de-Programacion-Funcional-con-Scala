package colecciones


object collection extends App{

  //List son de tipo inmutables
  val lista1 = List("Alberto", "Rosa", "Pedro")
  val lista2 = List("Alberto", "Rosa", 10)

  println(lista1)
  println(lista1.last)
  println(lista1.head)

  for (m <- lista1)
    {
      println(m)
    }

  println(lista2(2))

  // Lista vacia
  var lista7 = List()
  lista7.isEmpty

  var lista5 =  List.fill(5)(10)
  var lista4 = List(10, 5, 6, 8, 9)
  lista4.reverse


}
