package assigment_2
import scala.collection.mutable.ArrayBuffer

object Task4 extends App {
  def even(arr : ArrayBuffer[Int]) = {
    @annotation.tailrec
    var counter = 0
    def go(arr: ArrayBuffer[Int]): Any ={
      if (arr.length <= 0 ) -1
      else{
        if (arr(0) %2 ==0) {
          counter = counter + 1
          arr.remove(0)
          go(arr)
        }
        else {
          arr.remove(0)
          go(arr)
        }
      }
      return counter
    }
    go(arr)
  }


  val arr = ArrayBuffer.fill(100)(util.Random.nextInt(100))
  println(arr.toList)
  println("By higher order function there are " , arr.count(_%2==0) , "even numbers")     //Use the count higher-order method.
  println("By recursive function there are ", even(arr), "even numbers")   //Use a recursive function.
}
