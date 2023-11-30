package org.suhun;

public class Main {
    public static void main(String[] args) {
       InsertionSort insertionSort = new InsertionSort();
       int[] nums = {8, 2, 6, 10, 4, 20};
//       int[] result = insertionSort.insertion_sort(nums);
       int[] result = insertionSort.insertion_sort_teacher(nums);
       for(int num:result){
           System.out.println(num);
       }
    }
}