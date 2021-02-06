package fundamentos

object expresiones {
  /** El bloque básico de contrucción
   *
   * Lo que definamos en nuestro código es una expresión.
   * Nada está fuera de una expresión
   *
   * Valor de retosno
   *
   * El dato al final de una expresión siempre es su valor de retorno
   * Por esta razón, no es necesario colocar nunca un return al final de una expresión
   *
   * ¿Cómo devolver... nada?
   *
   * Una expresión que no devuelve "nada", en realidad devuelve un tupo llamado Unit
   */

  // def x = (3) es igual a def x = 3 es igual a def x = {3}
  // El uso de parentesis define una sola expresión dentro de la función mientras que con llaves podemos definir n expresiones
  def z = {1 + 2}

  if (z != 3 ) "No es 3" else "es 3"

  val u = ()
}
