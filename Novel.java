package ghi;

public class Novel extends Book{

	 private String genre;

	    public void setSubject(String genre) {
	        this.genre = genre;
	    }

	    public String getGenre() {
	        return genre;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("장르명: " + genre);
	    }
}
