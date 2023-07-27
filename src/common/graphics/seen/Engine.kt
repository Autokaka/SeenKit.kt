package graphics.seen

import graphics.seen.gpu.Device
import kotlin.native.concurrent.*

class Bundle(val path: String) {
    val sandboxDirectory: String = TODO()
    val assetsDirectory: String = TODO()
}

class Engine {
    var width: Int = 0
    var height: Int = 0

    fun update(timeStepMillis: Double) : Boolean {
        return false
    }

    fun run(bundle: Bundle?) {}

    private val _device: Device = TODO()
    private val _mainExecutor = Executors.newSingleThreadExecutor().asCoroutineDispatcher()
}