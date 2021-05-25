package assignment3

object Exercise2_deep_copy extends App{

  case class car(brand: String , model: String , price: Int)

  val c1 = car("Toyota" , "Corolla" , 200000)
  println("Brand is " , c1.brand)
  println("Model is " , c1.model)
  println("Price is " , c1.price)

  //lets create a copy of object c1
  println("After create a copy of c1")
  println("Its create a deep copy because it copy every thing from the object")
  val c2 = c1.copy()
  println("Brand is " , c2.brand)
  println("Model is " , c2.model)
  println("Price is " , c2.price)

  //lets create another copy of c1 and change model and price only
  println("After create a copy of c1 and change model and price")
  val c3 = c1.copy(model = "Aqua" , price = 280000)
  println("Brand is " , c3.brand)
  println("Model is " , c3.model)
  println("Price is " , c3.price)

}
