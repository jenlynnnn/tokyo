package ghi;

public class BookMain {

	public static void main(String[] args) {
	
		TextBook tb = new TextBook();
        tb.setTitle("자바의 정석");
        tb.setAuthor("전공주");
        tb.setPrice(25000);
        tb.setSubject("자바");

        
	
	 System.out.println("<< 전공서적 정보 >>");
     tb.displayInfo();
	}
}
