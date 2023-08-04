package src.main.kotlin                 // 1


fun main() {                            // 2
    println("Hello, World!")            // 3
}

/**
 * 1. 코틀린 코드는 패키지 안에 정의합니다. 하지만 패키지 선언을 꼭 해야 하는 건 아닙니다. 소스 파일에 패키지를 지정하지 않으면, 디폴트 패키지에 속하게 됩니다.
 * 2. 코틀린 애플리케이션의 시작점은 src.main.kotlin.main 함수입니다. 함수의 반환 타입이 지정하지 않았기 때문에, 아무것도 반환하지 않습니다.
 * 3. println는 표준 출력에 한 줄을 프린트합니다. 세미콜론(;)이 없어도 되는 점도 살펴봐 주세요.
 *
 * 만약, 애플리케이션 실행 파라미터를 입력받으려면, 아래 코드처럼 src.main.kotlin.main 함수가 Array<String> 타입의 파라미터를 받도록 합니다.
 */

fun main(args: Array<String>) {
    println("Hello, World!")
}