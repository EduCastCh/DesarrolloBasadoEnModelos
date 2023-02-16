public class Main {
    public static void main(String[] args){
        NYPizzaStore nystore = new NYPizzaStore();
        ChicagoPizzaStore chicagostore = new ChicagoPizzaStore();
          
        Pizza pizza = nystore.orderPizza("pepperoni");
        System.out.println("Orden de Eduardo: " + pizza.getName() + "\n");
        
        pizza = chicagostore.orderPizza("veggie");
		System.out.println("Orden de Atenas: " + pizza.getName() + "\n");
    }
}
