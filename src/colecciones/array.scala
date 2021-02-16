package colecciones

object array extends App{

  // Conjunto de elemento mutablas de tipo fijo
  var array1: Array[String] = Array("Pedro", "Ramon", "Rosa")
  array1(2) = "Carmen"

  var array2:Array[Int] = new Array(5)
  array2(3) = 10

  var array3: Array[Int] = (1 to 10).toArray[Int]

  var array4: Array[Int] = new Array(array3.size)

  Array.copy(array3,0,array4,0,array3.size)

  for(x <- array4)
    {
      println(x)
    }

  var array5:Array[Int] = Array(10, 20, 30)
  var array7:Array[Int] = Array(30,40,50)
  val array8 = Array.concat(array5, array7)

  array1==array7
}
