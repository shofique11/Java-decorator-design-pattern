//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Start with simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + "- $"+coffee.getCost());

        // Add Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + "- $"+coffee.getCost());
        // Sugar
        coffee = new SugerDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $"+coffee.getCost());
    }
}