package lv.ldn.scalaoop.scala

import java.util.Date
import java.text.SimpleDateFormat


trait Server {
  val disk: Option[Disk]
}

trait Disk {
  val snapshot: Option[Snapshot]

  val capacity: Int
}

trait Snapshot {
  val date: Option[Date]
}

object DrillDown {
  def getSnapshotDate(server: Server): String = {
    val maybeDate = for {
      disk <- server.disk
      snapshot <- disk.snapshot
      date <- snapshot.date
    } yield new SimpleDateFormat("YYYY-mm-dd").format(date)
    maybeDate.getOrElse("(none)")
  }
}
