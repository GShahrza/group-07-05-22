package main.java.lesson_25.lesson;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Supplier;

public class SupplierExp {
    public static void main(String[] args) {
        Supplier<LocalDate> supplierDate = LocalDate::now;
        supplierDate.get();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("tree");
        arrayList.add("one");
        Comparator<String> strings = (s1, s2) -> s1.compareTo(s2);

        arrayList.sort(strings);
        System.out.println(arrayList);
//        System.out.println(strings.compare("asa", "bsa"));
    }

}
