class Main{
    
    public static void main (String[] args) {
        
        Bike obj1 = new Bike(80000,2019);
        Bike obj2 = new Bike(100000,2021);
        
        System.out.println(obj1.calculatePrice());
        System.out.println(obj2.calculatePrice());
        
        
    }
}

abstract class Shape {
    abstract String calculatePrice();
}

class Bike extends Shape {
    private final double price;
    private final double model;

    Bike(double price, double model) {
        this.price = price;
        this.model = model;
        
    
    }

    @Override
    String calculatePrice() {
        String p = String.valueOf(price);  
        String m = String.valueOf(model);  
        return String.format("Bike with a model of  %s has price %s",m,p);   
        // return "s";
                
    }

  
}
