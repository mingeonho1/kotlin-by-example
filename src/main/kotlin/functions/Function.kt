package src.main.kotlin.functions

private fun printMessage(message: String): Unit {                                   // 1
    println(message)
}

private fun printMessageWithPrefix(message: String, prefix: String = "Info") {      // 2
    println("[$prefix] $message")
}

private fun sum(x: Int, y: Int): Int {                                              // 3
    return x + y
}

private fun multiply(x: Int, y: Int) = x * y                                        // 4

fun main() {
    printMessage("Hello")                                                           // 5
    printMessageWithPrefix("Hello", "Log")                            // 6
    printMessageWithPrefix("Hello")                                         // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")                       // 8
    println(sum(1, 2))                                                        // 9
    println(multiply(2, 4))                                                   // 10
}

/**
 * 1. 이 함수는 String 타입의 파라미터를 하나 받아서 Unit을 반환했습니다. Unit은 반환할 값이 없다는 의미입니다.
 * 2. 이 함수의 두 번째 파라미터는, 기본값 파라미터로 Info를 받습니다. 함수 반환 타입을 생략했는데, 이러면 Unit을 반환한다는 의미입니다.
 * 3. 이 함수는 정수 Int를 반환합니다.
 * 4. 이 한 줄짜리 함수도 정수를 반환합니다. 반환 타입을 생략했지만, 타입추론기능 덕분에 정수 타입을 반환한다고 인식합니다.
 * 5. printMessage 함수를 Hello라는 파라미터를 주고 호출했습니다.
 * 6. printMessageWithPrefix 함수를 두 파라미터 모두 전달해서 호출했습니다.
 * 7. 두 번째 파라미터를 생략해서 호출하면, 기본값인 Info가 전달됩니다.
 * 8. 같은 함수를 이름지정 파라미터 기능을 써서 호출했고, 심지어 파라미터 순서를 바꿨습니다.
 * 9. sum 함수 결괏값을 프린트 합니다.
 * 10. multiply 함수 결괏값을 프린트합니다.
 */
