public class Solution {
            public static void main(String[] args){
            int [] nums = {2,7,11,15};
            int target  = 9;
                for (int i = 0; i < nums.length; i++) {
                    for (int j = i+1; j < nums.length; j++) {
                        if (nums[i] == target - nums[j]) {
                            System.out.println(i);
                            System.out.println(j);
                        }
                    }
                }
                // In case there is no solution, we'll just return num
                // System.out.println("0");
            }
        }
