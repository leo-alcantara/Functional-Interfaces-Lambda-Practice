package se.lexicon;

public class IncreasePrice implements Conditional, Action {
    @Override
    public void execute(Product p) {
        p.setPrice(p.getPrice() + p.getPrice()*0.5);
    }

    @Override
    public boolean test(Product p) {
        return p.getStock() < 10 && p.getStock() > 0;
    }
}
