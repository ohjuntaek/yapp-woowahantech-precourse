/*
BaseBallGame 구현을 위한
Contract Interface 입니다
 */

interface Contract {
    interface GameSetting {
        fun GameNumber(): Int
    }


    interface UserInput {
        fun setNumber() : Int
        fun checkNumber(number : Int)
    }


    interface CheckData {
        fun showResult()
        fun ballCheck(num_user: Int, num_game: Int)
    }
}