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
    }





}
