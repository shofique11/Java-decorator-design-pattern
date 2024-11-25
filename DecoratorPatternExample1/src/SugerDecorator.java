public class SugerDecorator extends CoffeeDecorator{

    public SugerDecorator(Coffee coffee)
    {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.20;
    }
}
