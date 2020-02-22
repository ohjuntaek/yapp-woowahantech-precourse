package domain

import java.util.*


class GameNumbers {
    val numbers : Int
        get() = makeGameNumber()

    private fun makeGameNumber(): Int {
        val numberSet = mutableSetOf<Int>()
        val random = Random()
        while (numberSet.size < 3) {
            numberSet.add(random.nextInt(9) + 1)
        }
        return numberSet.joinToString("").toInt()
    }
}