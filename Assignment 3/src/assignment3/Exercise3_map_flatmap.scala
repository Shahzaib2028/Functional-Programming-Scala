package assignment3

object Exercise3_map_flatmap extends App{

  println("--------map on LIST--------------")
  val ulst = List(1,5,7,8 , 2)
  val ulst_mod = ulst.map(x => x*2)
  println(ulst_mod)

  println("--------map on SET--------------")
  val uset = Set(1,5,7,8 , 2)
  val uset_mod = uset.map(x => x*2)
  println(uset_mod)


  println("--------map on SEQUENCE--------------")
  val useq = Seq(1,5,7,8 , 2)
  val useq_mod = useq.map(x => x*2)
  println(useq_mod)

  println("--------map on Array--------------")
  val uarr = Array(1,5,7,8 , 2)
  val uarr_mod = uarr.map(x => x*2)
  println(uarr_mod.toList)

  println("--------map on Vector--------------")
  val uvec = Vector(1,5,7,8 , 2)
  val uvec_mod = uvec.map(x => x*2)
  println(uvec_mod.toList)

  println("--------map on Map--------------")
  val uMap = Map('a' -> 2 , 'b' -> 4 , 'c' -> 6)
  val l = (k:Int , v:Int) => Some(k -> v*2)

  val uMap_map = uMap.map {
    case (k, v) => l(k, v)
  }
  println(s"map values doubled using map = $uMap_map")

  val uMap_flatmap = uMap.flatMap{
    case (k,v) => l(k,v)
  }
  println(s"map values doubled using map = $uMap_flatmap")

}
