package program;

import java.util.Comparator;
public class nim implements Comparator<set_get> {
    @Override
    public int compare(set_get a, set_get b) {
        return a.getNim().compareToIgnoreCase(b.getNim());
    }
}

 
