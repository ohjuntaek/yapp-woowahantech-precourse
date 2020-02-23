import java.util.*

class InputNumber : Contract.UserInput {
    var sc = Scanner(System.`in`)
    var num_user : Int? = null

    override fun setNumber() : Int{
        print("세자리 숫자를 입력하세요 : ")
        num_user = sc.nextInt()
        checkNumber(num_user!!)
        return num_user!!
    }

    override fun checkNumber(number: Int) {
        var num_check = number.toString()

        if (num_check.length != 3) {
            println("세자리 숫자가 아닙니다.")
            num_user = null
            setNumber()
        }
    }
}