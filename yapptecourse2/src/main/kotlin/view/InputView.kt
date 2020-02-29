package view

import java.util.*
import java.util.stream.Collectors

val scanner = Scanner(System.`in`)

fun inputCarName(): List<String> {
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val input = scanner.nextLine()
    val cars = input.split(",")
    return cars.stream().map { value -> value.trim() }.collect(Collectors.toList())
}

fun inputMoveCount(): Int {
    println("시도할 회수는 몇회인가요?")
    return scanner.nextInt()
}
