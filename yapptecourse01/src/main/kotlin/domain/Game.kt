package domain

import view.InputView

class Game {
    private lateinit var referee: Referee
    var gameNumbers: Int = 0

    private fun makeInputNumber() : Boolean {
        return referee.makeNumberAndJudge(gameNumbers)
    }

    fun start() : Boolean {
        gameNumbers = GameNumbers().numbers
        referee = Referee()
        while (true) {
            val isFinish = makeInputNumber()
            if (isFinish) {
                break
            }
        }
        val continueInput = InputView.inputStart()
        return isGameContinue(continueInput)
    }

    private fun isGameContinue(continueInput: Int): Boolean {
        return when (continueInput) {
            1 -> true
            2 -> false
            else -> {
                println("잘못된 입력")
                false
            }
        }
    }
}