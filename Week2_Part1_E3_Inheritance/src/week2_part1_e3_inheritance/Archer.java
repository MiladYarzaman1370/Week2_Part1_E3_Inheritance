
package week2_part1_e3_inheritance;

public class Archer extends Champion{
    int arrow;
    public Archer(String name, int speed) {
        super(name, speed);
        this.damage=30;
        this.health=100;
        
    }
    public void setArrow(int number)
    {
        this.arrow=number;
    }
    public void attack(Champion enemy )
    {    super.attack(enemy);
        
        enemy.speed-=(enemy.speed*0.1f);
        System.out.println("attack function in (*******divided*******) class is  called");
    }
}
