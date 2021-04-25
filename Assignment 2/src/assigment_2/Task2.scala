package assigment_2
import scala.collection.mutable.{ArraySeq, ListBuffer}

object Task2 extends App {
  def CharArray(start: Int): Any = {
    println(start)
    val lst = new ListBuffer[Char]
    @annotation.tailrec
    def go(start: Int): ListBuffer[Char] ={
      if (start < 97)
        return lst
      else if (start > 123)
        return lst
      else
        lst+=start.toChar
      go(start + 1)
    }
    println(go(start))
  }

  CharArray(115)

}
