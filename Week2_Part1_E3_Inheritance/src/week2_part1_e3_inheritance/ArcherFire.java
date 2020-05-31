
package week2_part1_e3_inheritance;

public class ArcherFire extends Archer{
    
    public ArcherFire(String name, int speed) {
        super(name, speed);
        this.damage=43;
        this.health=100;
    }
    
}
