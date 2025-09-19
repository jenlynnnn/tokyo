package jkl;
import java.util.ArrayList;
import java.util.List;

public class SportDAO {
	private List<SportDTO> SportList;
	
	public SportDAO( ) {
		SportList = new ArrayList<SportDTO>();
	}
	
	public void addSport( SportDTO sport) {
		SportList.add(sport);
		
	}
	public List<SportDTO> getALLSport(){
		return SportList;
		
	}
}
