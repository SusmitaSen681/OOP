
public class Encapsulation {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(31);
		System.out.println(l1.getPrice());

	}

}

class Laptop {
	private int price;
	int ram;

	public void setPrice(int price) {
		boolean isAdmin = false;
		if (isAdmin) {
			this.price = price;
		} else {
			System.out.println("You are not a admin");
		}

	}

	public int getPrice() {
		return price;
	}

}
