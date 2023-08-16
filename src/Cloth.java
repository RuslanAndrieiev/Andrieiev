public class Cloth extends Shop{
    public Cloth(String name,int price){
        super(name,price);
    }
    public String toString(){
        return " - " + super.getName()+ super.getPrice();
    }

}
