package Ass3;

public class ChocolateDecorator extends FlavourDecorator{
    public ChocolateDecorator(Beverage beverage){
        super(beverage);
    }
    public void decorateBeverage(){
        super.decorateBeverage();
        decorateChocolate();
    }
    public void decorateChocolate(){
        System.out.println("Added Chocolate to:"+beverage.getName());
    }
    public int getIncrementPrice(){
        return 3;
    }
    public String getDecoratedName(){
        return "Chocolate";
    }

}
