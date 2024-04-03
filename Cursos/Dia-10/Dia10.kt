import java.util.UUID

fun main(){
    /**
     * CLASES https://www.develou.com/clases-en-kotlin/
     * */
    //Las clases se declaran con la palabra reservada class nombreClase{}
    //Ejemplo de declaración de una clase que tiene una serie de propiedades y métodos


    class Vehiculo{
        var numRuedas: Int = 0
        var numPasajeros: Int = 0
        var velocity: Int = 0

        fun acelerar(){
            velocity++
        }
        fun frenar(){
            velocity--
        }
    }
    //Para instanciar una clase
    val coche = Vehiculo()
    //se puede acceder a las propiedades de la clase de la siguiente manera
    println(coche.velocity)
    coche.acelerar()
    println(coche.velocity)

    //Una clase puede tener unos atributos por defecto, si quieres inicializar esos parametros cuando se construye la clase debes ponerlos en el bloque init
    class Weapon(attack: Int, speed: Double) {
        val attack: Int
        val speed: Double

        init {
            this.attack = attack
            this.speed = speed
        }
    }

    //Y para instanciar esa clase:
    val weapon1 = Weapon(3, 0.5)

    //Una clase puede tener distintas visibilidades
    /*
    * public, internal, protected y privated
    *
    * public	    Visible en cualquier lugar
    * internal  	Visible en el módulo
    * protected     Visible en las subclases
    * privated      Visible solo en la clase actual
    * */


    //Constructores secundarios
    /*Si la lista de argumentos del constructor primario no satisface la creación de tu objeto en alguna circunstancia, entonces puedes crear un constructor secundario a la medida.
    Su declaración se realiza a través de constructor al interior de la clase.
    Si tienes un constructor primario es obligatorio usar la expresión this para delegarle los parámetros que requiera.
    * */
    class Contact(var name: String) { //Constructor princpial
        var id: String

        init {
            id = UUID.randomUUID().toString()
        }

        constructor(id:String, name: String) : this(name){ //constructor secundario
            this.id = id
        }
    }
    Contact("Erika") //Usamos el constructor principal
    Contact("C-1", "Mauricio") //usamos el constructor secundario

    //La misma clase anterior "Contact" se podría declarar con dos constructores secundarios:
    class Contact2 {
        var id: String
        var name: String

        constructor(name: String) {
            this.name = name
            id = UUID.randomUUID().toString()
        }

        constructor(id: String, name: String){
            this.id = id
            this.name = name
        }
    }
}

