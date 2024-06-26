package carDemo.service;

import carDemo.Car;
import carDemo.Engine;
import carDemo.Fueltank;
import carDemo.Wheel;

import java.util.ArrayList;
import java.util.List;

public class Carservice {

    public Car addcar (){
         Engine engine = new Engine();
         engine.horsePower="180";
         engine.enginecc="1200";
         engine.torque="400";

        Fueltank fueltank = new Fueltank();
        fueltank.fuelType="petrol";
        fueltank.capacity="30l";

        engine.fueltank=fueltank;

        Wheel wheel1 = new Wheel();
        wheel1.wheeltype="alloy wheels";
        wheel1.brandName="mrf";

        Wheel wheel2= new Wheel();
        wheel2.wheeltype="alloy wheels";
        wheel2.brandName="mrf";

        Wheel wheel3 = new Wheel();
        wheel3.wheeltype="alloy wheels";
        wheel3.brandName="mrf";

        Wheel wheel4 = new Wheel();
        wheel4.wheeltype="alloy wheels";
        wheel4.brandName="mrf";

        Car car = new Car();
        car.engine=engine;
        car.fueltank=fueltank;

        List<Wheel>noofwheels=new ArrayList<>();
        noofwheels.add(wheel1);
        noofwheels.add(wheel2);
        noofwheels.add(wheel3);
        noofwheels.add(wheel4);

        return car;

    }

}
