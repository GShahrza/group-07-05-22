package main.java.lesson_21.warmup;

import java.util.ArrayList;

public class SortList {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(43);
        arrayList.add(3);
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(2);
        SortList sortList = new SortList();
        System.out.println("Listin ilkin hali: " + arrayList);
        ArrayList<Integer> resultList = sortList.sortArtanSira(arrayList);

        System.out.println(resultList);
    }

    private ArrayList<Integer> sortArtanSira(ArrayList<Integer> arrayList) {
        int ara = 0, e = 0;
        int loopCount = arrayList.size();
        while (e++ <= (loopCount / 2) + 1) {
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    ara = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, ara);
                }
                System.out.println(arrayList);

            }
        }

        return arrayList;
    }


}
