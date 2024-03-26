fun main(){

    /*Arrays
    *Para declarar arrays puedes usar arrayOf(), arrayOfNulls() o emptyArray()
    * */
    //Creacion de un array con los valores [1,2,3]
    val simpleArray = arrayOf(1,2,3)
    println(simpleArray.joinToString()) //usamos joinToString para "unir" los elementos de un array, se le puede indicar el separador, prefijo y sufijo
    println(simpleArray.joinToString(prefix = "<", postfix = ">", separator = "|"))
    println("------------------------")

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
    println("------------------------")

    val exampleArray = emptyArray<String>()
    //val exampleArray: Array<String> = emptyArray() //Es equivalente a la línea anterior
    println(exampleArray.joinToString())
    println("------------------------")

    val initArray = Array<Int>(3){0} //Array de 3 elementos con valor cero por defecto
    println(initArray.joinToString())
    println("------------------------")

    //Arrays anidados para hacer arrays multidimensionales o matrices
    val twoDArray = Array(2){Array<Int>(2){0} } //Array 2x2 inicializado a 0
    println(twoDArray.contentDeepToString()) //Se usa contenDeepToString
    val threeDArray = Array(3){ Array(3) { Array<Int>(3) { 0 } } } //Array 3x3
    println(threeDArray.contentDeepToString())
    println("------------------------")

    //Acceso y modificación de elementos
    val simpleArray2 = arrayOf(1,2,3)
    val simpleArray2D = Array(2){Array<Int>(2){0} }

    simpleArray2[0] = 10 //Accedemos al elemento 0, del array y le asignamos valor 10
    simpleArray2D[0][0] = 2 //Accedemos al elemento 0x0 y le asignamos el valor 2
    println(simpleArray2[0].toString())
    println(simpleArray2D[0][0].toString())
    println("------------------------")

    val arrayLetters = arrayOf("J","u","a","n")
    for(string in arrayLetters) { //Recorremos un array y mostramos cada elemento
        print(string)
    }
    println("------------------------")

    val arrayMuestra1 = arrayOf(1,2,3)
    val arrayMuestra2 = arrayOf(1,2,3)
    println(arrayMuestra1.contentEquals((arrayMuestra2))) //Comparamos si un array es igual a otro
    println("------------------------")


    //Sumar elementos de un array
    val sumArray = arrayOf(1,2,3)
    println(sumArray.sum())
    //Mezclar elementos de un array shuffle
    sumArray.shuffle()
    println(sumArray.joinToString())
    println("------------------------")
    /*
    * Puedes crear arrays de tipos de datos primitivos
    * BooleanArray
    * ByteArray
    * CharArray
    * DoubleArray
    * FloatArray
    * IntArray
    * LongArray
    * ShortArray
    * */
    //Ejemplo de array de Ints
    val exampleArrayInt = IntArray(5)
    println(exampleArrayInt.joinToString())
    println("------------------------")

}