package lv.ldn.scalaoop.scala

trait Drawable { self: Point =>
  def draw { println(s"($x $y)") }
}

class Point extends Drawable {
  var x: Int = _
  var y: Int = _
}
