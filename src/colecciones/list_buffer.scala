package colecciones

import scala.collection.mutable.ListBuffer

object list_buffer extends App{

  // Son de tipo mutable
  var lista1=ListBuffer(8,7,5,6,8)

  for(x <- lista1)
    {
      println(x)
    }

  lista1 += 90
  lista1.append(9000)
  lista1(2) = 100
  lista1 -= 76

  for (x <- lista1)
    {
      println(x)
    }

  lista1.remove(1)

  lista1.remove(0,2)
}
