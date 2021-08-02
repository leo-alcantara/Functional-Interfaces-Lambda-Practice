package se.lexicon;

public class PrintBProducts implements Conditional, Action {

    @Override
    public void execute(Product p) {
        System.out.println(p);
    }

    @Override
    public boolean test(Product p) {
        return p.getProductName().startsWith("B");
    }
}
