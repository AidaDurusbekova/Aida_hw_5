public class Hero {


    int health;
    int damage;
    String superpover;


    public Hero(int  health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Hero(int health, int damage, String superpover) {
        this.health = health;
        this.damage = damage;
        this.superpover = superpover;
    }

    public String getSuperpover(){
        return superpover;
    }


}
