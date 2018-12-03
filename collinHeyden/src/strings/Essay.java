package strings;

public class Essay {
	
	private String authorsName;
	private String essayText;
	
	public Essay() {
		
		authorsName = "Heyden, Collin";
		essayText = "My essay.";
		
	}
	
	public Essay(String newAuthorName, String newEssayText) {
		
		authorsName = newAuthorName;
		essayText = newEssayText;
		
	}
	
	public void setAuthorsName(String newAuthorName) {
		
		authorsName = newAuthorName;

	}
	
	public void setEssayText(String newEssayText) {
		
		essayText = newEssayText;
		
	}
	
	public String returnAuthorCapital() {
		
		for(int i = 0; i <= authorsName.length(); i++) {

			if (authorsName.substring(i).startsWith(",")) {
				
				return authorsName;
				
			}
		
		}		
	}

}
