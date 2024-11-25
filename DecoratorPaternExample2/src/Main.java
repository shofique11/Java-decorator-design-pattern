//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " - $"+pizza.getCost());

        pizza = new CheesePizza(pizza);
        System.out.println(pizza.getDescription() + "- $"+pizza.getCost());

        pizza = new PepperoniPizza(pizza);
        System.out.println(pizza.getDescription() + "- $"+pizza.getCost());
        pizza = new MushroomPizza(pizza);
        
        System.out.println(pizza.getDescription()+ "- $"+pizza.getCost());
    }
}