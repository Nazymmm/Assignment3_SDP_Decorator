package Ass3;

public class Cappuccino extends Beverage{
    public Cappuccino(String name){
        super(name);
        setPrice(15);
    }
    public void decorateBeverage(){
        System.out.println("Cost of:"+ name +":"+ " $ " + price);

    }

}
