package domain

import view.OutputView

class Referee() {
    fun makeNumberAndJudge(gameNumbers: Int) : Boolean {
        val refereeNumbers = RefereeNumbers().makeRefereeNumber()
        val result = countStrikeAndBall(gameNumbers, refereeNumbers)

        return judge(result)
    }

    private fun judge(result: Pair<Int, Int>): Boolean {
        if (result.first == 3) {
            OutputView.printFinishGame()
            return true
        } else {
            OutputView.printResultOfGame(result.first, result.second)
            return false
        }
    }

    fun countStrikeAndBall(gameNumbers: Int, refereeNumbers: Int): Pair<Int, Int> {
        val countStrike = countStrike(gameNumbers, refereeNumbers)
        val countBall = countBall(gameNumbers, refereeNumbers)
        return Pair(countStrike, countBall)
    }

    private fun countStrike(gameNumbers: Int, refereeNumbers: Int): Int {
        var count = 0
        for (i in 0..2) {
            if (gameNumbers.toString()[i] == refereeNumbers.toString()[i]) count++
        }
        return count
    }

    private fun countBall(gameNumbers: Int, refereeNumbers: Int): Int {
        var count = 0
        for (i in 0..2) {
            val arrExceptIdx = refereeNumbers.toString().replace(refereeNumbers.toString()[i], ' ')
            if (gameNumbers.toString()[i] in arrExceptIdx) count++
        }
        return count
    }

}
