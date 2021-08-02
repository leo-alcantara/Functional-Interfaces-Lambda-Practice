package se.lexicon;

public class PrintPriceBetween implements Conditional, Action {
    @Override
    public void execute(Product p) {
        System.out.println(p);
    }

    @Override
    public boolean test(Product p) {
        return p.getPrice() < 10 && p.getPrice() > 0;
    }
}
