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
}
