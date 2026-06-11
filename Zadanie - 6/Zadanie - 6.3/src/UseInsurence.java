public class UseInsurence {
    public static void main(String[] args){
        Insurance insurance1 = new Life();
        Insurance insurance2 = new Health();

        insurance1.display();
        insurance2.display();
    }
}