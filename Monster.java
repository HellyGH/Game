public abstract class Monster {
    private String name;
    private int health;
    private int power;
     private String race;

    public Monster(String name,int health,int power, String race){
        this.name = name;
        this.health=health;
        this.power=power;
        this.race=race;
    }

    //getter
    public String getName() {
        return this.name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    public abstract void attack(Character target);

}
