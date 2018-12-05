package strings;

public class Essay {
	
	private String name;
	private String text;
	public Essay(){
		name = "Heyden, Collin";
		text = "Essay text here";
	}
	
	public void setName(String newName) {
	  name = newName;
	}
	
	public void setText(String newText) {
	  text = newText;
	}
	
	public String lastName() {
	  String last = name.substring(name.indexOf(" ") + 1);
	  return last.toUpperCase();
	}
	
	public int firstName(){
	  String first = name.substring(0, name.indexOf(" "));
	  return first.length();
	}
	
	public boolean authorNameContainsX() {
	  return name.toLowerCase().contains("x");
	}
	
	public int numberOfWords() {
		int words = 1;
		for(int j = 0; j < text.length(); j++){
			if(text.charAt(j) == ' ') {
				words++;
			}
		
		}
		
		return words;
	  
	}

}
