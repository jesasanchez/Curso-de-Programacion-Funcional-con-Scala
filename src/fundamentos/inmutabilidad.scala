package fundamentos

object inmutabilidad {

  // Scala es capaz de inferir el tipo de dato con el que estamos trabajando
  // Variables mutables
  var x = 1
  // Variables inmutables
  val y = 10
  // Definición (Una pequeña función
  // Las definciones no se permiten mutar
  def z = 1

  /** ¿La inmutabilidad es ineficiente?
   *
   * Si y No
   *
   * Si, porque hay más uso de memoria
   * No, porque simplifica mucha de la carga congnitica en un sistema
   *
   */

}
