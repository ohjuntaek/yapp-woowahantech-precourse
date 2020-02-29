import domain.Car
import view.inputCarName
import view.inputMoveCount

lateinit var cars : MutableList<Car>
var maxCarPosition : Int = 0

fun main() {
    gameStart()
}

fun gameStart() {
    val inputCars = inputCarName()
    if (isValidCarNames(inputCars)) {
        makeCars(inputCars)
    } else {
        throw IllegalArgumentException("차의 이름을 5자 이하로 입력해 주세요.")
    }
    val moveCount = inputMoveCount()
    playGame(moveCount)
    printWinner()
}

fun printWinner() {
    var carsInMaxPosition = mutableListOf<Car>()
    for (car in cars) {
        if (car.isInMaxPosition()) carsInMaxPosition.add(car)
    }
    println("최종 우승 : "+ carsInMaxPosition)
}


fun makeCars(inputCars: List<String>) {
    cars = mutableListOf()
    for (inputCar in inputCars) {
        cars.add(Car(inputCar))
    }
}

fun playGame(moveCount: Int) {
    for (i in 0 until moveCount) {
        moveCars()
    }

}

fun moveCars() {
    for (carIdx in cars.indices) {
        cars.get(carIdx).move(carIdx)
    }
    println()
}




