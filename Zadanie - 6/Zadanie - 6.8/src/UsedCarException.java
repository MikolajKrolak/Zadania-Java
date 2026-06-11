public class UsedCarException extends Exception{

    public UsedCarException(String VIN){
        super("Wyjątek VIN " + VIN);
    }
}
