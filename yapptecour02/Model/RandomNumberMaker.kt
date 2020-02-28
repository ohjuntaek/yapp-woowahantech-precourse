/**
 * RandomNumberMaker class
 * of MVC / Model
 *
 * v1.0.0
 *
 * 28/2/2020
 *
 */

package Model

import kotlin.random.Random

class RandomNumberMaker {
    fun makeRandomNumber(carList: ArrayList<Car>): ArrayList<Int> {
        var randomNumberList : ArrayList<Int> = ArrayList(carList.size)

        for (i in carList.indices) {
            var randomNumber = Random.nextInt(0,9)
            randomNumberList.add(randomNumber)
        }

        return randomNumberList
    }
}