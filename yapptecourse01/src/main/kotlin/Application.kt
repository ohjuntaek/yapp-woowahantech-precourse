import domain.Game
import view.InputView

fun main() {
    val game = Game()
    while (true) {
        val isContinue = game.start()
        if (!isContinue) break
    }
    println("안녕~")
}

