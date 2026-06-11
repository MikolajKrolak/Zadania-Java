public class PoliticalCandidate implements Runner{
    private String meaning = "Startowanie w wyborach";

    @Override
    public void run(){
        System.out.println("PoliticalCandidate[Znaczenie: " + meaning + "]");
    }
}
