fun main(){
    var toyota = Car("Toyota", "Prado", "KCT 123B", 0)
    println(toyota.registration)
    toyota.start()
    println(toyota.speed)
    toyota.accelerate(30)
    toyota.hoot()
    toyota.decelerate(20)
    toyota.stop()


}
//A class has a name.
//The body of a class is denoted by a pair of curly braces
//An object is an instance of a class
class Car(var make: String, var model: String, var registration: String, var speed:Int){
    fun start(){
        println("vroooom")
    }
    fun accelerate(acceleration:Int):Int{
        speed+=acceleration
        println(speed)
        return speed
    }
    fun hoot(){
        println("peep peep")
    }
    fun decelerate(deceleration:Int):Int{
        speed-=deceleration
        println(speed)
        return speed
    }
    fun stop(){
       speed-=speed
        println(speed)
    }

}
