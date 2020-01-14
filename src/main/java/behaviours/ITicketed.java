package behaviours;

import people.Visitor;

public interface ITicketed {

    public double defualtPrice(Visitor visitor);

    public double priceFor(Visitor visitor);
}
