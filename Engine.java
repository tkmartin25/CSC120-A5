
// a private `FuelType` attribute to indicate what type of fuel it uses
//`double`s to store the current and maximum fuel levels (along with an approproate accessors for each)
// a constructor, which takes in initial values for the attributes named above and sets them appropriately
// a method `public void refuel()` which will reset the `Engine`'s current fuel level to the maximum
// a method `public void go()` which will decrease the current fuel level 
// and print some useful information (e.g. remaining fuel level) 
// provided the fuel level is above 0 (otherwise it should throw a `RuntimeException` containing an informative message)
public class Engine {

    FuelType fuelType;
    String name;
    double current_fuel_level;
    double max_fuel_level;

    public Engine(String name, double current_fuel_level, double max_fuel_level, FuelType fuelType) {
        this.name = name;
        this.current_fuel_level = current_fuel_level;
        this.max_fuel_level = max_fuel_level;
        this.fuelType = fuelType;
    }

    public void refuel() {
        this.current_fuel_level = max_fuel_level;
        System.out.println("Successfully refueled! New fuel level: " + current_fuel_level);
    }

    public void go() {
        if (this.current_fuel_level < 30) { // if fuel level is less than 30
            throw new RuntimeException(this.name + " does not have enough fuel to go anywhere.");
        } 
        this.current_fuel_level = current_fuel_level - 30;
        System.out.println("New fuel level: " + current_fuel_level);
    }


}