package se.lexicon;



import java.util.ArrayList;
import java.util.List;


public class App {

    public static void behaviourToProducts(List<Product> list, Conditional conditional, Action action){
        for (Product p : list) {
            conditional.test(p);
            action.execute(p);
            break;
        }
    }





    public static void main( String[] args ) {


        PrintStock0 pS0 = new PrintStock0();

        //Products (Surfboards)
        Product surfBoard1 = new Product("Billabong Board", 5200, 3);
        Product surfBoard2 = new Product("Quicksilver Board", 5500, 2);
        Product surfBoard3 = new Product("Lost Board", 4900, 0);
        Product surfBoard4 = new Product("Rip Curl Board", 5000, 3);
        Product surfBoard5 = new Product("Channel Island Board", 5900, 0);

        //Products (Wetsuits)
        Product wetSuit1 = new Product("O'neil Suit", 1000, 3);
        Product wetSuit2 = new Product("Gul Suit", 800, 0);
        Product wetSuit3 = new Product("Rip Curl Suit", 1200, 0);
        Product wetSuit4 = new Product("Billabong Suit", 1250, 4);
        Product wetSuit5 = new Product("Quicksilver Suit", 1400, 2);

        //Products (Wax)
        Product wax1 = new Product("Gorilla Grip Wax", 75, 10);
        Product wax2 = new Product("Sticky Bump Wax", 90, 5);
        Product wax3 = new Product("Brazil Wax", 66, 0);

        //Products (Leash)
        Product leash1 = new Product("DaKine Leash", 250, 3);
        Product leash2 = new Product("O'neil Leash", 270, 0);
        Product leash3 = new Product("Billabong Leash", 270, 1);
        Product leash4 = new Product("Quicksilver Leash", 240, 0);
        Product leash5 = new Product("Brazil Leash", 160, 0);


        //List of Products
        List<Product> surfBoards = new ArrayList<>();
        List<Product> wetSuits = new ArrayList<>();
        List<Product> waxes = new ArrayList<>();
        List<Product> leashes = new ArrayList<>();


        surfBoards.add(surfBoard1);
        surfBoards.add(surfBoard2);
        surfBoards.add(surfBoard3);
        surfBoards.add(surfBoard4);
        surfBoards.add(surfBoard5);

        wetSuits.add(wetSuit1);
        wetSuits.add(wetSuit2);
        wetSuits.add(wetSuit3);
        wetSuits.add(wetSuit4);
        wetSuits.add(wetSuit5);

        waxes.add(wax1);
        waxes.add(wax2);
        waxes.add(wax3);

        leashes.add(leash1);
        leashes.add(leash2);
        leashes.add(leash3);
        leashes.add(leash4);
        leashes.add(leash5);



        //behaviourToProducts(surfBoards, pS0.test(), pS0.execute(surfBoard1));


    }


}
