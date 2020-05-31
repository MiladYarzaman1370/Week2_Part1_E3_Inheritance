
package week2_part1_e3_inheritance;

public class Tank extends Champion{
    
    
    public Tank(String name, int speed) {
        super(name, speed);
        this.damage=60;
        this.health=100;
    }
    
}
