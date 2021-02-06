package introduccion

object holaMundo extends App{
  println("Hola Platzi")

  /** Tipos de datos básicos
   *
   * https://docs.scala-lang.org/tour/unified-types.html#nothing-and-null
   *
   * Scala tiene una familia de tipos de datos básicos que no son nada diferentes a los que quizás ya conozcas de otros lenguajes.
   * Lo que quizás sí tiene de diferente es cómo se relacionan estos tipos entre ellos.
   * Como Scala mezcla conceptos de programación orientada a objetos con conceptos de programación funcional,
   * el polimorfismo generado por la herencia de estos tipos de datos puede ser importante en algunas ocasiones, aunque no te afectará para los temas que estaremos tratando a lo largo del curso.
   * Existe entonces un tipo de dato llamado Any. Debajo de este tendremos otros dos: AnyVal y AnyRef.
   * Este último no nos interesa para esta sección, pero el primero sí, así que vamos a verlo en más detalle.
   *
   * Los tipos que se relacionan con AnyVal son los que solemos llamar tipos de datos básicos, estos son: Double, Float, Long, Int, Short, Byte, Unit, Boolean, y Char.
   *
   * La mayoría te podrían sonar familiares:
   * 1. Boolean es para almacenar falso o verdadero.
   * 2. Double, Float, Long, Int, Short, son tipos numéricos.
   * 3. Byte se usa para datos binarios.
   * 4. Char se usa para almacenar caracteres/letras.
   * 5. Unit es quizás el tipo extraño acá, este tipo de dato tiene el objetivo de expresar la unidad o también puede entenderse como el vacío.
   * Por ejemplo, en algunos lenguajes se usa una palabra reservada void para expresar esto, pero void no es tratado como un tipo de dato en sí.
   * Usar Unit como un tipo de dato hace el lenguaje más consistente.
   *
   * Por ejemplo en Java el tipo int es distinto al tipo Integer. En Scala de hecho, el tipo Int corresponde directamente al tipo Integer de Java.
   * Lo interesante es que el compilador de Scala es inteligente, y sabe en qué momentos debe usar a bajo nivel, un tipo o el otro.
   * Como ejercicio, investiga más sobre el tipo Unit y el tipo Nothing, haz un listado de los usos que podrías darles.
   * También puedes escribir las dudas que te generen.
   *
   * En la próxima clase veremos uno de los temas más importantes cuando quieres hacer programación funcional.
   *
   * Finalmente, tendremos un tipo de dato llamado Nothing, que como su nombre lo indica… es el tipo de dato que usaremos para expresar la nada.
   * Entonces, así como todos los tipos de datos provienen de Any, o dicho de otra manera, Any es lo que todos los tipos de datos tienen en común,
   * ningún tipo de dato puede provenir de Nothing.
   *
   * En teoría de lenguajes de programación Nothing es lo que se conoce como bottom type, el tipo de dato más bajo del que ningún otro tipo de dato puede provenir.
   * Any viene siendo el top type, el tipo de dato más alto del que todos los demás provienen.
   *
   * Si conoces los tipos básicos de Java, te habrás dado cuenta que aunque Scala tiene una relación muy cercana con Java,
   * aquí no hay una diferencia en cuanto a tipos básicos con los demás tipos de datos.
   */
}
