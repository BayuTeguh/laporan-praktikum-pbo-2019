package bayu.percobaanAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CobaArrayList1841720207Bayu {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("Malaysia");
        mListCountry.add("German");
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while (mIterator.hasNext()) {
            Object element = mIterator.next();
            System.out.format("%s ",element);
        }
    }
}
