import java.util.Locale

fun main(){
    /**
     * LISTAS, continuación del día 6 https://www.develou.com/listas-en-kotlin/
     * Una lista es una colección genérica de elementos que se caracteriza por almacenarlos de forma ordenada,
     * donde pueden existir duplicados (incluso un ítem null) y se indexan los elementos con base 0.
     * */

    //map,La función de orden superior map{ } te permite aplicar una función sobre todos los elementos de una colección con el fin de una nueva colección con el cálculo final.
    val difficultyLevels = listOf("fácil", "intermedio", "difícil", "pesadilla")
    println(difficultyLevels.map { it.uppercase() })

    //AssociateBy
    //This is similar to groupBy, but doesn’t create a List of values in the resulting Map.
    // Instead, the value is always a single element, and, if more than one element satisfies the selector function, the last one in the iteration wins
    val numbers = listOf(1, 2, 3, 4, 5)
    val groupped = numbers.associateBy { n -> n.toString() }
    println(groupped)

    //associate
    //La función de extensión associate() retorna un mapa de pares clave-valor que son producidos por una función de transformación.
    val letters = charArrayOf('a', 'b', 'c', 'd')
    val lettersAndCodesx2 = letters.associate { it to it.code * 2 }
    println(lettersAndCodesx2)

    //flatten
    //La función flatten() te permite aplanar colecciones anidadas, es decir, colecciones con elementos que son colecciones.
    //El resultado final será una lista con la combinación de todos los elementos de las colecciones del interior
    val numbers2 = listOf(
        listOf(1, 3, 5, 7),
        listOf(0, 1, 1, 2)
    )
    println(numbers2.flatten())

    //zip
    /*La función de extensión zip() retorna una lista de pares creados a partir de dos colecciones.
    Estos son conformados por los elementos que tengan la misma posición en cada lista.
    Si los tamaños de las colecciones son diferentes, entonces la lista resultante tendrá el tamaño de la más pequeña.
    */
    val numbers3 = listOf(1, 2, 3, 4, 5)
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    val zipped =(numbers3 zip vowels)
    println(zipped)
    //unzip, hace el efecto contrario zip
    println(zipped.unzip())

    //joinToString
    //Transforma una colección de elementos en un string, tiene los siguientes parámetros "separator", "prefix", "postfix", "limit", "truncated", "transform"
    val numbers4 = listOf(1,2,3,4,5,6,7,8)
    val numbersToString = numbers4.joinToString(" + ","S = ", "", 5,"...")
    println(numbersToString)


    //groupBy
    //La función groupBy te permite dividir todos los elementos de una colección en grupos.
    val numbers5 = listOf(-2, -1, 0, 1)
    println(numbers5.groupBy { it < 0 })

    //groupingBy
    //La función de extensión groupingBy() funciona similar a groupBy(). Ambas toman una función lambda que hace de selector de clave y así crear grupos de elementos con dichas claves.
    //La diferencia está en que groupingBy() retorna en una instancia del tipo Grouping.
    //Podemos usar las siguientes funciones sobre el resultado
    //eachCount(): Cuentas los elementos por cada grupo.
    //fold(): Aplica una operación acumulativa a partir de los valores de cada grupo.
    //reduce(): Aplicar una operación que reduce a una instancia como resultado de cada grupo
    //aggregate(): Esta función es la base para generar las otras funciones nombradas. Toma una operación y la aplica sobre cada elemento para obtener el resultado acumulado

    val words = "one two three four five six seven eight nine ten".split(' ')
    val frequenciesByFirstChar = words.groupingBy { it.first() }.eachCount()
    println("Counting first letters:")
    println(frequenciesByFirstChar)


    //count
    //Su objetivo es entregarte el número de elementos que cumplen con la condición que establezcas.
    println(numbers5.count { it < 0 })

    //minOrNull, maxOrNull
    //La función de extensión minOrNull() retorna el valor más pequeño/grande de la colección que sirva como objeto invocador. Si la colección está vacía, entonces obtendrás null
    println(numbers5.minOrNull())
    println(numbers5.maxOrNull())

    //sum
    //retorna la suma de los elementos de una lista
    val numbers6 = listOf(20, 40, 35, 7)
    println(numbers6.sum())

    //average
    //Devuelve la media de los elementos
    println(numbers6.average())

    //reduce
    //aplica una operación a cada elemento de una colección de izquierda a derecha y al final retorna el valor acumulado.
    val resultado = numbers6.reduce{resultado, value->resultado*value}
    println(resultado)
    val strings = listOf("a", "b", "c", "d")
    println(strings.reduce { acc, string -> acc + string })

    //fold, es equivalente a reduce pero se le pasa un valor inicial
    println(numbers6.fold(500){sum, element->sum+element})
    println(numbers6.reduce{sum, element->sum+element})

    //find
    //devuelve el primer elemento que cumpla la condicion
    println(numbers6.find { it<20 })

    //elementAt
    //Devuelve el elemento en la posición indicada
    println(numbers6.elementAt(2))
    //elementAtOrNull, si es nulo devuelve nulo
    println(numbers6.elementAtOrNull(50)) //el elemento 50 no existe por lo que devuelve nulo. si hubieramos usado elemenAt habría dado un error
    //elementAtOrElse, si no existe ese elemento, devuelve el indicado
    println(numbers6.elementAtOrElse(50){666})

    //contains
    //La función de extensión contains() retorna true si el elemento pasado como parámetro se encuentra en la colección invocadora
    val seaLevels = intArrayOf(7492, 2764, 2942, 395, 63, 2745)
    val isSixtyThreeContained = seaLevels.contains(63)
    println(isSixtyThreeContained)
    val isSixtyFourContained = seaLevels.contains(64)
    println(isSixtyFourContained)

    //random
    //Devuelve un valor aletorio de la lista
    val randomNumbers = 1 .. 10
    println(randomNumbers.random()) //devolverá un numero aleatorio entre el 1 y el 10

    //slice
    //Devuelve los elementos de una colección especificados por sus índices
    val L = listOf(1, 2, 3, 4, 5)
    println(L.slice(0..1))

    //take
    //devuelve una lista con los elementos desde el inicial, hasta el indice inidcado
    println(L.take(3))
    //takelast, igual que take pero empezando por el final
    println(L.takeLast(3))
    //takeWhile, igual que take pero hasta que cumple una condicion específica
    println(L.takeWhile { it<=4 })

    //drop
    //Es la "contraria" a take, obtiene los elementos desde el indicado hasta el final
    println(L.drop(2))
    println(L.dropLast(2))
    println(L.dropWhile{it<=4})

    //chunked
    //Divide una lista en varias, según el tamaño indicado
    println(L.chunked(2))
    
}