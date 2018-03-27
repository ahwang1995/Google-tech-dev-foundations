public class sumNumbers{
	//adds up the numbers seperated by characters or spaces in a string
	public int sumNumb(String str) {
		int sum = 0;
		String tempStr = "";
		//change to char array in order to iterate
		for (char c:str.toCharArray()){
			//if it is a digit append to tempStr
			if(Character.isDigit(c)){
				tempStr += c;
			}
			//if it is a char, add the previously stored digites and empty the tempstr
			else{
			  if(tempStr.length() >= 1){
				  sum = sum + Integer.parseInt(tempStr);
			  }
				tempStr = "";
			}
		}
		//add the number at the end of the string
		if(tempStr.length() >= 1){
			sum = sum + Integer.parseInt(tempStr);
		}
		return sum;
	}
}