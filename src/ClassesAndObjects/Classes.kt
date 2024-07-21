package ClassesAndObjects

fun main() {
    val tv1 = SmartDevice(
        "Samsung",
        1000.00
    )
    println("${tv1.brand} ${tv1.price}")

    val phone = SmartDevice(
        "Apple",
        3000.00
    )
//    phone.brand = "Apple"
//    phone.price = 3000.00
    println("${phone.brand} ${phone.price}")

    println()

    phone.turnOn()
    phone.getDeviceState()
    tv1.turnOn()
    tv1.getDeviceState()

    val lappop = SmartDevice() //nothing passed :))))

    println()

    println(tv1)
    println(phone)

    //
    println()
    //
    val tv3 = SmartDevice(
        "Samsung",
        1000.00
    )
    val tv2 = SmartDevice(
        "Samsung",
        1000.00
    )
    println("== ${tv3 == tv2}")
    println("===(memory location) ${tv3 === tv2}")
}

//blueprint
class SmartDevice constructor( //can get rid of 'constructor'
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean? = false
) {
    constructor() : this("", 0.0)
    constructor(
        brand: String
    ) : this("Asus", 0.0)
    //....

    //properties. variables. val or var /// now all the properties are in the constructor
    /// ..... .

//    var brand = brand //now can get rid of the type
//        get() = field   //those two are included by default
//        set(value) {
//            field = value
//        }

    //behaviours. methods/functions
    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }

    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
        return result
    }
}