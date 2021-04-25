package assigment_2

object Exercise3 extends App {
  def student(name: String, age: Int , subject: Option[String]) = {
    println(s"Student name is $name , age is $age and study $subject")
  }

  student("Shahzaib" , 21 , Some("Software Engireeing"))
  student("Ali" , 5 , None)

}
