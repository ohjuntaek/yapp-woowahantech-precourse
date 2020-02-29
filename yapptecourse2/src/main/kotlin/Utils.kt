import kotlin.random.Random

const val MAX_CAR_NAME_LENGTH = 5

fun isValidCarNames(cars: List<String>): Boolean
        = cars.stream().allMatch { value -> value.length <= MAX_CAR_NAME_LENGTH }


fun makeRandomNumber(): Int = Random.nextInt(0, 10)