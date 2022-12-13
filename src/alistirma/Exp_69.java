package alistirma;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exp_69 {
    public static void main(String[] args) {


    /*
    SET Sorusu 3 : Bir liste ve bir set
    olusturunuz.
    Set içerisinde var olan listenin
    bütün elemanlarını kaldıran
bir kod yazınız.
     */

    List<Integer> myList = new ArrayList<>();
myList.add(10);
myList.add(31);
myList.add(15);
myList.add(7);
myList.add(13);
    Set<Integer> mySet = new HashSet<>();
mySet.add(10);
mySet.add(7);
mySet.add(35);
mySet.add(13);

;

mySet.removeAll(myList);

        System.out.println(mySet);
    }
}
/*
 for (int x : myList ) {
            if( mySet.contains(x)){
                mySet.remove(x);
            }

        }
        System.out.println(mySet);//[35]


    }
 */








/*
//===========================my list silme===================
        myList.retainAll(mySet);
        System.out.println(myList);
        //==========================my Set Silme=====================
        for (Integer each:myList
             ) {
            if (mySet.contains(each)){
                mySet.remove(each);
            }
        }
        System.out.println(mySet);
    }
 */