 // a private `Engine` attribute, which we will mark with the keyword `final` to establish the **composition** relationship 
 // (e.g. `private final Engine engine;`)
 // a private `ArrayList` to keep track of the `Car`s currently attached
 // a constructor `public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)`
 // which will initialize the `Engine` and `Car`s and store them
 // a couple of accessors: 
    // `public Engine getEngine()`
    // `public Car getCar(int i)` to return the `i`th car
    // `public int getMaxCapacity()` which will return the maximum total capacity across all `Car`s
    // `public int seatsRemaining()` which will return the number of remaining open seats across all `Car`s
// and finally, its own `public void printManifest()` that prints a roster of all `Passenger`s onboard (_Hint: your `Car`s can help!_)
import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars_attached;
    double fuelCapacity;
    int nCars;
    FuelType fuelType;
    int passengerCapacity;
    int seatsTaken;
    String total_passsengers;

    public Train(Engine engine, FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.engine = engine;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = nCars;
        this.passengerCapacity = passengerCapacity;     
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return this.cars_attached.get(i);
    }

    public int getMaxCapacity(){
        for (int i = 0; i < cars_attached.size(); i++) {
            passengerCapacity = passengerCapacity + cars_attached.get(i).car_max_capacity;
        }
        System.out.println("This train's max capacity is " + passengerCapacity);
        return passengerCapacity;
    }

    public int seatsRemaining(){
        for (int i = 0; i < cars_attached.size(); i++) {
            seatsTaken = seatsTaken + cars_attached.get(i).seatsRemaining;
        }
        return this.getMaxCapacity() - seatsTaken;

    }

    public void printManifest() {
        for (int i = 0; i < cars_attached.size(); i++) {
            cars_attached.get(i).printManifest();
        }
    }
    public static void main(String[] args) {
        Engine engine = new Engine("engine 1", 24, 400, FuelType.ELECTRIC);
        Car car_1 = new Car("car 1", 6);
        Passenger teddy = new Passenger("Teddy Martin");
        Passenger amelia = new Passenger("Amelia Babb");
        Passenger egg = new Passenger("Anna-Lee Thompson");
        Train myTrain = new Train(engine, FuelType.ELECTRIC, 400, 8, 160);
        teddy.boardCar(car_1); // success boarding
        amelia.boardCar(car_1); // success boarding
        car_1.printManifest(); // successfully prints names on car 1 
        amelia.getOffCar(car_1); // success exiting
        teddy.getOffCar(car_1); // success exiting
        car_1.printManifest(); // successfully says car 1 is empty
        engine.refuel(); // success refuel
        engine.go(); // success lowering fuel level
        car_1.getCapacity(); // successfully says car's max capacity
        car_1.seatsRemaining(); // successfully says number of seats left
        car_1.addPassenger(amelia); // successfully adds amelia to car 1
        car_1.addPassenger(teddy); // successfully adds teddy to car 1
        // car_1.addPassenger(egg); successfully says car 1 is at capacity
        // car_1.addPassenger(amelia); successfully says Amelia is already onboard car 1
        // car_1.seatsRemaining(); // successfully says number of seats left
        // car_1.removePassenger(egg); successfully says Anna-Lee is no on car 1
        car_1.removePassenger(amelia); // successfully exits car 1




    
    }

}








