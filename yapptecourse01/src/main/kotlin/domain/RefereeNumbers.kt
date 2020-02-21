package domain

import view.InputView

class RefereeNumbers() {
    fun makeRefereeNumber(): Int {
        var inputNumber: Int
        while (true) {
            inputNumber = InputView.inputNumber()
            if (isValidNumber(inputNumber)) break
        }
        return inputNumber
    }

    private fun isValidNumber(inputNumber: Int) : Boolean {
        if (inputNumber.toString().length != 3) {
            println("3자리 입력해라")
            return false
        }

        if (isExistDuplNumber(inputNumber)) {
            println("중복 안되게 입력해라")
            return false
        }

        if (isAllNumberNotInRange(inputNumber)) {
            println("1~9 사이꺼만 입력해라")
            return false
        }

        return true
    }

    private fun isAllNumberNotInRange(inputNumber: Int): Boolean {
        for (i in inputNumber.toString()) {
            if (i.toInt()-'0'.toInt() !in 1..9) return true
        }
        return false
    }

    private fun isExistDuplNumber(inputNumber: Int): Boolean {
        val set = mutableSetOf<Char>()
        for (i in inputNumber.toString()) set.add(i)
        if (set.size != 3) return true
        return false
    }
}