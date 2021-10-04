package Ass3;

public class ZebraCoffee {
    public static void main(String args[]){
        Beverage beverage = new MilkDecorator(new ChocolateDecorator(new Cappuccino("Cappuccino")));
        beverage.decorateBeverage();
        beverage = new ChocolateDecorator(new MilkDecorator(new Espresso("Espresso")));
        beverage.decorateBeverage();
    }

}
