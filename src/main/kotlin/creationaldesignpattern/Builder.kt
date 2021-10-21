package creationaldesignpattern

class EmployeeInfo private constructor(var mEmployeeInfoBuilder: EmployeeInfoBuilder) {

    data class EmployeeInfoBuilder(var mId: String) {
        lateinit var mName: String
        var mAge: Int = 0
        lateinit var mOccupation: String

        fun setName(name: String): EmployeeInfoBuilder {
            mName = name
            println(mName)
            return this
        }

        fun setAge(age: Int): EmployeeInfoBuilder {
            this.mAge = age
            println(mAge)
            return this
        }

        fun setOccupation(occupation: String): EmployeeInfoBuilder {
            mOccupation = occupation
            println(mOccupation)
            return this
        }

        fun build(): EmployeeInfo {
            return EmployeeInfo(this)
        }
    }

    fun getId(): String {
        return mEmployeeInfoBuilder.mId
    }

}

fun main() {
    var lBuilder = EmployeeInfo.EmployeeInfoBuilder("32323").setAge(35).setOccupation("").build()
    println(lBuilder.getId())
}