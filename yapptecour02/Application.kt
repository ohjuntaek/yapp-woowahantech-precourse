/**
 * Application
 *
 * v1.0.0
 *
 * 28/2/2020
 *
 */

fun main(){
    var controller = CarController()
    var driveCount : Int

    controller.setCarList()
    driveCount = controller.setGameNumber()

    for (i in 1 .. driveCount){
        println("drive $i")
        controller.carDrive()
        println(" ")
    }
}