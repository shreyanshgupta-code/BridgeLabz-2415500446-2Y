import java.util.Scanner;
public class Item {
    private int itemcode;
    private String itemname;
    private int price;

    public Item(int itemcode,String itemname,int price){
        this.itemcode=itemcode;
        this.itemname=itemname;
        this.price=price;
    }
    public String getitemname(){
        return itemname;
    }
    public int getitemcode(){
        return itemcode;
    }
    public int getprice(){
        return price;
    }
    public void display(){
        System.out.println("item details : ");
        System.out.println("itemcode : "+itemcode);
        System.out.println("itemname : "+itemname);
        System.out.println("price : "+price);
    }
    public double totalcost(int quantity){
       double cost=price*quantity;
       return cost;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int itemcode,price,quantity;
        String itemname;
        System.out.print("itemcode : "); 
        itemcode=sc.nextInt();
        System.out.print("itemname : ");
        itemname=sc.next();
        System.out.print("price : ");
        price=sc.nextInt();
        System.out.print("quantity : ");
        quantity=sc.nextInt();
        Item item1=new Item(itemcode, itemname, price);
        item1.display();
        System.out.println("quantity : "+quantity);
        System.out.println("total cost : "+item1.totalcost(quantity));
        sc.close();
    }
}

