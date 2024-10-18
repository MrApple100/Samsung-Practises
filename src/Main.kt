import model.Animal
import model.Car
import java.awt.Color
import java.util.Arrays
import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//
//    val car1 = Car(Color.red,123,"Lada sedan")//конструктор
//    val car2 = Car(Color.red,123,"Lada sedan")//конструктор
//    val car3 = Car(Color.red,123,"Lada sedan")//конструктор
//    val car4 = Car(Color.red,123,"Lada sedan")//конструктор
//    // объект  класс
//    val cabriolet = Cabriolet(Color.PINK,777,"BMW")
//    val gruzovik = Gruzovik(Color.red,123,"Lada sedan",Destination.North)//конструктор
//
//    car1.reDraw(Color.BLACK)
//    cabriolet.changeStateRoof()
//    car1.setColor(Color.DARK_GRAY)
//    println(car1.getColor())
//
//    var animal: Animal = Animal("123","kangaroo",10) // gc garbage collector
//
//
//    when(gruzovik.destination){
//        Destination.North -> {
//            //едем к дед морозу
//        }
//        Destination.South -> {
//
//        }
//        Destination.West -> {
//
//        }
//        Destination.East -> {
//
//        }
//    }
//    println(Car.count) //?  0 //статичная переменная
//    car1.makeSignal()
//    println(Car.count) //?  1
//    car2.makeSignal()
//    println(Car.count) //?  2
//    car3.makeSignal()
//    println(Car.count) //?  3
//    car4.makeSignal()
//    println(Car.count)//?  4
//    val input = Scanner(System.`in`)
//
//
//
//    val rectangle = Rectangle(10,10)
//    val circle = Circle(10)
//    val triangle = Triangle(10,10)
//    println(rectangle.area())
//    println(circle.area())
//    println(triangle.area())


    val car1 = Car(Color.red,1456,"Lada sedan")//конструктор
    val car2 = Car(Color.red,234,"Lada sedan")//конструктор
    val car3 = Car(Color.red,679,"Lada sedan")//конструктор
    val car4 = Car(Color.red,123,"Lada sedan")//конструктор

    var arrayCars = arrayOf(car1,car2,car3,car4)

    println(arrayCars.contentToString())

    val customComparator = CustomComparator()

    Arrays.sort(arrayCars,CustomComparator())
    println(arrayCars.contentToString())

    val wizard1 = Wizard()
    val wizard2 = Wizard()
    val knoght = knoght()
    wizard1.attack(knoght)


}

fun hi(){

}