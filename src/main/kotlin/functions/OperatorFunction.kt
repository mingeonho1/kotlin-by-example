package src.main.kotlin.functions

/** 특정 함수들은 연산자로 "업그레이드"될 수 있고, 해당 연산자를 써서 그 함수를 호출할 수 있습니다. **/

fun main() {
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "하이 ")                                             // 2

    operator fun String.get(range: IntRange) = substring(range)     // 3
    val str = "안녕하세요. 코틀린"
    println(str[0..3])
}

/**
 * 1. times라는 확장 중위 함수에 operator 제어자(modifier)를 붙였습니다.
 * 2. times()에 대응하는 연산자 기호는 *이기 때문에, 2 * "Bye"의 형태로 해당 함수를 호출할 수 있게 됩니다.
 * 3. 이 연산자 함수로 문자열의 특정 범위에 쉽게 접근할 수 있게 만들었습니다.
 * 4. get() 연산자를 써서 인덱스 접근 문법을 활용합니다.
 */
