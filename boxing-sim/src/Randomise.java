import java.util.Random;
public class Randomise {
    static int randDamage(){
        Random r = new Random();
        return r.nextInt(15) + 5;
    }
    static int randHealth(){
        Random r = new Random();
        return r.nextInt(10) + 90;
    }
    static int randStarter(){
        Random r = new Random();
        return r.nextInt(2) + 1;
    }
    static int randDodgeChance(){
        Random r = new Random();
        int a = r.nextInt(2);
        if (a == 1)
            return 30;
        else
            return 20;
    }
}
