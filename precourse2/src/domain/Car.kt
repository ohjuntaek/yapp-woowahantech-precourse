package domain

data class Car(
    val name: String,
    var distance: Int = 0
) {
    fun moveForwardOrStay() {
        if((0..9).random() >= 4){
            this.distance++
        }
    }
}
