package Lol;

public class APHero extends Hero implements AP,Mortal{

    public APHero(String name){
        super(name);
    }
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
    public void die(){
        System.out.println("遭受魔法攻击，已死亡");
    }
    public void attack(){
        magicAttack();
    }
}
