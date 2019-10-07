package Lol;

public class Support extends Hero implements Healer{
    public Support(String name){
        super(name);
    }
    public void Heal(){
        System.out.println("一共加了"+hp+"点血");
    }
    public static void main(String[] args){
        /*Support h = new Support();
        h.hp = 500;
        h.Heal();*/
    }
    public void attack(){
        System.out.println("子类中抽象函数的实现");
    }
}
