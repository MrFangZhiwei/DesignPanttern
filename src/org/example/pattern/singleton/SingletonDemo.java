package org.example.pattern.singleton;

/**
 * @Title: DesignPanttern
 * @Description:饿汉式
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 13:50
 * @version:1.0
 */
public class SingletonDemo
{
    public SingletonDemo(){}
    private static final SingletonDemo single=new SingletonDemo();
    public  static SingletonDemo getInstance(){
        return single;
    }
}