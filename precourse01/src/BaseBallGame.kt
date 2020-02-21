import java.util.*
import kotlin.random.Random
import kotlin.system.exitProcess

class NumberBaseball{

    var numbers = IntArray(3, { (0..10).random() })
    var inputNumbers = IntArray(3, {0})
    var numberCount = 0

    fun inputNumbers(){
        val scanner = Scanner(System.`in`)

        print("숫자를 입력해주세요 : ")
        inputNumbers = IntArray(3) {scanner.nextInt()}
    }
    fun isAnswer(): Boolean {
        for (i in 0 until 3){
            if(numbers[i] != inputNumbers[i])
                return false
        }
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        return true
    }
    fun makeRandomNumbers(){
        var checkedNumbers = BooleanArray(10){false}
        var ind = 0

        while (ind < numberCount){
            val randomNumber = (1..9).random()
            if(checkedNumbers[randomNumber]) continue
            numbers[ind++] = randomNumber
            checkedNumbers[randomNumber] = true
        }
        for(i in 0 .. 2){
            print(numbers[i])
        }
    }
    fun initNumbers(numberCount: Int){
        this.numberCount = numberCount
        this.numbers = IntArray(numberCount)
        makeRandomNumbers()
    }
    fun checkStrike(): Boolean{
        var strike = 0
        for (i in 0..2){
            if(numbers[i] == inputNumbers[i]) strike++
        }
        if (strike > 0){
            print("$strike 스트라이크 ")
            return true
        }
        return false
    }
    fun checkBall(): Boolean{
        var ball = 0
        for(i in 0..2){
            for(j in 0..2){
                if(i == j) continue
                if(numbers[i] == inputNumbers[j]) ball++
            }
        }
        if(ball > 0){
            print("$ball 볼 ")
            return true
        }
        return false
    }
    fun checkNumbers(){
        var nothing = true
        if(checkStrike()){
            nothing = false
        }
        if(checkBall()){
            nothing = false
        }
        if(nothing){
            print("Nothing!!")
        }
        println()

        return
    }
    fun restartGame(){
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요")

        while(true){
            val scanner = Scanner(System.`in`)
            val exitFlag = scanner.nextInt()
            if(exitFlag == 1) {
                initNumbers(3)
                println("게임을 재시작합니다.")
                return
            }
            if(exitFlag == 2) {
                println("게임을 종료합니다.")
                exitProcess(1)
            }
        }
    }
    fun playGame(){
        initNumbers(3)

        while(true){
            inputNumbers()

            if(isAnswer()){
                restartGame()
                continue
            }

            checkNumbers()
        }
    }
}

fun main(args: Array<String>) {
    NumberBaseball().playGame()
}