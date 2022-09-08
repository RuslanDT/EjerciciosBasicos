
fun main(){
    val morningNotification = 99
    val eveningNotification = 200   

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){
    //fill
    if(numberOfMessages < 100){
        println("You have $numberOfMessages notifications")
    } else{
        println("Your phone is blowing up! You have 99+ notifications")
    }
}