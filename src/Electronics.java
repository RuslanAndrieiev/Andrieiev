public class Electronics extends Shop {
    public Electronics(String name,int price){
        super(name,price);
    }
    public String toString(){
        return " - " + super.getName()+ super.getPrice();
    }
}
