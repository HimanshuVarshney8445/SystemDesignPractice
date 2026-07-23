interface Transport{
    void travel(String source,String destination);
}

class Car implements Transport{
    @Override
    public void travel(String source,String destination){
        System.out.println("Travel by Car from " + source + " to " + destination);
    }
}

class Bike implements Transport{
    @Override
    public void travel(String source,String destination){
        System.out.println("Travel by Bike from " + source + " to " + destination);
    }
}

class Bus implements Transport{
    @Override
    public void travel(String source,String destination){
        System.out.println("Travel by Bus from " + source + " to " + destination);
    }
}

class TransportFactory{
    public static Transport createTransport(String type){
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else if (type.equalsIgnoreCase("bus")) {
            return new Bus();
        }
        return null;
    }
}

public class TransportSystem {
    public static void main(String[] args) {

        Transport car = TransportFactory.createTransport("car");
        car.travel("Delhi","Agra");

        Transport bike = TransportFactory.createTransport("bike");
        bike.travel("Mumbai","Pune");

        Transport bus = TransportFactory.createTransport("bus");
        bus.travel("Nasik","Bhopal");
    }
}
