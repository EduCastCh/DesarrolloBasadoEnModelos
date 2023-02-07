public class App {
    public static void main(String[] args){
        Beverage beverage0 = new Expresso();
        beverage0 = new LargeSize(beverage0);
        System.out.println(beverage0.getDescription() + " $" + beverage0.cost());
        
        Beverage beverage = new Expresso();
        beverage = new MediumSize(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        //beverage3 = new LargeSize(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
