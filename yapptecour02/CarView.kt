/**
 * CarView class
 * of MVC / View
 *
 * v1.0.0
 *
 * 28/2/2020
 *
 */

import Model.Car
import java.util.*
import kotlin.collections.ArrayList

class CarView {
    var sc : Scanner = Scanner(System.`in`)

    fun inputCarName(): ArrayList<String> {
        var carName : ArrayList<String>
        var string : String

        println("자동차의 이름을 입력하세요 ','로 구분합니다.")
        string = sc.next()

        carName = ArrayList(string.split(","))

        return carName
    }

    fun inputCount() : Int{
        var driveCount : Int

        println("운행할 횟수를 정하세요")
        driveCount = sc.nextInt()

        return driveCount
    }

    fun printCarDistance(carList : ArrayList<Car>) {
        for (i in carList.indices){
            print(carList[i].name + " : ")
            print("-".repeat(carList[i].driveDistance))
            println(" ")
        }
    }
}