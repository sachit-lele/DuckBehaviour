public abstract class Duck extends DisplayName implements SwimBehaviour, FlyBehavior, QuackBehavior{
    @Override
    public void displayName() {
        System.out.println( "Duck" );
    }

    @Override
    public void swim() {
        System.out.println( "I swim" );
    }

    @Override
    public void fly() {
        System.out.println( "I fly" );
    }

    @Override
    public void quack() {
        System.out.println( "I quack" );
    }
}

