public class Figure {

    double height;
    double width;
    double length;

    public Figure() { // не доделал

    }

    public  Figure(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public  double calculateVolume() {
        return this.length * this.width * this.height;


    }

}
