inline fun <reified T : Any> typesOf(param: T): Pair<String, String> {
    return {
        Pair(param::class.toString(), T::class.toString())
    }()
}

fun main() {
    println(typesOf(1))
    println(typesOf(true))
    println(typesOf(3.4))
    println(typesOf("hi"))
    println(typesOf(listOf<String>()))
}
