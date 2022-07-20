public class Celeste implements Visitable{

    double rating;
    double price;

    public Celeste(double rating, double price){
        this.rating = rating;
        this.price = price;
    }

    public double getRating(){
        return rating;
    }

    public double getPrice(){
        return price;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }


}
