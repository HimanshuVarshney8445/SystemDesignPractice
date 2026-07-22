interface RouteStrategy{
    void buildRoute(String source, String destination);
}

class CarRoute implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Building route for car from " + source + " to " + destination);
    }
}

class BikeRoute implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Building route for bike from " + source + " to " + destination);
    }
}

class WalkingRoute implements RouteStrategy{
    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Building route for walking from " + source + " to " + destination);
    }
}

class Navigator{
    private RouteStrategy route;
    public void setRouteStrategy(RouteStrategy route){
        this.route = route;
    }
    void navigate(String source,String destination){
        route.buildRoute(source,destination);
    }
}

public class RouteSt {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setRouteStrategy(new CarRoute());
        navigator.navigate("Delhi","Agra");

        navigator.setRouteStrategy(new BikeRoute());
        navigator.navigate("Delhi", "Agra");

        navigator.setRouteStrategy(new WalkingRoute());
        navigator.navigate("Delhi", "Agra");
    }
}