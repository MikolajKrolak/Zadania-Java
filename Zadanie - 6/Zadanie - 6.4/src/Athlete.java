public class Athlete implements Runner{
    private String meaning = "Bieganie";

    @Override
    public void run(){
        System.out.println("Athlete[Znaczenie: " + meaning + "]");
    }
}
