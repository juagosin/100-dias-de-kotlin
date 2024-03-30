fun main(){
    /**
     * LISTAS https://www.develou.com/listas-en-kotlin/
     * Una lista es una colección genérica de elementos que se caracteriza por almacenarlos de forma ordenada,
     * donde pueden existir duplicados (incluso un ítem null) y se indexan los elementos con base 0.
     * */

    //Listas de solo lectura --> listOf()
    val letras: List<Char> = listOf('a','b','c','d','e')
    //Si el contenido está claro, se puede omitir el tipo de datos:
    val letras2 = listOf('a','b','c','d','e')
    println(letras)
    println(letras2)

    //Miembros de List
    //size ->Obtiene la cantidad de elementos
    println(letras.size)

    //lista[index] ->Devuelve el elemento ubicado en la posición index
    println(letras[1])

    //get(index) -> Equivalente a lista[index]
    println(letras.get(1))

    //indexOf(element) -> Obtiene la primera ocurrencia del elemento "element", devuelve -1 si no lo encuentra
    println(letras.indexOf('d'))

    //lastIndexOf(element) ->Obtiene la última ocurrencia del elemento "element", devuelve -1 si no lo encuentra
    println(letras.lastIndexOf('e'))

    //sublist(inicio,fin) -> Obtiene un trozo de la lista con el rango indicado
    println(letras.subList(2,4))


    //LISTAS MUTABLES, MutableList<E>, a diferencia de las listOf, éstas listas SI se pueden modificar
    val colorsList = mutableListOf("Amarillo", "Azul", "Rojo")
    println(colorsList)

    //Métodos que se pueden usar en las listas mutables
    //add(elemento) -> Añade un elemento al final de la lista
    colorsList.add("Verde")
    println(colorsList)

    //add(index, elemento) ->Añade un elemento en el índice
    colorsList.add(0,"Blanco")
    println(colorsList)

    //removeAt(index) -> Elimina el elemento del indice
    colorsList.removeAt(2)
    println(colorsList)

    //[indice]= elemento, reemplaza el elemento del indice
    colorsList[1] = "Negro"
    println(colorsList)



    //filter-> Filtra los elementos de una lista
    val numbers = listOf(1, 3, 5, 8, 10, 11, 15, 31, 40)
    val multiplesOfFive = numbers.filter { x -> x % 5 == 0 }
    println(multiplesOfFive)

    //Partition -> Divide la lista en dos bloques, una que cumple la condidion y la otra que no la cumple
    println(numbers.partition { it>8 }) //Buscamos los elementos que sean mayores de 8

    //any ->Devuelve true o false si se cumple la condición
    println(numbers.any{it >10}) // hay alguno que sea mayorde 10

    //all ->Devuelve true o false si TODOS los elementos de la lista cumplen la condición
    println(numbers.all{it<100})

    //nonce-> Devuelve true o false si NINGUN elemento de la lista cumple la condición
    println(numbers.none { it <100 })

    //sorted -->Ordena la lista
    val numbersMix = arrayOf(8, 1, 2, -3, 0)
    var sortedNumbers = numbersMix.sorted()
    println(sortedNumbers)

    //sortDescending, ordena la lista descendente
    sortedNumbers = numbersMix.sortedDescending()
    println(sortedNumbers)

    //sortedBy, orden personalizado
    val strings = listOf("xxx", "xy", "y", "xx", "yyxy")
    val sortedStrings = strings.sortedByDescending { it.length } //QUeremos ordenar descendente por la longitud de las cadenas
    println(sortedStrings)

    //reversed, ordena en orden inverso la lista
    val greekPhilosophers = mutableListOf(
        "Aristóteles",
        "Platón",
        "Sócrates",
        "Tales de Mileto",
        "Pitágoras")
    val reversedGreekPhilosophers = greekPhilosophers.reversed()
    println(reversedGreekPhilosophers)

    //shuffled->Mezcla la lista
    val shuffledNumbers = numbers.shuffled()
    println(shuffledNumbers)

}