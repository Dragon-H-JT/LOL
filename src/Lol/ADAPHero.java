package Lol;

public class ADAPHero extends Hero implements AD,AP,Mortal {
    public ADAPHero(String name){
        super(name);
    }


    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    public void attack() {
        System.out.println("自己的attack方法");
    }

    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
    public void die(){
        System.out.println("遭受混伤攻击，已死亡");
    }


    /*public void attack(){
        die();
    }*/

}
