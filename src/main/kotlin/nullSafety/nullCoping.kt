package src.main.kotlin.nullSafety

fun main() {
    fun describeString(maybeString: String?): String {              // 1
        return if (!maybeString.isNullOrEmpty()) {                  // 2
            "문자열 길이: ${maybeString.length}"
        } else {
            "빈 문자열이거나 null"                                     // 3
        }
    }

    val nullMessage = describeString(null)
    println(nullMessage)

    val notNullMessage = describeString("안녕")
    println(notNullMessage)
}

/**
 * 1. null-가능 문자열 파라미터를 받아서, 길이를 설명하는 문자열을 반환하는 함수입니다.
 * 2. 주어진 문자열이 null이 아니고 빈 문자열도 아니라면, 그 문자열의 길이를 포함한 설명을 반환합니다.
 * 3. 그 외에는, 주어진 문자열이 비었거나 null이라고 알려줍니다.
 */