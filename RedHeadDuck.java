public class RedHeadDuck extends Duck implements SwimBehaviour, FlyBehavior, QuackBehavior{
    @Override
    public void displayName() {
        System.out.println( "I am a redheaded Duck" );
    }
    @Override
    public void swim() {
        System.out.println( "I can swim" );
    }
    @Override
    public void Float() {
    }
    @Override
    public void sink() {
    }
    @Override
    public void fly(){
        System.out.println("I can Fly");
    }
    @Override
    public void notFly() {
    }
    @Override
    public void squeak() {
    }
    @Override
    public void Mutequack() {
    }
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
