package fundamentos

object Condiciones {
  /** RELACIONALES
   * ==, !=, <, >, >=, <=
   */

  /** LOGICOS
   * ||, &&
   */

  val x = 10

  if(x > 5) println("Es mayor") else ("Es menor")

  if(x > 5)
  {
    println("Es mayor")
  } else {
    println("Eres todavia muy jove")
  }

  val edad = 30
  var resultado = if (edad > 30) "Eres Mayor" else "Eres menor"

}
