import android.database.sqlite.SQLiteAccessPermException

fun main(){
    /*
    * FUNCIONES
    * */
    //las funciones se declaran con la palabra reservada "fun"
    fun saluda(){
        println("Hola")
    }
    saluda() //Así llamamos a la función "saluda" que muestra un mensaje por pantalla
    println("------------------------")
    //parámetros
    fun saludaNombre(string: String){
        println("Hola $string")
    }
    saludaNombre("Juan")
    println("------------------------")

    fun saludaNombreDefecto(string: String = "Persona"){
        println("Hola $string")
    }
    saludaNombreDefecto()
    saludaNombreDefecto("Juan")
    println("------------------------")

    /*
    * Si una función no devuelve un valor útil, el valor que retorna es de tipo Unit, que puede ser obviado en su declaración
    * La función anterior podría declararse también así: fun saludaNombreDefecto(string: String = "Persona"):Unit{...}
    * */

    // Si el cuerpo de la función consiste en una expresión simple, las llaves se pueden omitir
    fun double(x:Int): Int = x * 2 //también puede declararse fun double(x:Int) = x * 2
    println(double(5))
    println("------------------------")

    //Notación infix
    //SI se declara la función con la palabra reservada infix, se puede llamar a la función omitiendo el . y parentesis
    infix fun String.plus(str: String) = this + str

    println("Hola " plus " Juan")

    println("Hola ".plus("Juan"))
    println("------------------------")

    /*
    * Funciones locales, son funciones dentro de otras funciones. Solo se pueden llamar dentro del ámbito de la funcion "primaria"
    * */
    fun primaria(nombre:String){
        fun secundaria(apellido: String){
            println(apellido)
        }
        secundaria(nombre)
    }
    primaria("Hola")
    //secundaria("Texto") -->No es posible llamar aqui a la función
    println("------------------------")

    /*
    * Funciones de extensión
    * Una función de extensión es una función que extiende las funcionalidades de una clase, con la introducción de un nuevo parámetro llamado: parámetro recibidor.
    * */

    fun Boolean.adverb() = if (this) "SI" else "NO"
    val a = 4
    val b = 3
    val res = (a > b).adverb()

    print("¿$a es mayor que $b?: $res")
}