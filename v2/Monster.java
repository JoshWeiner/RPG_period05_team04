public class Monster extends Character{
    
    /**
     * Sets the respective fields of monsters to certain values
     */
    
    public Monster(int health, int defense, double attRate) {
        setHp(health);
        setStrength((int) (Math.random() * 45 + 20));
        setDefense(defense);
        setAttackRating(attRate);
    }
    
    public String toString() {
        System.out.println("Your name, you fiend: " + getName() +       System.lineSeparator()
                          + "Your health: " + getHp() + System.lineSeparator()
                          + "Your defense: " + getDefense() + System.lineSeparator()
                          + "Your attack rating: " + getAttackRating());
    }

}
