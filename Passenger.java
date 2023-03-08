// `public void boardCar(Car c)` can call `c.addPassenger(this)` to board a given `Car` 
// (_Hint: this method should be ready to `catch` the `RuntimeException` that will be thrown by `c.addPassenger(...)` 
// in the event that the car is full._)
// `public void getOffCar(Car c)` can call `c.removePassenger(this)` to get off a given `Car` 
// (_Hint: this method should be ready to `catch` the `RuntimeException` that will be thrown by `c.removePassenger(...)` in the event 
// that the `Passenger` wasn't actually onboard._)

public class Passenger {
    
    String name;

    public Passenger(String name) {
        this.name = name;
    }
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println("Car is already full." + this + " cannot board this car.");
    }
    }

    public void getOffCar(Car c) {
        try {
        c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(this + " isn't onboard this car.");
        }
    }
}


