package org.example.pattern.factory;

/**
 * @Title: DesignPanttern
 * @Description:
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 12:55
 * @version:1.0
 */
interface Device{
    public void use();
}
interface Factory{
    public  Device create();
}
class  Mouse implements Device{

    @Override
    public void use()
    {
        System.out.println("使用鼠标");
    }
}
class KeyBorad implements Device{

    @Override
    public void use()
    {
        System.out.println("使用键盘");
    }
}
class MouseFactory implements Factory{
    public Device create()
    {
        System.out.println("创建鼠标");
        Device mouse=new Mouse();
        return mouse;
    }
}
class KeyBoardFactory implements Factory{
    public Device create()
    {
        System.out.println("创建键盘");
        Device keyBoard=new KeyBorad();
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