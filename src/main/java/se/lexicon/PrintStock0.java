package se.lexicon;


public class PrintStock0 implements Action, Conditional{


    @Override
    public void execute (Product p) {
        System.out.println(p);
    }


    @Override
    public boolean test(Product p) {
        return p.getStock() == 0;
    }
}
