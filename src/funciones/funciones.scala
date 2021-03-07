package funciones

object funciones extends App{

//  def f1(): String = {
//    "Hola"
//  }
//
//  println(f1())
//
//  def f2 = "Adios"
//
//  def f3() = "Otra prueba"
//
//  println(f3)
//
//  def proc1(): Unit ={
//    println("Esto es una prueba de método")
//  }
//
//  def sumar(cifra1: Int, cifra2: Int): Int = {
//    cifra1 + cifra2
//  }
//  println(sumar(10,20))
//
//  def calcular(operacion: String, numero1: Int, numero2: Int = 1): Unit ={
//  {
//    if(numero2 == 0)
//    {
//      "No se puede dividir por 0"
//    }
//    else
//      {
//        operacion match{
//          case "+" => numero1 + numero2
//          case "-" => numero1 - numero2
//          case "*" => numero1 * numero2
//          case "/" => numero1 / numero2
//          case _ => "Operacion Incorrecta"
//        }
//      }
//  }
//  }
//  calcular("+", 10, 20)
//  calcular(operacion="+", numero1 = 10, numero2 = 20)
//  calcular(operacion="+", numero1 = 10)


  def calcularMuchos(operacion:String,numeros: Int*)= {
  {
    if (numeros.length<2) {
      "No se puede calcular con solo un numero"
    }
    else
    {
      var total:Double=0
      if (operacion=="+" || operacion=="-")  total=0 else  total=1

      operacion match {
        case "+" => {numeros.foreach(x=>total=total+x)
          total}
        case "-" => {numeros.foreach(x=>total=total-x)
          total}
        case "*" => {numeros.foreach(x=>total=total*x)
          total}
        case "/" => {numeros.foreach(x=>total=total/x)
          total}
        case _ => "Operacion Incorrecta"
      }
    }
  }
  }
  println(calcularMuchos("+",2,2,3,2))

}
