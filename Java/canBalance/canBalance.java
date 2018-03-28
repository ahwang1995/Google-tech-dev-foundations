public class canBalance{
	public boolean canBal(int[] nums) {
		if(nums.length < 2){
			return false;
		}
		//store the sum of the left and right side of the array
		int right = 0;
		int left = 0;
		for(int i = 0; i < nums.length/2;i++){
			left += nums[i];
		}
		for(int i = nums.length/2; i <= nums.length-1;i++){
			right += nums[i];
		}
		//track the current midpoint to split at and increment/decrement based on the current value
		//return false if the array cannot be balanced
		int cursplit = nums.length/2;
		while(left != right){
			if(left > right){
				cursplit--;
				left -= nums[cursplit];
				right += nums[cursplit];
				if(right > left){
					return false;
				}
			}
			else{
				right -= nums[cursplit];
				left += nums[cursplit];
				cursplit++;
				if(left > right){
					return false;
				}
			}
		}
  		return true;
	}
}