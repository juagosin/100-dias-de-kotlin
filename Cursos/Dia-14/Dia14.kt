
/*
* DATA CLASSES
* El modificador data facilita la creación de clases cuyo propósito es solo almacenar valores. A estas clases se les llama, clases de datos o data classes en Kotlin.
* */

fun main(){


    data class Rock(
        val witdh: Int,
        val heith: Int,
        val depth: Int,
        val variation: Int = 1
    )

    val rock1 = Rock(20, 10, 5)
    println(rock1)

    //Se puede copiar una instancia de una data class a otra usando el método copy()
    val rock2 = rock1.copy()
    val rock3 = rock1.copy(variation = 4) //Así le especificamos el valor de uno de los argumentos
    println(rock2)
    println(rock3)

    //Desestructuración de un data classes, se puede acceder a las propiedades con el metodo componentN()

    println("witdh = ${rock1.component1()}")
    println("height = ${rock1.component2()}")
    println("depth = ${rock1.component3()}")
    println("variation = ${rock1.component4()}")
    //Tambien se puede desestructurar así:
    val (witdh, height) = Rock(15, 15, 15)
    println("Desestructurando a width($witdh) y height($height)")


    //Ejemplo enum class
    val diaSemana = DiaSemana.LUNES
    println(diaSemana) // LUNES

    val diaSemana2 = DiaSemana2.JUEVES
    println(diaSemana2)          // JUEVES
    println(diaSemana2.name)     // JUEVES
    println(diaSemana2.dia)      // 4
    // obtenemos la posición de la constante dentro de la enum class
    println(diaSemana2.ordinal)  // 3
}
/*
* CLASES ENUM, son una lista finita de valores. Es un conjunto de valores que usan como identificador un nombre. Dicho nombre se comporta como una constante en nuestro lenguaje.
* */
enum class DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
enum class DiaSemana2 (val dia: Int) {
    LUNES(1),
    MARTES (2),
    MIERCOLES (3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7)
}