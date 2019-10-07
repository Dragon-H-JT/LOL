package Lol;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class Armor extends Item{
    int ac;
    public boolean disposable()
    {
        return true;
    }
    public static void main(String[] args){
        Armor bujia = new Armor();
        bujia.price = 300;
        bujia.name = "布甲";
        bujia.ac = 15;
        Armor suozijia = new Armor();
        suozijia.price = 500;
        suozijia.name = "锁子甲";
        suozijia.ac = 20;
        System.out.println(suozijia.name+"\t"+suozijia.price+"\t"+suozijia.ac+"\t");
        System.out.println(bujia.name+"\t"+bujia.price+"\t"+bujia.ac+"\t");
    }
}
