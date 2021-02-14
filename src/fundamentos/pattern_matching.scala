package fundamentos

import fundamentos.pattern_matching.otroColor

object pattern_matching extends App{
  // Pattern Matching --> CASE

  var color = " "

  color match {
    case "red" => println("Rojo")
    case "blue" => print("Azul")
    case _ => println("Otro Color")
  }

  var num = "Dos"

  num match {
    case "Uno" => println("1")
    case "Dos" | "Tres" => println("2 o 3")
    case _ => println("Otro numero")
  }

  var otroColor = "green"

  otroColor match {
    case otroColor  if(otroColor == "red" || otroColor == "green") => println("Rojo")
    case "blue" => print("Azul")
    case _ => println("Otro Color")
  }

  val cadena = "HOLA"
  println(cadena.length)
  println(cadena.last)
  println(cadena.head)
  println(cadena.toLowerCase)
  cadena.foreach(println)
  cadena.toLowerCase.foreach(println)

  var nombre = "Alberto"
  println(s"Te llamas: $nombre")
  var edad = 20
  println("Te llamas:" + nombre + " y tienes" + edad)
  println(s"Te llamas: $nombre y dentro de 2 años tendras ${edad + 2} años")

  var x =  100
  Int.MinValue
  Int.MaxValue

  x.toString.foreach(println)

}
