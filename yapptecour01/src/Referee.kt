import yapptecour01.src.game
import yapptecour01.src.main

class Referee : Contract.CheckData {
    var strike : Int = 0
    var ball : Int = 0
    override fun ballCheck(userNum : Int, gameNum : Int) {
        var num_user = userNum.toString()
        var num_game = gameNum.toString()

        for (i in num_user){
            for (j in num_game){
                var id_user = num_user.indexOf(i)
                var id_game = num_game.indexOf(j)
                valueCheck(i, j, id_user, id_game)
            }
        }
    }

    override fun showResult() {
        if (strike == 0 && ball == 0) {
            println("포볼")
            println("숫자를 다시 입력하세요")
            strike =0
            ball = 0
            game()
        } else if (strike == 3){
            println("정답입니다!")
            println("게임을 다시 시작하시겠습니까?(Yes : 1, No : 0)")
            var temp : Int = readLine()!!.toInt()
            if (temp == 1) main()
            else if (temp == 0) System.exit(0)
        } else {
            println("$strike 스트라이크 $ball 볼")
            println("숫자를 다시 입력하세요")
            strike = 0
            ball = 0
            game()
        }
    }

    fun valueCheck(i : Char, j : Char, id_user : Int, id_game : Int){
        if (i == j) {
            if (id_user == id_game) {
                strike++
            } else {
                ball++
            }
        }
    }
}