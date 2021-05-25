package assignment3

object Exercise1_apply extends App{

  def apply(lst : List[Int]): Unit = {
    val modified_list = List(lst.foldLeft(0)(_+_))
    println (s" Apply method for the List with .apply = ${modified_list.apply (0)}")
  }

  val ulst = List(1,2,3,4,5)
  apply(ulst)

}
