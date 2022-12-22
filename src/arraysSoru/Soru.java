package arraysSoru;

import java.util.Arrays;

public class Soru {
    /*
    Given n>=0 , create an array with pattern {1,  1,2,  1,2,3,  1,2,3,4} (space added to show the grouping)
    Note that the length of the array will be 1+2+3...+n , which is known to sum to exactly n*(n+1)/2

    n>=0 verildiğinde, {1, 1,2, 1,2,3, 1,2,3,4} kalıbına sahip
    bir dizi oluşturun (gruplamayı göstermek için boşluk eklendi)
    Dizinin uzunluğunun, toplamının tam olarak n*(n+1)/2 olduğu bilinen 1+2+3...+n olacağını unutmayın.
     */

    public static void main(String[] args) {

        int n = 4;
        System.out.println(Arrays.toString(seriOlustur(n)));
    }

    private static int[] seriOlustur(int n) {

        int [] yeniArr = new int[n*(n+1)/2]; // olusturacagim array'in uzunlugunu formulle belirledim

        int index=0; //

        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <= i; j++) {

                yeniArr[index] = j;

                index++;
            }
        }
        return yeniArr;
    }
}
