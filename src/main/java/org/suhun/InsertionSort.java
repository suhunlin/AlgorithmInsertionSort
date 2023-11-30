package org.suhun;

public class InsertionSort {
    public int[] insertion_sort(int[] nums){
        for(int round = 0; round<nums.length; round++){
            for(int i_round = round; i_round >=1; i_round--){
                if(i_round == 0) break;
                if(nums[i_round-1]<nums[i_round]){
                    swap(nums, i_round -1, i_round);
                }else{
                    break;
                }
            }
        }
        return  nums;
    }

    public int[] insertion_sort_teacher(int[] nums){
        for(int i_start = 0; i_start<nums.length; i_start++){
            for(int j_run = i_start -1; j_run >=0; j_run-- ){ //1.j_run = i_start -1代表剩下的東西只有一個，沒得比較 2.j_run--往左邊跑一格
                if(nums[j_run + 1] > nums[j_run]){
                    swap(nums, j_run + 1, j_run);
                }else{
                    break;
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
