package org.example.pattern.factory;

/**
 * @Title: DesignPanttern
 * @Description:方法工厂模式就是讲生成实例的方式交给实现接口的工厂实例
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 12:55
 * @version:1.0
 */
interface Device{
     void use();
}
interface Factory{
      Device create();
}
class  Mouse implements Device{

    @Override
    public void use()
    {
        System.out.println("使用鼠标");
    }
}
class KeyBoard implements Device{

    @Override
    public void use()
    {
        System.out.println("使用键盘");
    }
}
class MouseFactory implements Factory{
    public Device create()
    {
        System.out.println("创建鼠标在中国");
        Device mouse=new Mouse();
        return mouse;
    }
}
class KeyBoardFactory implements Factory{
    public Device create()
    {
        System.out.println("创建键盘在中国");
        Device keyBoard=new KeyBoard();
        return keyBoard;
    }
}
public class MethodFactory
{
    public static void main(String[] args)
    {
        MouseFactory mouseFactory = new MouseFactory();
        mouseFactory.create().use();
        KeyBoardFactory keyBoardFactory = new KeyBoardFactory();
        keyBoardFactory.create().use();
    }
}