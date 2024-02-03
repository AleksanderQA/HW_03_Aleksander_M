public class Main {
    public static void main(String[] args) {


        /* Task 1
         Git установлен git version 2.43.0.windows.1*/

        // Task 2
        Car myNewCar = new Car();

        myNewCar.startEngine();
        myNewCar.stopEngine();

        myNewCar.brand = "Kia";
        myNewCar.year = 2018;
        myNewCar.model = "Sorento";

        System.out.println(myNewCar.brand +" "+ myNewCar.model +" "+ myNewCar.year);

        // Task 3
        Calculator calculator = new Calculator(); // Создание объекта класса калькулятор
        System.out.println(calculator.addition(5,8));  // Применение метода addition для сложения двух значений
        System.out.println(calculator.isGreater(5,6)); // Применение метода isGreater для сравнение двух значений

        // Task 4
        NumberManipulator numberManipulator = new NumberManipulator(); // создание объекта класса с методами incrementByOne и decrementByOne
        int number = 10;
        System.out.println("Before increment: " + number);  // вывод числа в консоль перед вызовом метода

        int incrementedNumber = numberManipulator.incrementByOne(number);// Вызывается метод incrementByOne() объекта numberManipulator, передавая ему текущее значение number++
        System.out.println("Number after increment: " + incrementedNumber); // Вызывается метод incrementByOne() объекта numberManipulator, передавая ему текущее значение number++

        System.out.println("Before decrement: " + number); // Выводим текущее значение переменной number перед уменьшением

        int decrementedNumber = numberManipulator.decrementByOne(number); // Вызывается метод incrementByOne() объекта numberManipulator, передавая ему текущее значение number--
        System.out.println("Number after decrement: " + decrementedNumber); // // вывод текстом + результат полученный при вызове метода




    }
}