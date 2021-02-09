package fundamentos

object funciones extends App {
  /** Funciones
   * Hablamos de funciones en su definición matemática.
   *
   * Dominio: Datos de entrada.
   * Rango: Rango de salida
   *
   * f: D -> R
   *
   * Funciones de orden superior
   *
   * Una función es tratada como un valor más
   * Esto implica que una función puede recibir y retornar otras funciones
   *
   * Funciones ...
   * 1. Funciones anónimas (lambdas).
   * 2. Funciones como objetos.
   * 3. Funciones como métodos.
   */

  def f(x: Int) = {x * x}
  val res = f(2)
  println("Función " + res)

  // Función anonima (lambda)
  val a = (x: Int) => x * x
  val potencia = a(2)
  println("Potencia " + potencia)

  a.apply(2)
  println("APPLY" + a)

  val c = f _
  println("C " + c)
  val e = c.apply(2)

  println("C.APPLY " + e)

  def g(h: Int => Int) = h(3)
  println("función de orden superior" + g(f))

  def k(h: Int => Int)(x : Int) = h(x)
  k(f)(3)

  object util {
    def metodo(x: Int) = x + x
    val a = metodo _
  }

  util.metodo(3)

  // Ejercicio: Crear una función que genere una función para calcular si un número es mayor que el parámetro que se le paso
  def isGreater(a: Int): Int => Boolean = {
    (b:Int) => a < b
  }
}
