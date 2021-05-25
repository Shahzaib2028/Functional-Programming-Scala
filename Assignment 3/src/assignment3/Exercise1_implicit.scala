package assignment3
import scala.language.implicitConversions

object Exercise1_implicit extends App{

  class Implicit_Function (i : Int) {
    // Implicit conversion to List and then increment
    val i_implicit_seq_inc = i.map(_ + 3)

    // Implicit function for conversion
    implicit def any_name(i: Int): List[Int] = List(i)
  }

  val convert = new Implicit_Function(1)
  println("Implicit conversion and increment: " +convert.i_implicit_seq_inc)

}
