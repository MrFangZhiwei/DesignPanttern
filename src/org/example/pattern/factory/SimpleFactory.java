package org.example.pattern.factory;

/**
 * @Title: DesignPanttern
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 9:48
 * @version:1.0
 */
interface Food{
    public void name();
}
class Fries implements Food{
    public void name(){
        System.out.println("Fries----");
    }
}

class Cola implements Food{
    public void name(){
        System.out.println("Cola----");
    }
}

public class SimpleFactory
{
    Food food;
    public  Food getFood(String name){
        switch (name){
            case "Fries":
                food=new Fries();
                break;
            case "Cola":
                food=new Cola();
                break;
            default:
                food=null;
                break;
        }

        return food;
    }
    public static void main(String[] args)
    {
        SimpleFactory sf = new SimpleFactory();
        sf.getFood("Fries").name();
        sf.getFood("Cola").name();
    }
}