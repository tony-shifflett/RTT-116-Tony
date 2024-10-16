package PA303_10_1;

public class StoneMonster extends Monster {

    StoneMonster(String name){
        this.name = name;
    }

    public String attack(){
        return ("Attack with stones!");
    }
}