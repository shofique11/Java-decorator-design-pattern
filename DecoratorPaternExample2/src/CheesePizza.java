public class CheesePizza extends PizzaDecorator{
    public CheesePizza(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
