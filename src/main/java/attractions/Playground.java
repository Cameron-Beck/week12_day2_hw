package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18){
            return true;
        }else{
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }
}
