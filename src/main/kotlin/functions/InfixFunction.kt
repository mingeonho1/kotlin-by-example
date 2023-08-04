package src.main.kotlin.functions


fun main() {

    infix fun Int.times(str: String) = str.repeat(this)         // 1
    println(2 times "Bye ")                                        // 2

    val pair = "자바" to "오라클"                                    // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)       // 4
    val myPair = "코틀린" onto "젯브레인스"
    println(myPair)

    val koo = Person("손석구")
    val yeon = Person("장도연")
    koo likes yeon                                                 // 5
}

class Person(val name: String) {
    private val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }      // 6
}

/**
 * 1. Int에 중위 확장 함수를 정의했습니다.
 * 2. 중위 함수를 호출했습니다.
 * 3. 표준 라이브러리에 있는 중위 함수 to를 호출해서 Pair를 만들었습니다.
 * 4. 이렇게 to랑 같은 일을 하는 onto를 직접 구현할 수도 있습니다.
 * 5. 중위 표현법은 멤버 함수나 메서드에도 쓸 수 있습니다.
 * 6. 선언된 클래스 자체가 첫 번째 파라미터가 됩니다.
 */