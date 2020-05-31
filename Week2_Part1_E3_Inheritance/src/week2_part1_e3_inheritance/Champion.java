
package week2_part1_e3_inheritance;

public class Champion {
    String name;
    int speed;
    int damage;
    String type;
    int health;
    int stamina;
     Champion(String name,int speed)
    {
        this.name=name;
        this.speed=speed;
        this.stamina=100;
    }
    public void attack(Champion enemy)
    {
        enemy.health-=this.damage;
        enemy.stamina-=10;
        System.out.println("attack function in (*******Parent*******) class is  called");
    }
}
