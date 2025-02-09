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

/** creates car that stores passengers */
public class Car {
    String name; 
    private ArrayList<Passenger> passengers_onboard;
    int car_max_capacity;
    int seatsRemaining;

    /** car constructor */
    public Car(String name, int car_max_capacity) {
        this.name = name;
        this.car_max_capacity = car_max_capacity;
        this.passengers_onboard = new ArrayList<Passenger>();
    }
    
    /** prints car's max capacity
     * @return car max capacity*/ 
    public int getCapacity() {
        System.out.println("This car's max capacity is " + this.car_max_capacity + ".");
        return car_max_capacity;
    }

    /** prints number of seats remaining in car
     * @returns number of empty seats */ 
    public int seatsRemaining() {
        seatsRemaining = this.car_max_capacity - this.passengers_onboard.size();
        System.out.println("This car has " + this.seatsRemaining + " seat(s) left.");
        return seatsRemaining;
    }

    /** adds passenger to car 
     * @param passenger to be added
     * */ 
    public void addPassenger(Passenger p) {
        if (this.passengers_onboard.contains(p)) { // already on board
            throw new RuntimeException(p.name + " is already onboard " + this.name);
        }
        if (this.passengers_onboard.size() >= car_max_capacity) { // car is full
            throw new RuntimeException(this.name + " is already at capacity, " + p.name + " cannot board this car.");
        }
        this.passengers_onboard.add(p); // successfully boarding
        System.out.println(p.name + " successfully boarded " + this.name +"; " + (this.car_max_capacity - this.passengers_onboard.size()) + " seat(s) remaining.");
    }

    /** removes passenger from car 
     * @param passenger to be removed
     * */ 
    public void removePassenger(Passenger p) {
        if ((!this.passengers_onboard.contains(p))) { // not on board
            throw new RuntimeException(p.name + " is not onboard " + this.name);
        }
        this.passengers_onboard.remove(p); // successfully exits car
        System.out.println(p.name + " successfully exited " + this.name +"; " + (this.car_max_capacity - this.passengers_onboard.size()) + " seat(s) remaining.");
    }

    /** prints all passengers on car */
    public void printManifest() {
        if (this.passengers_onboard.size() == 0) { // no passengers onboard the car
            System.out.println("This car is EMPTY.");
        }
        else { 
            for (int i = 0; i < this.passengers_onboard.size(); i++) {
                System.out.println(this.passengers_onboard.get(i).name);
            }
        }
    }
}


