package assignment3

object Exercise3 extends App{

  def magnitude(vec: Vector[Int]): Unit = {
    val ulst_square = vec.map(x => x*x)
    val ulst_add = ulst_square.foldLeft(0)(_+_)  // for addition of list
    val ulst_sqrt = math.sqrt(ulst_add)
    println(s"Square of every element in vector = $ulst_square")
    println(s"Addition of vector = $ulst_add")
    println(s"Final answer, norm of vector = $ulst_sqrt")
  }

  val ulst = Vector(1,2,3,4,5)
  magnitude(ulst)
}
