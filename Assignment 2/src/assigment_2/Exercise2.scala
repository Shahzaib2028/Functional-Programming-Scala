package assigment_2
import scala.collection.mutable.Map
import scala.collection.mutable.Set

object Exercise2 extends App {
  val map1 : Map[Int,String] = Map.empty[Int,String]  //Initialize Empty Map
  map1 += (1 -> "first Value", 2 -> "first Value", 3 -> "first Value")   //Add keys and Value in map
  map1 -= 2   //remove key and its value
  println(map1)

  val set1: Set[String] = Set.empty[String]
  set1 += ("pizza" , "Burger")
  println(set1)

}
