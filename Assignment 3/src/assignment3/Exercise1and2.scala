package assignment3

object Exercise1and2 extends App{
  println("-------EXERCISE1---------")
  type R = Int

  val ulst = List(-3,-2,-1,0,1,2,3)

  def compose(g : R => R ,  h: R => R , k: R=>R) = (x:R) => g(h(k(x)))

  // implement ax^2 + bx + c (a = 3 , b= 5 , c =7)
  def y1 = compose(x => (x*x) * 3  , _*5 ,  _+7 )

  val umap1 = ulst.map(y1(_))

  println(s"linealy mapped 1 = $umap1")

  println("-------EXERCISE2---------")

  //val ulst_mod = ulst.map(x => (x,1))
  val ulst_zipped = ulst.zip(umap1)
  println(s"Zipped ulst with umap1 = $ulst_zipped")

  val ulst_zip_index = ulst_zipped.zipWithIndex
  println(s"Resulting list zip with index = $ulst_zip_index")

  val result = ulst_zipped.reduce((a,b) => (a._1 + b._1 , a._2 + b._2))
  println(s"result $result")
  val mean = result._2.toFloat / ulst_zip_index.length
  println(s"mean of f(x) = $mean")

}
