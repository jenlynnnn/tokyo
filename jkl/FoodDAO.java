package jkl;
import java.util.ArrayList;
import java.util.List;

public class FoodDAO {
	private List<FoodDTO> foodList;

	public FoodDAO() {
		foodList = new ArrayList<>();

	}
	
	public void addFood(FoodDTO food) {
        foodList.add(food);
    }

    public List<FoodDTO> getAllFoods() {
        return foodList;
    }

}
