
package week2_part1_e3_inheritance;

public class Main {

    public static void main(String[] args) {
        Champion chTank1=new Tank("tIran",70);
        Champion chArcherFire1=new ArcherFire("afIran",90);
        Champion archer=new Archer("aIran",100);
       ((Archer) archer).setArrow(7);
       System.out.println("Tank health:"+chTank1.health);
        System.out.println("Archer health:"+archer.health);
        System.out.println("chArcherfire health:"+chArcherFire1.health);
        System.out.println("///////////////////////////////////////////");
        System.out.println("chTank Damage:"+chTank1.damage);
        System.out.println("Archer Damage:"+archer.damage);
        System.out.println("chArcherfire Damage:"+chArcherFire1.damage);
        System.out.println("///////////////////////////////////////////");
        chTank1.attack(archer);
        System.out.println("Archer1 health After Atack:"+archer.health);
        chTank1.attack(chArcherFire1);
        System.out.println("chArcherfire1 health After Atack:"+chArcherFire1.health);
        archer.attack(chTank1);
        System.out.println("chTank1 health After Atack:"+chTank1.health);
        System.out.println("chTank1 speed After Atack:"+chTank1.speed);
        System.out.println("chTank1 stamina After Atack:"+chTank1.stamina);
        
    }
    
}
