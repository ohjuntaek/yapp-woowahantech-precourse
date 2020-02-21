package view

import java.util.*

class InputView {
    companion object {
        var scanner = Scanner(System.`in`)
        fun inputNumber() : Int {
            print("숫자를 입력해 주세요 : ")
            return scanner.nextInt()
        }

        fun inputStart() : Int {
            println("다시 시작할려면 1, 그대로 종료할려면 2를 입력하세요")
            return scanner.nextInt()
        }

    }
}