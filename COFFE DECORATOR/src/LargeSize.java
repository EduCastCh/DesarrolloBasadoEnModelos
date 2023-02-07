public class LargeSize extends SizeCup {
    Beverage beverage;

    public LargeSize(Beverage beverage){
        this.beverage = beverage;
    } 

    public String getDescription(){
        return beverage.getDescription() + ", Large";
    }

    public double cost(){

        return (beverage.cost() * 2);
    }
}
