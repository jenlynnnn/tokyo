package jkl;

public class SportDTO {
	
	private String name;
    private String memberId;
    private int baseCalorie;
    private int burnedCalorie;
    
	public SportDTO(String name, String memberId, int baseCalorie, int burnedCalorie) {
	
		this.name = name;
		this.memberId = memberId;
		this.baseCalorie = baseCalorie;
		this.burnedCalorie = burnedCalorie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getBaseCalorie() {
		return baseCalorie;
	}

	public void setBaseCalorie(int baseCalorie) {
		this.baseCalorie = baseCalorie;
	}

	public int getBurnedCalorie() {
		return burnedCalorie;
	}

	public void setBurnedCalorie(int burnedCalorie) {
		this.burnedCalorie = burnedCalorie;
	}

	@Override
	public String toString() {
		return "회원명" + name + ", 회원번호" + memberId + ", 기준칼로리" + baseCalorie + ", 소비칼로리"
				+ burnedCalorie + "]";
	}

	

}
