/*
메인 클래스

v0.1

200215

MIT?
 */

package yapptecour01.src

import InputNumber
import RandomNumber
import Referee

var gameNumber : Int = 0
var userNumber : Int = 0
var referee : Referee = Referee()

fun main() {
    gameNumber = RandomNumber().GameNumber()
    game()
}

fun game() {
    userNumber = InputNumber().setNumber()
    referee.ballCheck(userNumber, gameNumber)
    referee.showResult()
}

