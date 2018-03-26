public class maxSpan{
	//returns the inclusive distance between the leftmost and rightmost
	//appearances of a value 
	public int maxSpan(int[] nums) {
	  int curMax = 0;
	  //check if the array is empty
	  if(nums.length == 0){
	    return curMax;
	  }
	  //check if the left and rightmost elements are equal and iterate inwards
	  //if they are equal and the distance is greater than the curMax update the curMax
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