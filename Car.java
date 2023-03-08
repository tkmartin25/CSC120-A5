// a private `ArrayList` where it will store the `Passenger`s currently onboard
// and an `int` for the `Car`'s maximum capacity 
//(since `ArrayList`s will expand as we add objects, we'll need to manually limit their size)
// a constructor, which takes in an initial value for the `Car`'s maximum capacity
// and initializes an appropriately-sized `ArrayList`
// accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` 
// that return the maximum capacity and remaining seats, respectively
// methods `public void addPassenger(Passenger p)` 
// and `public void removePassenger(Passenger p)` 
// to add or remove a `Passenger` from the `Car` 
// (_Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that 
// the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, throw a `RuntimeException`._)
// and a final method `public void printManifest()` that prints out a list of 
// all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board)
import java.util.ArrayList;

public class Car {
    String name; 
    private ArrayList<Passenger> passengers_onboard;
    int car_max_capacity;

    public Car(String name, int car_max_capacity); {
        this.name = name;
        this.car_max_capacity = car_max_capacity;
        this.passengers_onboard = new ArrayList<Passenger>();
    }
    
    public int getCapacity() {
        System.out.println("The max capcity of this car is " + car_max_capacity);
    }

    public int seatsRemaining() {
        System.out.println("The number of remaining seats in this car is " + this.car_max_capacity - this.passengers_onboard.size());
    }

    public void addPassenger(Passenger p) {
        if (this.passengers_onboard.contains(p)) { // already on board
            throw new RuntimeException(s.name + " is already onboard " + this.name);
        }
        if (this.passengers_onboard.size() >= car_max_capacity) { // car is full
            throw new RuntimeException(this.name + " is already at capacity, " + p.name + " cannot board this car.");
        }
        this.passengers_onbard.add(p);
        System.out.println(p.name + " successfully boarded " + this.name +"; " + (this.car_max_capacity - this.passengers_onboard.size()) + " seats remaining.");
    }

    public void removePassenger(Passenger p) {
        if ((this.passengers_onboard.contains(p)) = FALSE) { // not on board
            throw new RuntimeException(s.name + " is not onboard " + this.name);
        }
        this.passengers_onbard.remove(p);
        System.out.println(p.name + " successfully exited " + this.name +"; " + (this.car_max_capacity - this.passengers_onboard.size()) + " seats remaining.");
    }

    public void printManifest() {
        if (this.passengers_onbaord.size() = 0) { // no passengers onboard the car
            System.out.println("This car is EMPTY.");
        }
        else {
            for (p in passengers_onboard) {
                System.out.println(p.name);
            }
        }
    }
}