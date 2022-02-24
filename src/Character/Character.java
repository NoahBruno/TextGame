package Character;

public class Character {
    protected String name;
    protected String weapon;
    protected String shoes;
    protected int hitPoints;
    protected int attack;


//    public Character(String name,String weapon, String shoes, int stats){
//        this.name = name;
//        this.weapon = weapon;
//        this.shoes = shoes;
//        this.stats = stats;
//    }


    public void attack(int random, int attackPower){
        if (random == 4){
            System.out.println("attack missed!");
        }else {
             this.hitPoints -= attackPower;
        }
    }


    public void setCharacter(String name,String weapon, String shoes, int stats, int attack){
        this.name = name;
        this.weapon = weapon;
        this.shoes = shoes;
        this.hitPoints = hitPoints;
        this.attack = attack;
    }

    //displays the characters stats to the user
    public void getCharacter(){
        System.out.println(this.name +
                this.weapon +
                this.shoes +
                this.hitPoints);
    }


//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setWeapon(String weapon){
//        this.weapon = weapon;
//    }
//
//    public void setShoes(String shoes){
//        this.shoes = shoes;
//    }
//
//    public void setStats(int stats){
//        this.stats= stats;
//    }

    public String getName() {
        return this.name;
    }

    public String getWeapon(){
        return this.weapon;
    }

    public String getShoes(){
        return this.shoes;
    }

    public int getHitPoints(){
        return this.hitPoints;
    }

    public int getAttack(){
        return this.attack;
    }


}
