import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            String user = "Client-" + i;
            new Thread(() -> {
                try {
                    Hello stub = (Hello) Naming.lookup("rmi://localhost/HelloService");
                    System.out.println(stub.sayHello(user));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }).start();
        }
    }
}





















// Compile: javac *.java

// Terminal 1: java -cp . Server

// Terminal 2: java -cp . Client