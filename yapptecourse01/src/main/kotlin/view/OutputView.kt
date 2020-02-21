package view

class OutputView {
    companion object {
        fun printResultOfGame(strike : Int, ball : Int) {
            if (strike != 0) print(strike.toString()+" 스트라이크 ")
            if (ball != 0) {
                println(ball.toString()+"볼")
            } else {
                println()
            }
            if (strike == 0 && ball == 0) println("낫띵")
        }

        fun printFinishGame() {
            println("정답입니다 게임 종료합니다")
        }
    }
}