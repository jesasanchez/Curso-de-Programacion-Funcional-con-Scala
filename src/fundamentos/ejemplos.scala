package fundamentos

import scala.collection.immutable.ListMap
import scala.collection.mutable.LinkedHashMap

object ejemplos extends App{

  /** https://alvinalexander.com/scala/how-to-sort-map-in-scala-key-value-sortby-sortwith/ */

  // Given a basic, immutable Map:
  val grades = Map("Kim" -> 90,
    "Al" -> 85,
    "Melissa" -> 95,
    "Emily" -> 91,
    "Hannah" -> 92
  )
  // You have an unsorted Scala Map and want to sort the elements in the map by the key or value.
  val sortElements = ListMap(grades.toSeq.sortBy(_._1):_*)

  // You can also sort the keys in ascending or descending order using sortWith:
  // low to high

  val lowToHighElement =  ListMap(grades.toSeq.sortWith(_._1 < _._1):_*)

  // high to low
  val highToLowElement = ListMap(grades.toSeq.sortWith(_._1 > _._1):_*)

  /* You can sort the map by value using sortBy: */
  val sortValue = ListMap(grades.toSeq.sortBy(_._2):_*)

  // You can also sort by value in ascending or descending order using sortWith:

  // low to high
  val lowToHighValue = ListMap(grades.toSeq.sortWith(_._2 < _._2):_*)

  // high to low
  val highToLow = ListMap(grades.toSeq.sortWith(_._2 > _._2):_*)

  val x = collection.mutable.LinkedHashMap(grades.toSeq.sortBy(_._1):_*)

  x.foreach(println)

  // Next, this is what grades.toSeq looks like:
  val toSeqLooks = grades.toSeq

  /* You make the conversion to a Seq because it has sorting methods you can use: */

  val toSeqSorting = grades.toSeq.sortBy(_._1)

  val toSeqSortingAsc = grades.toSeq.sortWith(_._1 < _._1)

  /* Once you have the map data sorted as desired, store it in a ListMap to retain the sort order: */

  val listMap = ListMap(grades.toSeq.sortBy(_._1):_*)

  /* The LinkedHashMap also retains the sort order of its elements, so it can be used in all of the examples as well: */
  val linkedHashMap = LinkedHashMap(grades.toSeq.sortBy(_._1):_*)

  /** About that _*
   *
   * The _* portion of the code takes a little getting used to.
   * It’s used to convert the data so it will be passed as multiple parameters to the ListMap or LinkedHashMap.
   * You can see this a little more easily by again breaking down the code into separate lines.
   * The sortBy method returns a Seq[(String, Int)], i.e., a sequence of tuples:
   */

  val y = grades.toSeq.sortBy(_._1)

  /** You can’t directly construct a ListMap with a sequence of tuples,
   * but because the apply method in the ListMap companion object accepts a Tuple2 varargs parameter,
   * you can adapt x to work with it, i.e., giving it what it wants
   */

  val z = ListMap(y: _*)

}