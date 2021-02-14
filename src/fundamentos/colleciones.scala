package fundamentos

object colleciones {

  /** Listas
   *  Es el tipo de dato más básico en lenguajes funcionales.
   *  A diferencua de las listas en otros lenguajes, aqui por defecto son inmutables.
   *  .List, Seq, Array
   */

  val a1 = Seq(1,2,3)
  //Agregar un elemento a la lista
  val a2 = a1.appended(4) // o puedes escribir a1 :+ 4 o a1.:+4 o a1 appended 4
  // Acceder a un valor de la lista
  a1(0)
  a2(4)

  /** Conjuntos
   *  Es muy similar a usar una lista, pero conceptualmente es distinto.
   *  Por definición, los elemntos en un conjunto no tienen orden, ni pueden estar repetido.
   *  .Set
   */

  val c1 = Set(1,2,3)
  //Agregar un valor al conjunto
  val c2 = c1.incl(4) // Se puede hacer c1 + 4
  //Seleccionar un valor del conjunto
  c2(4)//Pregunta si existe 4 en el conjunto
  /** Mapas
   *  También se les conoce como diccionarios
   *  No es muy diferente a lo que conocemos, solo que también son imnumtables por defecto.
   *  .Map
   */

  val m1 = Map(((1, "Hola"))) // O se puede usar Map(1 -> "Hola")
  val m2 = m1 + ((2,"Hello")) // O (2 -> "Hello")
  // Sumar 1 a los valores de c2 con la función map
  c2.map( x => x+1)
  a2.map( x => x+1)
  // Para operaciones con mapas
  m2.view.mapValues(s => s + "!")

  /** Loops en FP
   *  En programación funcional no usaremos un for o un while como se hace en lenguajes imperativos.
   *  Por el contrario, usaremos funciones que recorran los elementos de una lista por nosotros.
   *
   *  1. map()
   *  2. filter()
   *  3. filterNot()
   *  4. forEach()
   *  5. zip()
   *  6. find()
   */

  /** Reto
   *  Crear un grupo de funciones para hallar la media, la mediana y la moda de una lista de números, devolviendo
   *  la respuesta dentro de un tipo Map
   */
  
}
