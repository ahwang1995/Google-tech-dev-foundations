public class withoutString{
	//removes all non overlapping instances of a substring from base strin (not case sens)
	public String withoutS(String base, String remove) {
	    while(base.toLowerCase().contains(remove.toLowerCase())){
	    	base = base.replaceFirst("(?i)"+remove,"");
	    }
	    return base;
	}
}