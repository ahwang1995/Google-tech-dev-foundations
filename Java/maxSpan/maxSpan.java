public class maxSpan{
	public int maxSpan(int[] nums) {
	  int curMax = 0;
	  if(nums.length == 0){
	    return curMax;
	  }
		  for(int i = 0; i <= nums.length-2;i++){
		  	for(int j = nums.length - 1; j > 0 + i; j--){
		  		if(nums[i] == nums[j]){
		  			if(j-i > curMax){
		  				curMax = j-i;
		  			}
		  		}
		  	}
		  }
		  return curMax+1;
	}
}