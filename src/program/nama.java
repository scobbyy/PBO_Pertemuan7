package program;

import java.util.Comparator;

public class nama implements Comparator<set_get> {
    @Override
    public int compare(set_get a, set_get b) {
         return a.getNama().compareToIgnoreCase(b.getNama());
    }
}
 