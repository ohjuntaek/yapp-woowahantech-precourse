/**
 * CarController class
 * of MVC / Controlloer
 *
 * v1.0.0
 *
 * 28/2/2020
 *
 */

import Model.Car
import Model.RandomNumberMaker

class CarController {
    private var view : CarView = CarView()
    private var random : RandomNumberMaker = RandomNumberMaker()
    lateinit var carList : ArrayList<Car>
    var driveCount = 0

    fun setCarList(){
        var temp = view.inputCarName()
        carList = ArrayList(temp.size)

        for (i in temp.indices) {
            var car = Car()
            car.name = temp[i]
            carList.add(car)
        }
    }

    fun setGameNumber(): Int {
        driveCount = view.inputCount()

        return driveCount
    }

    fun carDrive(){
        for (i in carList.indices) {
            var randomNumber = random.makeRandomNumber(carList)
            if (randomNumber[i] >= 4) {
                carList[i].driveDistance += 1
            }
        }
        view.printCarDistance(carList)
    }
}