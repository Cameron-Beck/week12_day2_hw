package stalls;

import behaviours.IReviewed;

public class  CandyflossStall extends Stall implements IReviewed {

    public CandyflossStall(int rating, String name, String ownerName, ParkingSpot parkingSpot) {
        super(rating name, ownerName, parkingSpot);
    }


    public int getRating() {
        return rating;
    }
}
