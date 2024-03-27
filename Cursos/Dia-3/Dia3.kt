fun main(){

    /*
    * Condicionales y loops
    * */
    //Expresion IF, si se cumple una condición ocurre algo
    var max = 10
    if( 5 < max ){
        println("5 es menor que $max")
    }
    println("------------------------")
    //If con else, si se cumple una condición ocurre algo, si no ocurre otra cosa
    if( 5 > max ){
        println("5 es mayor que $max")
    }else{
        println("5 es menor que $max")
    }
    println("------------------------")

    //También se puede usar como una expresión

    max = if (5 > 10) 5 else 10
    println("------------------------")

    //Encadenando ifs
    if(10<5){
        println("10 es menor que 5")
    }else if (10<7){
        println("10 es menor que 7")
    }else if (10<12){
        println("10 es menor que 12")
    }
    println("------------------------")

    /*Expresion when, en otros lenguajes se llama switch*/
    var x = 33
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            println("x no es ni 1 ni 2")
        }
    }
    //también se pueden anidar casos
    when (x) {
        0, 1 -> println("x == 0 o x == 1")
        else -> println("x no es ni 1 ni 2")
    }
    //o también se pueden poner rangos con in o !in
    when (x) {
        in 1..10 -> println("x está en el rango")
        !in 10..20 -> println("x está fuera del rango")
        else -> println("No cumple las condiciones")
    }
    //También se puede usar la opción is
    when (x) {
        is Int  -> println("x es un entero")
        else -> println("No es un entero")
    }
    println("------------------------")


    /*
    *
    * Bucles FOR, recorre los elementos de una colección
    *
    * for (item: Int in ints) {
            // ...
        }
    * */
    var nombres = arrayOf("Juan", "Pedro", "Javier")
    for (nombre in nombres){
        println(nombre)
    }
    println("------------------------")
    //Para iterar en un rango de números se puede usar las siguientes expresiones
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) { //de 6 a 0, en pasos de 2
        println(i)
    }
    println("------------------------")
    /*
    * BUCLES WHILE y DO WHILE, mientras se cumpla la condición haz esto, o haz esto mientras se cumpla la condición
    * */
    var numero = 10
    while (numero > 0) {
        println(numero)
        numero--
    }
    numero = 10
    do {
        println(numero)
        numero--
    } while (numero > 0) // y is visible here!


}
