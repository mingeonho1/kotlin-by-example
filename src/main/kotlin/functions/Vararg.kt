package src.main.kotlin.functions

fun main() {
    fun printAll(vararg messages: String) {                             // 1
        for (m in messages) println(m)
    }

    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")        // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {   // 3
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "안녕",
        prefix = "Greeting: "                                           // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                              // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}

/**
 * 1. vararg 제어자를 붙여 씁니다.
 * 2. 이렇게 하면 printAll에 임의 갯수의 문자열 파라미터를 전할 수 있습니다.
 * 3. 이름지정(named) 파라미터로, vararg에 이어서 같은 타입의 또다른 파라미터를 추가로 전달할 수도 있습니다.
 * 4. 이름지정(named) 파라미터를 써서, prefix 값을 vararg에 이어 추가로 전달했습니다.
 * 5. 실행시점에 vararg는 평범한 배열값입니다. 배열을 vararg 파라미터로 전달하려면, * 연산자를 써서 *entries처럼 전달할 수 있습니다. * 연산자 없이 entries로 쓰면 Array<String>으로 인식됩니다.
 */