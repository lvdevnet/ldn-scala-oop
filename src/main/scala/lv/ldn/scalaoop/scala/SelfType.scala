package lv.ldn.scalaoop.scala

trait Drawable {
  self: Point =>
  def draw {
    println(s"($x $y)")
  }
}

trait Storable {
  self: Point =>
  def store {
    def _store(a: Int, b: Int) {}
    _store(x, y)
  }
}

class Point extends Drawable {
  var x: Int = _
  var y: Int = _
}

class Box extends Point with Storable {
}
