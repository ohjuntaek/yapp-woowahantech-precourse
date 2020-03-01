package domain

import view.RacingCarGameView
import kotlin.math.max
import kotlin.system.exitProcess

class RacingCarGame : Game {
    private var cars = mutableListOf<Car>()
    private var highDistance = 0
    private var attemptCount = 5
    private val racingCarGameView = RacingCarGameView()

    override fun gameStart() {
        initGame()
        racing()
        gameOver()
    }

    override fun initGame() {
        val carsNames = racingCarGameView.setCarsNames()
        for(i in carsNames){
            cars.add(Car(i))
        }
        attemptCount = racingCarGameView.setAttemptCount()
    }

    private fun racing() {
        for(i in 0 until attemptCount){
            carsMoveForwardOrStay()
            racingCarGameView.printCurrStatusPlate(cars)
        }
        racingCarGameView.printWinner(findWinner())
    }

    private fun carsMoveForwardOrStay(){
        for(i in cars){
            i.moveForwardOrStay()
            highDistance = max(highDistance, i.distance)
        }
    }

    private fun findWinner(): String{
        var winner = ""
        for(i in cars){
            if(highDistance == i.distance){
                winner += (i.name +" ")
            }
        }
        return winner
    }

    override fun gameOver() {
        exitProcess(1)
    }
}

