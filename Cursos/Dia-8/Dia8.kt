fun main(){
    /**
     * MAPS
     * Un mapa es una colección que almacena sus elementos (entradas) en forma de pares clave-valor.
     * */

    //mapas de solo lectura
    val userSettings: Map<String, String> = mapOf(
        "name" to "Catrina",
        "language" to "Español",
        "logo" to "logo.png",
        "website" to "www.site.com"
    )
    println(userSettings)

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println(numbersMap)

    //size, indica el numero de elementos del mapa
    println(numbersMap.size)

    //keys , retorna un Set<K> de solo lectura de todas las claves
    println(numbersMap.keys)

    //values, retornar una Collection<V> de solo lectura con los valores en el mapa
    println(numbersMap.values)

    //entries, retorna un tipo Set<Entry<K,V>> de solo lectura de todos los pares clave-valor
    println(numbersMap.entries)

    //metodos de lectura
    //mapa[clave], obtiene el valor a partir de la clave
    println(numbersMap["key1"])

    //getOrDefault(key, defaultValue): Obtiene el valor correspondiente a la clave, de lo contrario retorna a defaultValue
    println(numbersMap.getOrDefault("calle", "Sin domicilio"))

    //isEmpty(): Retorna true si el mapa no contiene entradas y false en caso contrario
    println(numbersMap.isEmpty())

    //containsKey(key): Retorna true si key existe en el mapa. Esto es equivalente a usar el operador in al comprar la clave frente al mapa
    println(numbersMap.containsKey("domicilio"))
    println(numbersMap.containsKey("key2"))

    //containsValue(value): Retorna true si una o varias claves se relacionan con value
    println(numbersMap.containsValue(1))
    println(numbersMap.containsValue(0))
    println("-------------------------")
    /**
     * Maps mutables mutableMapOf()
     * */

    val booksMap = mutableMapOf(
        "Sinsajo" to 2010,
        "Yo, Robot" to 1950,
        "Crimen y castigo" to 1935,
        "Cien años de soledad" to 1991
    )
    println(booksMap)

    //put(key, value) , se usa para actualizar el valor, si la clave no existe entonces es añadida al mapa
    booksMap.put("La máquina del tiempo", 1890) //no existe, la crea
    println(booksMap)
    booksMap.put("La máquina del tiempo", 1895) //existe, la actualiza
    println(booksMap)

    //remove(key), elimina la entrada
    booksMap.remove("Sinsajo")
    println(booksMap)

    //Otra variante del método es remove(key, value) donde se remueve el elemento con la clave key solo si su valor actual es value.
    // El retorno será true si es eliminado o false en caso negativo.
    println(booksMap.remove("Cien años de soledad", 2015)) // false

    //Ejemplo de recorrer un map
    for((pelicula, anyo) in booksMap){
        println("$pelicula -> $anyo")
    }
    //Otro ejemplo
    booksMap.forEach { (pelicula, anyo) -> println("$pelicula -> $anyo") }

}