public class RubberDuck extends Duck implements SwimBehaviour, FlyBehavior, QuackBehavior{
    @Override
    public void displayName() {
        System.out.println( "I am a RubberDuck" );
    }
    @Override
    public void swim() {
    }
    @Override
    public void Float() {
        System.out.println( "I can float");
    }
    @Override
    public void sink() {
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
        System.out.println("I squeak");
    }
    @Override
    public void Mutequack() {
    }
    @Override
    public void quack() {
    }
}
