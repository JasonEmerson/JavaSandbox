package net.jason_emerson;

import java.util.ArrayList;
import java.util.List;

public class PrimeCheck {
    public static void main(String[] args) {
        List<Integer> pList  = getPrimeList(100);
        List<Integer> pFactors = new ArrayList<>();
        int[] arr = {13,23,33};
        int FIND_FACTOR = 77;
//  --------------------------------------------------------------------------
        System.out.println(findPrimeFactors(pList, pFactors, FIND_FACTOR));
//  --------------------------------------------------------------------------
        isPrimeSet(arr);
//  --------------------------------------------------------------------------
    }

    public static void isPrimeSet(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " = " + isPrime(arr[i]));
        }
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

    public static ArrayList<Integer> getPrimeList(int num) {
        ArrayList<Integer> pList = new ArrayList<>();
        for(int i = 2; i < num; i++) {
            if (isPrime(i))
                pList.add(i);
        }
        return pList;
    }
}
