import kotlin.random.Random

class GameNumber {

    /*companion object {
        fun getNumber(): Array<Int> {
            for (i in lotto) {
                lotto[i] = random.nextInt(9)
                print(lotto[i])
            }
            return lotto
        }
    }

    var random: Random = object : Random(){
        override fun nextBits(bitCount: Int): Int {
            return 0
        }

    }
    var lotto = Array(3, { 0 })*/

    var lotto = mutableSetOf<Int>()
    val random = java.util.Random()
    /*
    lotto에 랜덤한 수 3만큼 저장하는 함수
     */

    fun getRandom(): MutableSet<Int> {
        for( i in lotto.iterator()){
            lotto.add(random.nextInt(10))
        }
        return lotto
    }
}