package domain

import makeRandomNumber
import maxCarPosition

class Car(val carName: String) {
    private var position: Int = 0

    fun move(carIdx: Int) {
        val randomNumber = makeRandomNumber()
        if (randomNumber >= 4) this.position++
        if (maxCarPosition < position) maxCarPosition = position
        println("$carName : ${"-".repeat(position+1)}")
    }

    fun isInMaxPosition(): Boolean = maxCarPosition == position

    override fun toString(): String {
        return "Car(carName='$carName')"
    }


}