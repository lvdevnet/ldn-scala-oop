package lv.ldn.scalaoop.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DrillDown {

    private DrillDown() {
    }

    interface Server {
        Disk getDisk();
    }

    interface Disk {
        Snapshot getSnapshot();

        int getCapacity();
    }

    interface Snapshot {
        Date getDate();
    }

    public String getSnapshotDate(Server server) {
        Disk disk = server.getDisk();
        if (disk != null) {
            Snapshot snapshot = disk.getSnapshot();
            if (snapshot != null) {
                Date date = snapshot.getDate();
                if (date != null) {
                    return new SimpleDateFormat("YYYY-mm-dd").format(date);
                }
            }
        }
        return "(none)";
    }

}
