package src.main.kotlin.nullSafety

fun main() {
    var neverNull: String = "이 변수는 null이 될 수 없다"    // 1

//    neverNull = null                                         // 2

    var nullable: String? = "이 변수는 null이 될 수 있다"    // 3

    nullable = null                                          // 4

    var inferredNonNull = "컴파일러 타입추론은 null-불가로 본다" // 5

//    inferredNonNull = null                                   // 6

    fun strLength(notNull: String): Int {                    // 7
        return notNull.length
    }

    strLength(neverNull)                                     // 8
//    strLength(nullable)                                      // 9
}

/**
 * 1. null-불가 문자열 변수를 선언했습니다.
 * 2. null-불가 변수에 null을 대입하려고 하면, 컴파일 에러가 납니다.
 * 3. null-가능 문자열 변수를 선언했습니다.
 * 4. null-가능 변수에 null을 지정했습니다. 이건 문제없습니다.
 * 5. 컴파일러가 변수 타입을 추론할 때는 null-불가 타입이라고 가정합니다.
 * 6. 컴파일러가 추론한 타입의 변수에 null을 대입하려면, 컴파일 에러가 납니다.
 * 7. null-불가 문자열 파라미터를 받는 함수를 선언했습니다.
 * 8. null이 될 수 없는 String 파라미터를 전달해 함수를 호출했습니다. 잘 됩니다.
 * 9. 같은 함수를 String? 타입의 파라미터로 호출하려고 하면, 컴파일 에러가 납니다.
 */