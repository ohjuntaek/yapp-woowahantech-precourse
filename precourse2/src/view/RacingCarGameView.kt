package view

import domain.Car

class RacingCarGameView: View() {

    fun setCarsNames(): MutableList<String> {

        return questionAndInputString("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
            .split(",").toMutableList()
    }

    fun setAttemptCount(): Int {

        return questionAndInputInt("시도할 회수는 몇회인가요?")
    }

    fun printCurrStatusPlate(cars: List<Car>){
        for(car in cars){
            print(car.name + " : ")
            for(i in 0 until car.distance){
                print("-")
            }
            println()
        }
        println()
    }

    fun printWinner(winner: String) {
        print(winner + "가 최종 우승했습니다.")
    }
}