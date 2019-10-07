package Lol;

public abstract class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("物品使用后有效果");
    }
    public String toString(){
        return name+price;
    }
    public void finalize(){
        System.out.println("当前对象正在被回收");
    }
    public boolean equals(Object o){
        if(o instanceof Item){
            Item i = (Item) o;
                return this.price == ((Item) o).price;
        }
        else return false;
    }
    public abstract boolean disposable();
    public static void main(String[] args){
        Item i = new Item(){        //创建匿名类的对象
            public boolean disposable(){        //重写提供给外部类的方法
                name = "血瓶";
                System.out.println(name+"可以恢复生命值");
                return true;
            }
        };
        i.disposable();
    }
}
