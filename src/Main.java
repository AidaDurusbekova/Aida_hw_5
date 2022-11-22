public class Main {
    public static void main(String[] args) {

        Hero Atai = new Hero(6,10);
        System.out.println("health : " + Atai.health + " damage: " + Atai.damage);

        Hero Idris = new Hero(7, 20, "magical");
        System.out.println("health " + Idris.health + "damage " + Idris.damage + "superpower " + Idris.superpover );

        Boss Sady = new Boss ();
        Sady.setDamage(30);
        Sady.setHealth(40);
        Sady.setAttakType("magical");
        System.out.println("damage: " + Sady.getDamage() + " health: " + Sady.getHealth() + " attakType: " + Sady.getAttakType());


        
    }

}