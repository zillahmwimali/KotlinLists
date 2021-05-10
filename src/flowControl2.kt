fun main() {
    println(number(4))
    println(number(7))
    sortItems(Item("Orange",3.0,40.0f,"groceries"))
    sortItems(Item("Geisha",6.0,135.0f,"hygiene"))
    sortItems(Item("Rice",1.0,340.0f,"others"))
    println(getWord("Zillah"))
    println(getWord("Manhattan"))
    println(newList(arrayOf("Manchester","United","Roma","Arsenal")))


}
fun number(num:Int):Boolean{
    return num%2==0
}
data class Item(var name:String,var weight:Double,var price:Float,var category:String)
    fun sortItems(product:Item){//type of product is object Item whose properties are created the data class Item.
        var groceries = mutableListOf<Item>()
        var hygiene = mutableListOf<Item>()
        var other = mutableListOf<Item>()

            when (product.category) {
                "groceries" -> groceries.add(product)
                "hygiene" -> hygiene.add(product)
                else -> other.add(product)

            }
        println(groceries)
        println(hygiene)
        println(other)

    }


fun getWord(word:String):String {
    var newWord=" "
    word.forEachIndexed{ index,character->
        if (index%2==0){
            newWord+=character
        }
    }
     return newWord
}

fun newList(names: Array<String>):List<String>{
    var newNames= mutableListOf<String>()
    for (z in names){
        if (z.length%2==0){
            newNames.add(z)
        }
    }
    return newNames
}



