package org.javaOOPs2.singleton;

public class Client {
    public static void main(String[] args) {
//       Logging logging = Logging.getInstance();
        Logging logging = Logging.method();
        logging.info("print my message");
//       logging.info("print my message");
//       logging.info("print my message 2");
    }
}
