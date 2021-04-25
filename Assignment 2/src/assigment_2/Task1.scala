package assigment_2
import scala.collection.mutable.{ArraySeq, ListBuffer}
import scala.util.Random
object Task1 extends App {

  val arr = new Array[Int](15)
  for (i <- 0 to 14){
    arr(i) = Random.between(50,500)
  }
  def Prime(i :Int) : Boolean = {
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 until (i-1)).exists(x => i % x == 0)
  }
  val lst = new ListBuffer[Int]
  (arr).foreach(i => if (Prime(i))  lst+= i )
  val sort = lst.sorted
  val itr = sort.iterator
  val m = itr.map(x => sort.indexOf(x) -> x).toMap
  println("Random generated array" , arr.toList)
  println(s"prime numbers in $m")

}
