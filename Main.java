// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Paladin human= new Paladin("Paladin", 20, 2, "Human");
       FallenShaman fallenShaman= new FallenShaman("FallenShaman", 19, 3, "Monster");
        while (true){
            human.attack(fallenShaman);
            fallenShaman.attack(human);
            if (fallenShaman.getHealth()<=0){
                System.out.println(fallenShaman.getName()+" -kill");
                break;
            }
            if (human.getHealth()<=0){
                System.out.println(human.getName() + "kill");
                break;

            }

        }


    }
}