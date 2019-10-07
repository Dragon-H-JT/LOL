package Lol;

public class ADHero extends Hero implements AD,Mortal{
    int moveSpeed = 400;

    public ADHero(String name){
        super(name);
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public void die(){
        System.out.println("遭受物理攻击，已死亡");
    }
    public static void battlewin(){
        System.out.println("ad单挑获胜");
    }
    public void attack(){
        physicAttack();
    }
    /*public ADHero(String name){
        super(name);
        System.out.println("AD hero的构造方法");
    }*/
    public void useItem(Item i){
        System.out.println("ad ues item");
        super.useItem(i);
    }
    public static void main(String[] args){
        /*Hero.battlewin();
        ADHero.battlewin();
        Hero h = new ADHero();
        h.battlewin();*/
        ADHero h  = new ADHero("盖伦");
        LifePotion Hp = new LifePotion();
        h.useItem(Hp);
    }
}
