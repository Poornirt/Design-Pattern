package creationaldesignpattern.singleton

object SocketConnection {

    fun connect() {
        println("Connected")
    }

    fun disconnect() {
        println("Disconnect")
    }
}

fun main() {
    val lInstance1 = SocketConnection
    val lInstance2: SocketConnection

    val constructor = SocketConnection::class.java.getDeclaredConstructor()
    constructor.isAccessible = true
    var newInst: SocketConnection = constructor.newInstance()

    lInstance2 = newInst
    println(lInstance1.hashCode())
    println(lInstance2.hashCode())
}