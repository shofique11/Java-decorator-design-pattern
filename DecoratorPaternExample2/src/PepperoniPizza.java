public class PepperoniPizza extends PizzaDecorator{

    public PepperoniPizza(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
