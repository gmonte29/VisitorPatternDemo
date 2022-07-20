public class main {


    public static void main(String[] args) {
        MarioMaker first = new MarioMaker(9, 59.99);
        HollowKnight second = new HollowKnight(9.4, 14.99);
        Celeste third = new Celeste(10, 19.99);


        visitorClass visitor = new visitorClass();

        first.accept(visitor);
        second.accept(visitor);
        third.accept(visitor);

    }
}
