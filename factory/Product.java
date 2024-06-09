package factory;

public class Product {
    
}

interface InnerProduct {
    void ride();
    void setting();
}

class Ebike() implements InnerProduct{
    public void setting() {
        System.out.println("Ebike set for user");
    }
    public void ride() {
        
    }
}

class Scooter() implements InnerProduct{
    public void setting() {

    }
    public void ride() {
        
    }
}

class ScooterHyper() implements InnerProduct{
    public void setting() {

    }
    public void ride() {
        
    }
}