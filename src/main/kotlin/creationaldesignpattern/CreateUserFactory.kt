package creationaldesignpattern

enum class UserType {
    STAFF, CUSTOMER, GUEST
}

interface UserTypeFactory {
    fun createConfigOnUser(pUserType: UserType)
}

abstract class Config {
    abstract fun configObject()
}

class Staff : Config() {
    override fun configObject() {
        println(UserType.STAFF)
    }
}

class Customer : Config() {
    override fun configObject() {
        println(UserType.CUSTOMER)
    }
}

class Guest : Config() {
    override fun configObject() {
        println(UserType.GUEST)
    }
}

class CreateUserFactory : UserTypeFactory {
    override fun createConfigOnUser(pUserType: UserType) {
        val config: Config = when (pUserType) {
            UserType.STAFF -> {
                Staff()
            }
            UserType.CUSTOMER -> {
                Customer()
            }
            UserType.GUEST -> {
                Guest()
            }
        }
        config.configObject()
    }
}

fun main() {
    CreateUserFactory().createConfigOnUser(UserType.STAFF)
}