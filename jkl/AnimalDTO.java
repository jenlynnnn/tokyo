package jkl;

public class AnimalDTO {
	
	    private String id;
	    private String ownerName;
	    private String petName;
	    private int petAge;
	    private String phoneNumber;

	    public AnimalDTO(String id, String ownerName, String petName, int petAge, String phoneNumber) {
	        this.id = id;
	        this.ownerName = ownerName;
	        this.petName = petName;
	        this.petAge = petAge;
	        this.phoneNumber = phoneNumber;
	    }

	    public String getId() {
	        return id;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }

	    public String getPetName() {
	        return petName;
	    }

	    public int getPetAge() {
	        return petAge;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

		@Override
		public String toString() {
			return "아이디" + id + ", 보호자명" + ownerName + ", 반려 동물명" + petName + ", 반려 동물 나이" + petAge
					+ ", 연락처" + phoneNumber + "]";
		}

	    
	}

