/**
 * SETS https://www.develou.com/sets-en-kotlin/
 * */
fun main(){

    //Los sets son colección de elementos sin ordenar y que NO soporta duplicados
    val positiveNumbers = setOf(5,1, 2, 3, 4)
    println(positiveNumbers)
    val positiveNumbersRepeat = setOf(5,1, 1, 2,4,2, 3, 4) //Hay duplicados por lo que se ignoran
    println(positiveNumbersRepeat)

    //Algunos métodos de set
    //contains
    //devuelve true si se encuentra el elemento en el set
    println(positiveNumbers.contains(2))
    println(positiveNumbers.contains(-2))

    //size
    //devuelve el tamaño del st
    println(positiveNumbers.size)
    println(positiveNumbersRepeat.size) //Fijarse que ignora los repetidos y el tamaño es 4, que son los elementos únicos

    //min, para obtener el valor mínimo del set
    println(positiveNumbers.min())
    //max, para obtener el valor máximo
    println(positiveNumbers.max())

    //elementAt, devuelve el elemento en el indice indicado
    println(positiveNumbers.elementAt(0))

    //random, obiente un elemento aleatorio del set
    println(positiveNumbers.random())

    //SETS MUTABLES, mutableSetOf(...)

    val setA = mutableSetOf(1, 6, 7, 10)

    //Para añadir un elemento se usa set.add o set+=
    setA.add(42)
    println(setA)
    setA+=45
    println(setA)

    //Para eliminar un elemento se usa set.remove o set-=
    setA.remove(6)
    println(setA)
    setA-=10
    println(setA)

    //Puedes unir dos conjuntos mediante la función union(), recordad que si hay elementos repetidos los ignorará
    val group1 = setOf(0, 1, 3, 4)
    val group2 = setOf(2, 3, 4, 5)
    println("U = ${group1 union group2}")

    //También podemos hacer la intersección o lo que es lo mismo, unir dos sets pero solo quedarnos con los repetidos, usando la función intersect()
    println("Intersec = ${group1 intersect  group2}")

    //Con substract, eliminas los de A que estén en B
    println("Subs = ${group1 subtract  group2}")
}

