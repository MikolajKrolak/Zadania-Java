public class Health extends Insurance{
    public Health(){
        super("Health");
        setCost();
    }
    @Override
    public void setCost(){
        this.monthlyPrice = 196.0;
    };
    @Override
    public void display(){
        System.out.println("Typ: " + getType() + ", koszt: " + getMonthlyPrice());
    };
}