public class Panda extends Protagonist {

    private final int kungFuSkill;
    private final int rotundness;

    /**
     * Gets kungFuSkill
     *
     * @return value of kungFuSkill
     */

    public int getKungFuSkill() {
        return kungFuSkill;
    }

    /**
     * Gets rotundness
     *
     * @return value of rotundness
     */

    public int getRotundness() {
        return rotundness;
    }

    /**
     * Creates a Panda, a type of Protagonist
     *
     * @param name the name of the Panda
     * @param kungFuSkill how skillful the Panda is at KungFu
     * @param rotundness how rotund the Panda is
     */

    public Panda(String name, int kungFuSkill, int rotundness) {
        super(name);
        this.kungFuSkill = kungFuSkill;
        this.rotundness = rotundness;
    }

    /**
     * The panda commits seppuku, dealing a large amount of damage to itself and the monster
     *
     * @param monster is the monster to attack
     * @return the damage dealt
     */

    public int seppuku(Monster monster) {
        int damage = (int) Math.pow(getRotundness(), getKungFuSkill());
        setAttackRating(damage);
        setHp(1);
        return attack(monster);
    }
}
