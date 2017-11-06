package org.example.pattern.singleton;

/**
 * @Title: DesignPanttern
 * @Description:懒汉式  (不是线程安全的)
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 13:50
 * @version:1.0
 */
public class Singleton
{
    public Singleton(){}
    private static Singleton single=null;

    public  static Singleton getInstance(){
        if(single!=null){
            synchronized (Singleton.class){
                single=new Singleton();
            }
        }
        return single;
    }
}