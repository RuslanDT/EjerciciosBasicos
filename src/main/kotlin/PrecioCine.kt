fun main(){
    val child = 10
    val adult = 21
    val senior = 99

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}")
    println("The movie ticket price for a person aged 9999 is \$${ticketPrice(9999, isMonday)}")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int{
    //FILL
    when (age) {
        in 1..12 -> return 15
        in 13..60 -> {
            if (isMonday) return 25
            return 30
        }
        in 61..100 -> return 20
    }
    return -1
}