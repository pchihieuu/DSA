package leetCode;

import java.util.HashMap;

public class twoSum {
	 public int[] twoSum(int[]nums, int target){
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i<nums.length;i++){
	            map.put(nums[i], i);
	        }
	        
	        for(int i=0;i<nums.length;i++){
	            
	            int difference = target - nums[i];
	            
	            if(map.containsKey(difference) && map.get(difference)!=i){
	                return new int[] {map.get(difference), i};
	            }
	        }
	        return nums;
	    }

}
