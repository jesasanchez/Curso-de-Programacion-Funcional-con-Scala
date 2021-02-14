package fundamentos

object blucles {
  var x = 0

  while (x < 10){
    println(x)
    x = x + 10
  }

  do {
    println(x)
    x = x + 1
  }while( x < 10)

  for (z <- 1 to 10)
    {
      println(z)
      println(x)
    }

  for (z <- 1 until 10)
  {
    println(z)
    println(x)
  }

  for (z <- 1 until 10 if z%2 == 0) {
  {
    println(z)
    println(x)
  }

    /** Rango */

    var rango = 1 to 5

    for (x <- rango)
      {
        println(x)
      }

    // Visualizar la información de rango
    rango(1)
    rango(4)

    val rango1 = 1 until 5

    val rango2 = 1 to 20 by 4

    for (x <- rango2)
      {
        println(x)
      }

    val minusculas = 'a' to 'z'

    for (x <- minusculas)
      {
        println(x)
      }

    minusculas(4)
  }
}
