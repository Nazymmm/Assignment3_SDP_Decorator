package Ass3;

public abstract class FlavourDecorator extends Beverage {
    public Beverage beverage;
    public FlavourDecorator(Beverage beverage){
        this.beverage = beverage;
        setName(beverage.getName()+"+"+getDecoratedName());
        setPrice(beverage.getPrice()+getIncrementPrice());
    }
    public void decorateBeverage(){
        beverage.decorateBeverage();
        System.out.println("Cost of:"+getName()+":"+ " $ "+ getPrice());
    }
    public abstract int getIncrementPrice();
    public abstract String getDecoratedName();
}


