package colecciones

object set extends App{
  //No utilizan indices
  var uno = Set(8,9,10)
  uno(9)
  var dos = Set("Pedro","Rosa","Alberto")
  dos += "Pedro"
  // No muestra campos diplicados
  dos += "Raul"
  println(s"Los nombrres son $uno")

  for(x <- dos)
    {
      println(x)
    }

  var tres = Set("Maria", "Belen", "Eteban")

  dos ++ tres

  dos - "Pedro"
}
