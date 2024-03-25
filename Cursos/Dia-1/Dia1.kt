fun main(){
    /*Comentario
        multilinea
    */
    //Comentario única línea
    println("Soy un texto representado por pantalla")

    //Tipos de datos numéricos más comunes
    /**
     * Byte, Short, Int y Long
     *
     */
    val one = 1 //Int
    val threeBillion = 3000000000 //Long
    val oneLong = 1L //Long
    val oneByte: Byte = 1
    println(one)
    println(threeBillion)
    println(oneLong)
    println(oneByte)
    println("-----------------------------")

    /**
    * Numéricos de coma flotante
     * Float y Double
    * */
    val pi = 3.14 // Double
    val oneDouble = 1.0 // Double
    println(pi)
    println(oneDouble)
    println("-----------------------------")
    //Para especificar un float, debemos indicarlo con f
    val e = 2.7182818284 //Este sería Double
    val eFloat = 2.7182818284f //Este sería Float
    println(e)
    println(eFloat)
    println("-----------------------------")
    /**
     * También se pueden usar subrayados para hacer más legible el número
     * */
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010
    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(bytes)
    println("-----------------------------")
    /**
     * Conversiones de números
     *
     * toByte(): Byte, toShort(): Short, toLong(): Long, toDouble(): Double
     * */
    println(threeBillion)
    println("threeBillion ToShort-->"+ threeBillion.toShort())
    println("-----------------------------")
    /**
     * Operaciones con números
     *  +,-,*,/,%
     * */
    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)
    /*La división entre enteros siempre devuelve un entero, se descarta la parte decimal*/
    val x = 5 / 2
    println(x)
    //Para devolver un numero de coma flotante, uno de los argumentos debe ser de coma flotante
    val y = 5 / 2.toDouble()
    println(y)
    println("-----------------------------")

    /**
     * Booleanos
     * True o False
     * */
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    println(myTrue)
    println(myFalse)
    println( 5 == 8 )
    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
    println("-----------------------------")
    /**
     * Characters
     * Van representados entre comillas simples '', los carácteres especiales los puedes "escapar" usando la contrabarra \
     * */
    val aChar: Char = 'a'
    println(aChar)
    println("-----------------------------")

    /**
     * Strings, van representados con comilla doble ""
     * Para concatenar strings debes usar el símbolo +
     * */
    val str = "abcd 123"
    println(str)
    val str2 = " hola"
    println(str + str2)
    //Puedes hacer strings multilinea usando triple comilla
    val str3 = """
        hola, 
        soy un string
         multilinea
    """
    println(str3)
    //También puedes incluir variables en cadenas usando el caracter $ o ${}
    val i = 10
    println("El valor de i es $i")
    println("El valor de i es ${i}")
}