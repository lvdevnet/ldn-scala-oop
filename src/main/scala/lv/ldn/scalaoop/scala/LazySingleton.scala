package lv.ldn.scalaoop.scala

object LazySingleton {

  private val values: Array[String] = Array[String]("foo", "bar", "baz")

  def getValue(index: Int): String = values(index)

}
