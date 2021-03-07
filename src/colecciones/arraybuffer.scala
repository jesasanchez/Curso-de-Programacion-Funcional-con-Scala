package colecciones

import scala.collection.mutable.ArrayBuffer

object arraybuffer extends App{
  var array1 = ArrayBuffer(9,10,11)
  array1.length
  array1 += 90
  array1.append(200)

  array1 ++= List(8,9,8,7,3)

  array1 -= 10
  array1 --= List(5,6)
  array1.remove(9)

}
