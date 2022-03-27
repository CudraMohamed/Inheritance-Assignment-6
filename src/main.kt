//Assignment 6: Inheritance
//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:

//-carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)

//-identity() : Prints out the color, make and model in the following
//format e.g:  “I am a white subaru legacy”(1 point)
//calculateParkingFees(hours: Int) : Calculates and return the
//parking fees by multiplying the hours by 20(1 point)

//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the product of hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects

fun main(){
    var vehicle=Car("Jeep","Wrangler","Black Chestnut",4)
    vehicle.carry(3)
    vehicle.identity()
    println(vehicle.calculateParkingFees(5))

    var vehicle2=Bus("Transit","EasyCoach","Cadet blue",14)
    println(vehicle2.maxTripFare(50.5))
    println(vehicle2.calculateParkingFees(8))
    vehicle2.carry(16)
    vehicle2.identity()

}
open class Car(var make:String,var model:String,var color:String,var capacity :Int){
    fun carry(people:Int){
        if (people <= capacity) {
            println("Carrying $people passengers")
        }else{
            var x= people-capacity
            println("Overcapacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        var fees=hours*20
        return fees
    }
}

class Bus(make:String,model:String,color:String,capacity :Int) :Car(make, model, color, capacity){
    fun  maxTripFare(fare: Double):Double{
        var maxFare=fare*capacity
        return maxFare

    }

    override fun calculateParkingFees(hours: Int): Int {
        var parkingFees=hours*capacity
        return parkingFees
    }

}
