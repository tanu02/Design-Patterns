package composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef chef = new Chef();
		Dish dish = chef.createDish();
		chef.presentDish(dish);
	}

}
