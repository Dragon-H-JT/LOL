package Lol;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.SplittableRandom;
import Lol.Item;

public abstract class Hero  {
    String name; // 名字
    float hp;   //血量
    float armor;    //护甲
    int moveSpeed;  //移动速度
    int killMount;  //杀人数
    int assistanMount;  //助攻数
    int money;          //金钱
    String killSaying;  //杀后说得话


    public void Kill(Mortal m) {
        m.die();
    }
    public void useItem(Item i){
        System.out.println("Hero ues item");
        i.effect();
    }
    /*public Hero(){
        System.out.println("Hero的无参构造方法");
    }*/
   public Hero(String name){
        System.out.println("Hero的带参构造方法");
        this.name = name;
    }
    public static void battlewin(){
        System.out.println("英雄单挑获胜");
    }
    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        else return false;
    }
    /*public  void attack(){
       System.out.println("111");
    }*/
    /*class BattleScore{
       int kill;
       int die;
       int assit;
       public void legendary(){
           if(kill >= 8){
               System.out.println(name+"超神！");
           }
           else
           {
               System.out.println(name+"尚未超神");
           }
       }
    }*/
    /*private static void win(){
        System.out.println("胜利！");
    }
    static class win{
        int hp = 500;
        public void checkIfVictory(){
            if(hp == 0){
                Hero.win();
            }
            else {
                System.out.println("游戏尚未结束");
            }
        }
    }*/

   public static void main(String[] args) {
        ADHero ad = new ADHero("亚索");
        ad.attack();
        System.out.println(ad);

        Hero h = new Hero("瞎子"){
            public void attack(){
                System.out.println("新的进攻手段");
            }
        };
        System.out.println(h);
   }
}


