public class stringSplosion {
	//this method repeatedly prints the inputed string starting from the first char to a later char every time
	public String stringS(String str) {
		String splosion = "";
		for(int i = 0; i < str.length();i++) {
			splosion = splosion + str.substring(0,i+1);
		}
		return splosion;
	}
}
