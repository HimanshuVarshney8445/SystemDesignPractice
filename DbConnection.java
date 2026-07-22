class Connection{
    private static Connection instance;
    private Connection(){}
    public static Connection getInstance(){
        if(instance==null){
            instance = new Connection();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Connected to database");
    }
}
public class DbConnection{
    public static void main(String[] args) {
        Connection db1 = Connection.getInstance();
        Connection db2 = Connection.getInstance();
        db1.connect();
        if(db1==db2){
            System.out.println("Both are same instance");
        }
        
    }
}