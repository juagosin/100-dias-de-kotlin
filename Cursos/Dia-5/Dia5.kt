fun main(){
/**
 * Información obtenida de la web https://www.develou.com/lambdas-en-kotlin/
 *
 * **/
    /*
* LAMBDAS
* Una función lambda es un literal de función que puede ser usado como expresión.
* Esto quiere decir, una función que no está ligada a un identificador y que puedes usar como valor
* */

    //EJemplo de función declarada de la forma habitual
    fun sumarDos(sum: Int) = sum + 2
    println(sumarDos(10))
    //Al ser reescrita como lambda sería así:
    //{s:Int -> s + 2}
    /*Definir la función de esta forma te permitirá usarla como un valor en diferentes situaciones,
    como pasarla como argumento de una función o almacenarla en una variable.
    * */

    //Lambda Como Argumento
    /*Tratar a la funciones como pequeñas piezas de código con lambdas, te permite la flexibilidad de pasar funciones
    como argumentos de otras funciones (funciones de orden superior).*/
    //Ejemplo, queremos contar los caracteres e de una frase
    val eCount = "develou.com".count({ char:Char -> char == 'e' })
    print("Total 'e': $eCount")

    //Omitir Paréntesis De Función
    /*Si la expresión lambda es el el último argumento en la función, puedes escribir las llaves por fuera del paréntesis:*/
    val eCount2 = "develou.com".count() { char:Char -> char == 'e' }
    //Y si los paréntesis están vacíos, entonces puedes omitirlos completamente:
    val eCount3 = "develou.com".count{ char:Char -> char == 'e' }
    //Omitir Tipo Del Parámetro
    /*Si el contexto permite la inferencia de tipo del parámetro en la lambda, entonces puedes omitirlo del bloque.*/
    val eCount4 = "develou.com".count { char -> char == 'e' }
    //Identificador it
    /*
    * Cuando tu lambda usa un único argumento y no piensas cambiar su nombre por cuestiones de legibilidad, puedes usar el identificador it
    * */
    val eCount5 = "develou.com".count { it == 'e' }

    //Lambdas Con Múltiples Líneas
    /*
    * Es posible escribir una lambda con varias líneas en su cuerpo. Solo pon las expresiones dentro del paréntesis normalmente. La última línea será el resultado del lambda.
    * */
    val eCount6 = "develou.com".count {
        println("Carácter $it")
        it == 'e'
    }
    println("Total 'e': $eCount6")

    //LAMBDAS CON RECIBIDOR
    /*
    *Un tipo función con recibidor es aquel que agrega a la sintaxis base un tipo recibidor. Este es denotado por un punto antes de la lista de argumentos:
    * */
    val mapMessage: String.(Char) -> String = { it + this + it } //A partir de un string, se le va a añadir un carácter al inicio y al fin
    println("Mensaje".mapMessage('*'))
    //También podría llamarse de la siguiente manera:
    println(mapMessage("Mensaje", '*'))

}