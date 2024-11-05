package org.example.exception_handling;

public class Connection {
    public void connect(){
        System.out.println("Connecting to DB");
    }
    public void disconnect(){
        System.out.println("Disconnecting from DB");
    }
    public void execute(String query) throws RuntimeException{
        System.out.println("Executing query:"+query);
    }
}
