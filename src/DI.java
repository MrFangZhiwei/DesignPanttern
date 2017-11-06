/**
 * @Title: DesignPanttern
 * @Description:依赖倒置原则
 * A.高层次的模块不应该依赖于低层次的模块，他们都应该依赖于抽象。
 * B.抽象不应该依赖于具体实现，具体实现应该依赖于抽象。
 * @Company:www.keyonecn.com
 * @author:fzw
 * @date:2017/11/6 8:24
 * @version:1.0
 */
interface Media
{
    public void play();
}
class CD implements Media {
    public void play(){
        System.out.println("playingCD------");
    }
}

class DVD implements Media {
    public void play(){
        System.out.println("playingDVD------");
    }
}

class Player{
    public void start(Media media){
        System.out.println("starting------");
        media.play();
    }
}
public class DI
{
    public static void main(String[] args)
    {
        Player player = new Player();
        player.start(new CD());
        player.start(new DVD());
    }
}