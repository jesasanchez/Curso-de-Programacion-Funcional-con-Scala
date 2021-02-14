package fundamentos

import scala.util.Random

object ejercicio1 extends App{
  /*val datos = Seq(1,3,5,7,9,9,11,17,20,20,100)

  def media(args: Seq[Int]): Int = {
    val media = args.sum/args.size
    media
  }

  def mediana(args: Seq[Int]): Int = {
    val indice = (args.size/2)
    args(indice)
  }

  def moda(args: Seq[Int]): Int = {
    args
      .groupBy(x => x)
      .maxBy(x => x._2.size)
      ._1
  }

  // funcion de medidas de tendencia central
  def medidasT(args: Seq[Int]): Unit = {
    val lista = args.sorted
    val mapa = Map(
      "media"   -> media(lista),
      "mediana" -> mediana(lista),
      "moda"    -> moda(lista)
    )

    mapa foreach ( x => println(x._1 + " -> " + x._2) )

  }*/

  def main(): Unit = {
    val r = Random
    val lista: Seq[Int] = for (i <- 1 to 10) yield r.nextInt(10)

    medidas(lista)
  }

  def mediana(args: Seq[Int]): Float={
    val tamano = args.size
    val indice = args.size/2
    if (tamano%2 == 0){
      (args(indice-1).toFloat+args(indice).toFloat)/2
    } else {
      args(indice)
    }
  }

  def media(args: Seq[Int]): Float ={
    val mean = args.sum.toFloat/args.size.toFloat
    mean
  }

  def moda(args: Seq[Int]): Seq[Int] ={
    val mapaFreq = args
      .groupBy(identity)
      .mapValues(_.size)
    val maxVal = mapaFreq
      .valuesIterator.max
    val mode =  (mapaFreq
      .filter(_._2 == maxVal)
      .view
      .map{case(k,v) => k}
      .toList)
    mode
  }

  def medidas(args:Seq[Int]): Unit= {
    val lista = args.sorted
    val mapaCT = Map(
      "media" -> media(lista),
      "mediana" -> mediana(lista),
      "moda" -> moda(lista)
    )

    println(lista, mapaCT)
  }

}
