public class MediumSize extends SizeCup{
    Beverage beverage;

    public MediumSize(Beverage beverage){
        this.beverage = beverage;
    } 

    public String getDescription(){
        return beverage.getDescription() + ", Medium";
    }

    public double cost(){

        return (beverage.cost() * 1.5);
    }


}
