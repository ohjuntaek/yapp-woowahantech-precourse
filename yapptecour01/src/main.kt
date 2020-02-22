/*
메인 클래스

v0.1

200215

MIT?
 */

package yapptecour01.src

import RandomNumber
import kotlin.random.Random

fun main() {
    var computerNumber = RandomNumber().getRandom()
    for (i in computerNumber)
        print(i)
}






/*
랜덤한 난수를 세자리 배열에 넣는다
왜냐하면 난수 하나하나 체크해봐야하기 때문

플레이어가 숫자 입력한다

반복문을 통해 스트라이크를 검사한다
반복문을 통해 볼을 검사한다
그게아니면 포볼을 준다
 */