package src.main.kotlin.variable

fun main() {
    var a: String = "first"    // 1
    println(a)
    a = "sec"
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3
}

/**
 * 1. 변이(mutable) 변수를 선언하면서 초기화했습니다.
 * 2. 불변(immutable) 변수를 선언하고 초기화했습니다.
 * 3. 불변 변수를 선언하고 초기화했고, 타입 선언은 생략했습니다. 컴파일러가 3이라는 값을 보고 Int 타입이라고 추론합니다.
 */