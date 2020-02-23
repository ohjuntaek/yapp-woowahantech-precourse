import java.util.*

class RandomNumber : Contract.GameSetting {
    private var temp = mutableListOf<Int>()
    private val random = Random()
    private var num_game : Int = 0

    override fun GameNumber(): Int {
        for (i in 0..2) {
            temp.add(random.nextInt(10))
        }

        num_game = temp.joinToString("").toInt()
        return num_game
    }
}