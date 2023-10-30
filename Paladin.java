public class Paladin extends Character {

    public Paladin(String name, int health, int power, String race) {
        super(name, health, power, race);
    }

    @Override
    public void attack(Monster target) {
        int health = target.getHealth();
        int power = target.getPower();
        health -= power;
        target.setHealth(health);
    }

    @Override
    public void defend(int attackPower) {
        int health = getHealth();
        health+=attackPower;
        setHealth(health);
    }
}
