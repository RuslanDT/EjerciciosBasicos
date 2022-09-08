fun main(){
    //FILL
    //Valores iniciales
    val celcius = 38.0
    val fahrenheint = 100.0
    val kelvin = 400.0

    //varibales de temperatura
    val c = "Celsius"
    val f = "Fahrenheit"
    val k = "Kelvin"

    //formulas{
    val fCelsius= {ini:Double -> (((9.0/5.0)*ini)+32.0)}
    val fFahrenheit= {ini:Double -> (((9.0/5.0)*ini)+32.0)}
    val fKelvin= {ini:Double -> ini-273.15}

    //IMPRIMIMOS RESULTADOS
    printFinalTemperature(celcius, c, f, fCelsius)
    printFinalTemperature(fahrenheint, f, k, fFahrenheit)
    printFinalTemperature(kelvin, k, c, fKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
){
    val finalMeasurement = String.format("%.2f",conversionFormula(initialMeasurement))
    println("$initialMeasurement degrees is $finalMeasurement degrees $finalUnit")
}