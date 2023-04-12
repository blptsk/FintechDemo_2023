package interfaces

class Car : Movable , Info {
    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }

    override val number: String = "ОР123О199"
}
