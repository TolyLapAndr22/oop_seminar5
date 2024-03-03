package hw_oop_sem5.Units;

public class Monk extends UnitMage {
    String faith; // вера
    int enlightenment; // просветление
    int healing;//целительство

    public Monk(int x,int y,String name, int health, int stamina, int weapon, String faith, int enlightenment, int healing) {
        super(x,y,name, health, stamina, weapon,1);
        this.faith = faith;
        this.enlightenment = enlightenment;
        this.healing = healing;
    }

    public Monk(int x,int y,String name ) {
        super(x,y,name, 10, 4, 6,1);
        this.faith = "christianity";
        this.enlightenment = 7;
        this.healing = 8;
    }

    @Override
    public String toString() {
        return getInfo() + " \'" +
                name + '\'' +" \u2665 "+this.health
                ;
    }
    public String getInfo(){
        return  "Монах";
    };

}
