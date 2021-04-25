package assigment_2

object Exercise1 extends App {
  //Simple array
  val a = Array(1, 2, 3)
  println(a(1))

  //Empty array then add values
  val color = new Array[String](3)
  color(0) = "Blue"
  color(1) = "Green"
  color(2) = "Red"
  println(color(2))

  //Array with range
  val num = Array.range(1, 10)
  for (i <- num) {
    println(i)
  }

  //Array with range and step
  val num1 = Array.range(1, 10, 2)
  for (j <- num1) {
    println(j)

  }
}