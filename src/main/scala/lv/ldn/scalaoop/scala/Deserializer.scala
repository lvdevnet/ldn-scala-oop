package lv.ldn.scalaoop.scala

import scala.reflect.ClassTag

class Deserializer {
  def deserialize[T](data: String)(implicit klass: ClassTag[T]): T = {
    val instance = klass.runtimeClass.newInstance().asInstanceOf[T]
    // deserialization magic
    instance
  }
}

object Deserializer {
  def main(args: Array[String]) {
    val date: java.util.Date = new Deserializer().deserialize("2014-02-15")
  }
}
