package org.example.pattern.factory;

/**
 * @Title: DesignPanttern
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 13:13
 * @version:1.0
 */
interface AppleWatch{
    public void showtime();
}
interface AppleIphone{
    public void useapp();
}
interface AppleFactory{
    public AppleWatch CreateAppleWatch();
    public AppleIphone CreateAppleIphone();

}
class Iphone implements AppleIphone{
    @Override
    public void useapp()
    {
        System.out.println("使用APP");
    }
}
class Watch implements  AppleWatch{

    @Override
    public void showtime()
    {
        System.out.println("展示时间");
    }
}
 class ChinaFactory implements AppleFactory{

    @Override
    public AppleWatch CreateAppleWatch()
    {
        System.out.println("创建苹果手表");
        AppleWatch watch = new Watch();
        return watch;
    }

    @Override
    public AppleIphone CreateAppleIphone()
    {
        System.out.println("创建苹果手机");
        AppleIphone iphone = new Iphone();
        return iphone;
    }
}
public class AbstractFactory
{
    public static void main(String[] args)
    {
        ChinaFactory factory = new ChinaFactory();
        factory.CreateAppleIphone().useapp();
        factory.CreateAppleWatch().showtime();
    }
}