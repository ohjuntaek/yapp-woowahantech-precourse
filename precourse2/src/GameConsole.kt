import domain.Game
import domain.RacingCarGame

fun run(game: Game){
    game.gameStart()
}

fun main(args: Array<String>) {
    run(RacingCarGame())
}