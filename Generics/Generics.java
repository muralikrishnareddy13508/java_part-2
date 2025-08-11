public class Generics {
    public static void main(String[] args){

        //Generics = A concept where you can write a class, interface, or method that is compatible with different data types.
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> true argument (specifies the type)

        //we have already seen generics in arraylists (ArrayList<String>)

        /*
        Box<String> box = new Box<>();

        box.setItem("banana");

        System.out.println(box.getItem());
        */ //box with one type

        Product<String, Double> product = new Product<>("apple", 20.23);
        Product<String, Integer> product1 = new Product<>("Superman ticket", 180);

        System.out.println(product.getItem());
        System.out.println(product.getPrice());

        System.out.println(product1.getItem());
        System.out.println(product1.getPrice());
    }
}
