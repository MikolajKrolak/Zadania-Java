public class Machine implements Runner{
    private String meaning = "Działanie";

    @Override
    public void run(){
        System.out.println("Machine[Znaczenie: " + meaning + "]");
    }
}
