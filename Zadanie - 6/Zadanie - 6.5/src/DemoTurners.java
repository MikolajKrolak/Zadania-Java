public class DemoTurners {
    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        Page page = new Page();
        Pancake pancake = new Pancake();
        Car car = new Car();
        Game game = new Game();

        leaf.turn();
        page.turn();
        pancake.turn();
        car.turn();
        game.turn();
    }
}