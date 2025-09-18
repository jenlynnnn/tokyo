package ghi;


public class TextBook extends Book {
	    private String subject;

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("과목명: " + subject);
	    }
	}

