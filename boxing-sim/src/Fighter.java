public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    Fighter(String name, int damage, int health, int weight, double dodgeChance) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodgeChance;
    }
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " damaged.");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodged.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }
    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodgeChance;
    }
}
