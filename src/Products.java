public class Products extends Shop {

    public Products(String name,int price){
        super(name,price);
    }
    public String toString(){
        return "-" + super.getName()+ super.getPrice();
    }
}
