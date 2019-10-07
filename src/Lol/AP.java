package Lol;

public interface AP {
    public void magicAttack();
    default public void attack(){
        System.out.println("遭受了默认的魔法攻击");
    }
}
