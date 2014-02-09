package lv.ldn.scalaoop.scala

object VolatileResult {

  def main(args: Array[String]) {
    printResult(Right(42))
    printResult(Left("couldn't do it"))
  }

  def printResult[T](result: Either[String, T]) {
    result match {
      case Right(value) => println("Success: " + value)
      case Left(message) => println("Failure: " + message)
    }
  }

}
