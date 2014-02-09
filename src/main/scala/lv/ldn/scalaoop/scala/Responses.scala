package lv.ldn.scalaoop.scala

case class URL(address: String)

sealed trait Response
case class Success(code: Int, result: Object) extends Response
case class Redirect(code: Int, url: URL) extends Response
case class BadRequest(reason: String) extends Response

class Handler {
  def handle(response: Response) {
    response match {
      case Success(_, result) => println("Success: " + result)
      case Redirect(_, URL(address)) => println("Redirect: " + address)
      case BadRequest(reason) => println("Failed: " + reason)
    }
  }
}
