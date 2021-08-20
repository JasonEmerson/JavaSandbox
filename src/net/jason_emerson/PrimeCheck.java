package net.jason_emerson;

import java.util.ArrayList;
import java.util.List;

public class PrimeCheck {
    public static void main(String[] args) {

        List<Integer> pList  = primeList(100);
        List<Integer> pFactors = new ArrayList<>();
        System.out.println(findPrimeFactors(pList, pFactors, 21));
//        ----------------------------------------------------------
//        System.out.println(pList);
//        int[] arr = {61,71,83,88,97};
//        System.out.println(primeCheck(97));

//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " = " + compositeCheck(arr[i]));
//        }


    }

    public static List<Integer> findPrimeFactors(List<Integer> pList, List<Integer> pFactors, int n) {
        for(Integer i : pList) {
            if (n % i == 0) {
                pFactors.add(i);
                return findPrimeFactors(pList, pFactors,n/i);
            }
        }
        return pFactors;
    }





    public static boolean isPrime(int n) {
        if(n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isComposite(int n) {
        if(n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return true;
        }
        return false;
    }

    public static ArrayList<Integer> primeList(int num) {
        ArrayList<Integer> pList = new ArrayList<>();
        for(int i = 2; i < num; i++) {
            if (isPrime(i)) pList.add(i);
        }
        return pList;
    }



}
