public class DoctorEggman extends Monster {
    
    public DoctorEggman() {
        super(200, 30, 0.7);
    }
    
    public String toString() {
        super.toString();
        System.out.println("Sonic defeating ability: 100%");
    }
}