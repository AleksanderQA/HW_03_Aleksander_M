public class Figure {     // 4 Homework 1 task

    double height;
    double width;
    double length;

    public Figure() {   // 4 Homework, 2 task,  A constructor

    }

    public void Formula () {    //4 Homework, second method
        double calculation = 2 * (this.width * length + length * height + width * height);
        System.out.println("Area result = " + calculation);

    }

    public  Figure(double height, double width, double length) {   // подаём данные  на вход для объекта figure класса Figure
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public  double calculateVolume() { // 4 Homework , method for constructor B
        return this.length * width * height;


    }

}
