package jkl;

public class FoodDTO {

	private String id;
	private String name;
	private int quantity;
	private String regDate;

	public FoodDTO(String id, String name, int quantity, String regDate) {

		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.regDate = regDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "식자재번호" + id + ", 식자재명" + name + ", 수량" + quantity + ", 등록번호" + regDate + "]";
	}

}
