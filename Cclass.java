class Apple{
    String name;
    int stock;

public void newID(String n, int st){
    this.name = n;          // Apple.name = n;
    this.stock = st;        // Apple.stock = st;
                            // alternatives
}
public void deleteID(){
    this.name = "OUT OF STOCK!";
    this.stock = 0;

}
}


public class Cclass {
    public static void main(String[] args) {
        //creating an object from a class
        Apple macbook = new Apple();
        macbook.name = "Macbook Pro";
        macbook.stock = 83728;

        // new product
        Apple Mac = new Apple();
        Mac.name = "Mac PC";
        Mac.stock = 235;

        System.out.println(Mac.stock);

       Mac.deleteID();

       System.out.println(Mac.stock);
       System.out.println(Mac.name);



        
    }
}
