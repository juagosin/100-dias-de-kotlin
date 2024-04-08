
/*
* CLASES ABSTRACTAS: https://code.tutsplus.com/es/kotlin-from-scratch-abstract-classes-interfaces-inheritance-and-type-alias--cms-29744t
* son clases de las que nunca intentará crear objetos.
* Una clase abstracta es incompleta o inútil sin algunas subclases concretas (no abstractas), desde las cuales puede instanciar objetos.
* Una subclase concreta de una clase abstracta implementa todos los métodos y propiedades definidas en la clase abstracta; de lo contrario, esa subclase también es una clase abstracta.
* */
fun main(){

    abstract class Employee (val firstName: String, val lastName: String) {
        val propFoo: String = "bla bla"
        abstract fun earnings(): Double
        fun fullName(): String {
            return lastName + " " + firstName;
        }
    }

    class Programmer(firstName: String, lastName: String) : Employee(firstName, lastName) {
        override fun earnings(): Double { //debemos sobreescribir éste método ya que es el único abstracto de la clase abstracta padre
            // calculate earnings
            return 10000.0;
        }
    }

    val programmer = Programmer("Chike", "Mgbemena")
    println(programmer.fullName()) // "Mgbemena Chike"



    /*
    * INTERFACES
    *Una interfaz es simplemente una colección de métodos relacionados que normalmente le permiten decirle a los objetos qué hacer y también cómo hacerlo de forma predeterminada.
    * En otras palabras, una interfaz es un contrato que las clases de implementación deben cumplir.
    * Una interfaz es inútil sin uno o más implementadores,
    * */
    //Ejemplo de implementación de interfaz
    class Child : MyInterface {
        override val prop: Int = 29
    }

    //La clase Box, implementa la interfaz Explosive y Incinerable, por lo que debe sobreescribir los métodos de cada una de ellas
    class Box : Explosive, Incinerable {
        override fun explode() = println("¡Kaboom!")
        override fun incinerate() = println("¡Boosh!")
    }

}
//Ejemplo de definición de interfaz
interface MyInterface {
    val prop: Int // Es abstracta intrinsecamente
    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}
//Implementar Múltiples Interfaces
interface Incinerable {
    fun incinerate()
}
interface Explosive{
    fun explode()
}