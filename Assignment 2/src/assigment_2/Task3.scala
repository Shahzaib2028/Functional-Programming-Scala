package assigment_2

object Task3 extends App {
  def ArrayAddition(arr1 : Array[Double] , arr2: Array[Double]) : Array[Double] = {
    (arr1.zip(arr2).map {
      case (x, y) => x + y
    })
  }
  println((ArrayAddition(Array(1.0 , 2.0 , 3.0) , Array(4.0 , 5.0 , 6.0 ))).toList)
}
