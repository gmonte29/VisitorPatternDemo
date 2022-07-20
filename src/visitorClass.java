public class visitorClass implements Visitor{


    @Override
    public void visit(HollowKnight item) {
        System.out.println("Hollow Knight");
        System.out.println("Price: "+"$"+item.getPrice());
        System.out.println("Rating: "+item.getRating());
        System.out.println();
    }

    @Override
    public void visit(MarioMaker item) {
        System.out.println("Mario Maker");
        System.out.println("Price: "+"$"+item.getPrice());
        System.out.println("Rating: "+item.getRating());
        System.out.println();

    }

    @Override
    public void visit(Celeste item) {
        System.out.println("Celeste");
        System.out.println("Price: "+"$"+item.getPrice());
        System.out.println("Rating: "+item.getRating());
        System.out.println();

    }
}
