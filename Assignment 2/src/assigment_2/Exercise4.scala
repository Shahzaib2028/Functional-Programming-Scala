package assigment_2

object Exercise4 extends App {
  val numbers = Array(2,4,8,10,12,15)
  val newArray = numbers.filter(x => x<= 8)
  println(newArray.mkString("[", ",", ",]"))


  val numbers1 = Array(2,4,8,10).toList
  val newArray1 = numbers.map(x => x*2)
  println(newArray1.toList)

}
