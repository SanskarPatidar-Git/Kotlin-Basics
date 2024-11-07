fun main(){
    var countries = arrayOf("India","USA","Russia","Nepal")
    for (country in countries)
        println(country)

    //Accessing element
    println("Arrays first element : ${countries[0]}")
    println("Using get: ${countries.get(0)}")

    //Size of array
    println("Size of array: ${countries.size}")

    //Set the value
    countries[3] = "Australia"
    println("After changing: ${countries[3]}")
    countries.set(3,"Nepal")
    println("After set: ${countries[3]} ")

    //Contains value in array
    println("Is India available : ${countries.contains("India")}")

    countries.sort();
    println("After sorting array--------")
    for(country in countries)
        print("$country, ")
}

/*
Accessing element more than array gives Exception - ArrayIndexOutOfBoundException
 */