import directions.DirectionService;
import travels.BicyclingTravelMode;
import travels.DrivingTravelMode;
import travels.TransitTravelMode;
import travels.WalkingTravelMode;

public class DirectionsExample {
    public static void main(String[] args) {
        var directionService = new DirectionService();
        directionService.setTravelMode(new BicyclingTravelMode());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new DrivingTravelMode());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new TransitTravelMode());
        directionService.getEta();
        directionService.getDirection();

        directionService.setTravelMode(new WalkingTravelMode());
        directionService.getEta();
        directionService.getDirection();
    }
}