package Ass3;

public class MilkDecorator extends FlavourDecorator{
    public MilkDecorator(Beverage beverage){
        super(beverage);
    }
    public void decorateBeverage(){
        super.decorateBeverage();
        decorateMilk();
    }
    public void decorateMilk(){
        System.out.println("Added Milk to:"+beverage.getName());
    }
    public int getIncrementPrice(){
        return 2;
    }
    public String getDecoratedName(){
        return "Milk";
    }


}
