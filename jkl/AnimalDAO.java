package jkl;



	import java.util.ArrayList;
	import java.util.List;

	public class AnimalDAO {
	    private List<AnimalDTO> animalList;

	    public AnimalDAO() {
	        animalList = new ArrayList<>();
	    }

	    public void addPatient(AnimalDTO dto) {
	        animalList.add(dto);
	    }

	    public List<AnimalDTO> getAllPatients() {
	        return animalList;
	    }
	}

