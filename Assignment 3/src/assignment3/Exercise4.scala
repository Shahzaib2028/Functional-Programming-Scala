package assignment3

object Exercise4 extends App{
  println("-------listing 11.2 using wildcard------------")
  val  ulst = List(1,2,3,4,5)

  val ulst_twice = ulst.map(_*2)
  println(s"list elements doubled = $ulst_twice")

  val f = (g:Int) => if (g > 2) g*g else None

  val ulst_squared  =ulst.map(f(_))
  println(s"list elements squared selectively = $ulst_squared")


  println("-------listing 11.3 using wildcard------------")
  //def g(v:Int) = List(v-1 , v , v+1)
  val g = (v:Int) => List(v-1 , v , v+1)
  val ulst_extended = ulst.map(g(_))
  println(s"Extended list using map = $ulst_extended")

  val ulst_extended_flatmap = ulst.flatMap(g(_))
  println(s"Extended list using flatmap = $ulst_extended_flatmap")



  println("-------listing 11.4 using wildcard------------")
  //def h(x:Int) = if (x>2) Some(x) else None
  val h = (x:Int) => if (x>2) Some(x) else None
  val ulst_selective = ulst.map(h(_))
  println(s"Selective element of list with map = $ulst_selective")

  val ulst_selective_flatmap = ulst.flatMap(h(_))
  println(s"Selective element of list with flatmap = $ulst_selective_flatmap")





}
