/**
 * The player the user will control
 */

public abstract class Protagonist extends Character {

//    Error:(76, 11) java: Protagonist is abstract; cannot be instantiated
    protected String name;

    /**
     * standard getter
     * @return the name of the Protagonist
     */

    public String getName() {
        return name;
    }

    /**
     * standard setter
     * @param name the name you want the Protagonist to have
     */

    public void setName(String name) {
        this.name = name;
    }


    /**
     * Prepares the player for a special attack by increasing the damage dealt
     * as well as decreasing defense of the player
     */

    public void specialize() {
        // changes defense and attackRating by arbitrary values, maybe randomize them later?
        setDefense((int) (getDefense() * 0.5));
        setAttackRating(getAttackRating() * 2.0);
    }

    /**
     * Undoes the effects of specialize()
     */

    public void normalize() {
        setDefense(getDefense() * 2);
        setAttackRating(getAttackRating() / 2.0);
    }

    /**
     * @return the name of the Protagonist
     */

    @Override
    public abstract String toString();

//    Error:(5, 8) java: Protagonist is not abstract and does not override abstract method toString() in Protagonist
//    Error:(65, 21) java: toString() in Protagonist cannot override toString() in java.lang.Object
//    attempting to assign weaker access privileges; was public
}
