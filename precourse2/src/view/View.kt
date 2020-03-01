package view

import java.util.*

abstract class View {
    private val scanner = Scanner(System.`in`)

    fun questionAndInputString(question: String): String{
        print(question)
        return readLine()!!
    }

    fun questionAndInputInt(question: String): Int{
        print(question)
        return scanner.nextInt()
    }

    fun getScanner(): Scanner{
        return scanner
    }

}