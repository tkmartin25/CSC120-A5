// `public void boardCar(Car c)` can call `c.addPassenger(this)` to board a given `Car` 
// (_Hint: this method should be ready to `catch` the `RuntimeException` that will be thrown by `c.addPassenger(...)` 
// in the event that the car is full._)
// `public void getOffCar(Car c)` can call `c.removePassenger(this)` to get off a given `Car` 
// (_Hint: this method should be ready to `catch` the `RuntimeException` that will be thrown by `c.removePassenger(...)` in the event 
// that the `Passenger` wasn't actually onboard._)

/** passenger class */
public class Passenger {
    
    String name;

    /** passenger constructor */
    public Passenger(String name) {
        this.name = name;
    }

    /** passenger boards car
     * @param Car c to be boarded by passenger
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) { // car is at max capacity, cannot board. 
            System.out.println("Car is already full. " + this.name + " cannot board this car.");
    }
    }

    /** passenger gets off car
     * @param car to be left
     */
    public void getOffCar(Car c) {
        try {
        c.removePassenger(this);
        } catch (Exception e) { // passenger isn't on car
            System.out.println(this.name + " isn't onboard this car.");
        }
    }
}


