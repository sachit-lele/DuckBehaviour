public class DecoyDuck extends Duck implements SwimBehaviour, QuackBehavior, FlyBehavior{
    @Override
    public void displayName() {
        System.out.println( "I am not a real Duck" );
    }
    @Override
    public void swim() {
    }
    @Override
    public void Float() {
    }
    @Override
    public void sink() {
        System.out.println("I cannot swim");
    }
    @Override
    public void fly(){
    }
    @Override
    public void notFly() {
        System.out.println("I cannot fly");
    }
    @Override
    public void squeak() {
    }
    @Override
    public void Mutequack() {
        System.out.println("I cannot quack");
    }
    @Override
    public void quack() {
    }
}
