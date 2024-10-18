package model

import IFly
import ISwim
import Shape
import java.awt.Color

open class Car(
    private var color:Color = Color.BLUE,
    var gosNomer:Int,
    private var model:String
): IFly,ISwim {
    override var countFlying: Int = 0
    companion object{
        var count:Int = 0

        fun countIncrease(){
            count++
        }
    }

   open fun makeSignal(){
       println("Громкий звук")
       countIncrease()
       val animal: Animal
   }
   fun reDraw(color:Color){
       this.color = color
   }

    //getter setter
    fun getColor():Color{
        return this.color
    }
    fun setColor(color:Color){
        this.color = color
    }


    override fun toString(): String {
        return "Car(gosNomer=$gosNomer)"
    }

    override fun fly() {
        super.fly()
        //научил машину летать
    }
    override fun swim() {
        // научил машину плавать
    }


}