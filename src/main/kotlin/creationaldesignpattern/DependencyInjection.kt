package creationaldesignpattern

class User {
    lateinit var lEngineer:Engineer
    fun printBranch() {
        println(lEngineer.branch)
    }

    fun setEngineer(engineer: Engineer) {
        lEngineer = engineer
    }
//    fun setEngineer(pEngineer: Engineer){
//        lEngineer = pEngineer
//    }
}

//class User(var mEngineer: Engineer) {
//    fun printBranch() {
//        println(mEngineer.branch)
//    }
//}

open class Engineer {
    open var branch: String = "Engineer"
}

class SoftwareEngineer : Engineer() {
    override var branch: String = "SoftwareEngineer"
}

class HardwareEngineer : Engineer() {
    override var branch: String = "HardwareEngineer"
}


fun main() {
    val lUser = User()
    lUser.setEngineer(SoftwareEngineer())
    lUser.printBranch()
}
