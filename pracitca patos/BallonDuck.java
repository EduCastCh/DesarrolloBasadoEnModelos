public class BallonDuck extends Duck{

    public BallonDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithBallon();
        
    }

    public void display() {
        System.out.println("Soy un pato que vuela con un globo");
        
    }
}
