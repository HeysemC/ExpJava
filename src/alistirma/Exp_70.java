package alistirma;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exp_70 {

    /*


    SET Sorusu 4 : Bir listede kaç farklı öge oldugunu
    gösteren kodu yazınız.


    Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4


     */
    public static void main(String[] args) {



    List<Integer> myList=new ArrayList<>();

    myList.add(10);
    myList.add(31);
    myList.add(15);
    myList.add(7);
    myList.add(15);
    myList.add(7);
    myList.add(7);

        Set<Integer> mySet=new HashSet<>();

        for (int i:myList){
            mySet.add(i);
        }

        System.out.println(mySet.size());//4



    }

}

/*
 int[] arr = {1, 2, 3, 4, 3, 2, 3, 3, 2, 4, 2, 2, 3, 5, 6, 5, 7, 5, 6, 7, 6, 7, 8};
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);

 */
/*
 List <Integer> liste = new ArrayList<>();
        int [] arr ={10, 31, 15, 7, 15, 7, 7};
        for (int each : arr
             ) { liste.add(each);
        }
        Set <Integer> liste2 = new HashSet<>(liste);
        System.out.println(liste2.size());
    }
 */



/*
 String[] benzersiz = { "10", "31", "15", "7", "15", "7", "7" };
    Set<String> set = new HashSet<String>();
    for (int i = 0; i < benzersiz.length; i++)
        set.add(benzersiz[i]);
    System.out.println(set.size());
 */