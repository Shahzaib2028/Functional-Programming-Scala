package assignment3
import scala.language.implicitConversions

object Exercise2_implicit extends App {

  def implct(i : Any , j: Any): Unit ={

    val i_implicit_seq_inc = i + j.toString

    implicit def any_name(i: Any , j: Any) = {
      i.toString
      j.toString

    }


    println(i_implicit_seq_inc)
  }

  implct( "Hello " , "World")

}
