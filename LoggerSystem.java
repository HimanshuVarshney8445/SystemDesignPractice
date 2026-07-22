import java.util.ArrayList;
class Logger{
    private static Logger instance;
    ArrayList<String> logs;
    private Logger(){
        logs = new ArrayList<>();
    }
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
    void log(String message){
        logs.add(message);
    }
    void printLogs(){
        for(String log: logs){
            System.out.println(log);
        }
    }
}
public class LoggerSystem {
    public static void main(String[] args) {
        Logger paymentLogger = Logger.getInstance();
        paymentLogger.log("Payment initiated");

        Logger inventoryLogger = Logger.getInstance();
        inventoryLogger.log("Inventory Updated");

        Logger orderLogger = Logger.getInstance();
        orderLogger.log("Order Placed");

        orderLogger.printLogs();

    }
}
