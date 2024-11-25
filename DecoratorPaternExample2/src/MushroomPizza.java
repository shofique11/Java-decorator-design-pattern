public class MushroomPizza extends PizzaDecorator{
    public MushroomPizza(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Mushroom";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}
