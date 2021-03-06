package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getHeight() <= 145.00 && visitor.getAge() >= 12){
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
