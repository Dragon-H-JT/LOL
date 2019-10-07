package Lol;

public interface AD {
    public void physicAttack();
    default public void attack(){
        System.out.println("受到默认的物理攻击");
    }
}
