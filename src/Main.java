public class Main {
    public static void main(String[] args) {

        /* Homework 3, Task 1
        git version 2.43.0.windows.1*/

        //  Homework 3,  Task 2
        Car myNewCar = new Car();

        myNewCar.startEngine();
        myNewCar.stopEngine();

        myNewCar.brand = "Kia";
        myNewCar.year = 2018;
        myNewCar.model = "Sorento";        

        System.out.println(myNewCar.brand +" "+ myNewCar.model +" "+ myNewCar.year);


        
        //  Homework 3,  Task 3
        Calculator calculator = new Calculator();            
        System.out.println(calculator.addition(5,8));         
        System.out.println(calculator.isGreater(9,12));      


        
        // Homework 3, Task 4
        NumberManipulator numberManipulator = new NumberManipulator();     
        int number = 10;
        System.out.println("Before increment: " + number);                  

        int incrementedNumber = numberManipulator.incrementByOne(number);        
        System.out.println("Number after increment: " + incrementedNumber);       

        System.out.println("Before decrement: " + number);                 

        int decrementedNumber = numberManipulator.decrementByOne(number);       
        System.out.println("Number after decrement: " + decrementedNumber);      



        
        // 4 Homework
        Figure figure = new Figure(2.0, 3.0, 4.0);        
        System.out.println("Calculating value: " +  figure.calculateVolume());    
        Figure figure1 = new Figure(1.0, 2.0,3.0);
        figure1.Formula();
    }
}
