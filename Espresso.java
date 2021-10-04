package Ass3;

public class Espresso extends Beverage {

    public Espresso(String name){
        super(name);
        setPrice(10);
    }
    public void decorateBeverage(){
        System.out.println("Cost of:"+ name +":"+ " $ " + price);

    }

}