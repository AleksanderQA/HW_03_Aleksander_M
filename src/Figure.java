public class Figure {     

    double height;
    double width;
    double length;
        // 4 Homework, 2 task,  A constructor
    public Figure() {   

    }
        //4 Homework, second method
    public void Formula () {    
        double calculation = 2 * (this.width * length + length * height + width * height);
        System.out.println("Area result = " + calculation);

    }

    public  Figure(double height, double width, double length) {   
        this.height = height;
        this.width = width;
        this.length = length;
    }
        // 4 Homework , method for constructor B
    public  double calculateVolume() { 
        return this.length * width * height;

    }

}
