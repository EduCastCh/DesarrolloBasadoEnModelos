import java.util.ArrayList;
import java.util.List;

public class Pizza {
    String name;
	
    List<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
                System.out.println("... ");
		System.out.println("We are Preparing " + name);
	}

	public void bake() {
                System.out.println("... ");
		System.out.println("We are Baking " + name);
	}

	public void cut() {
                System.out.println("... ");
		System.out.println("We are Cutting " + name);
	}

	public void box() {
                System.out.println("... ");
		System.out.println("We are Boxing " + name);
                System.out.println("... ");
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
                System.out.println("Pizza Toppings: ");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}