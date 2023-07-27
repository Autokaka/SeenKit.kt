package graphics.seen.base

import android.util.Log

internal actual fun platformLog(level: LogLevel, tag: String, message: String) {
    when (level) {
        LogLevel.INFO -> Log.i(tag, message)
        LogLevel.WARN -> Log.w(tag, message)
        LogLevel.ERROR -> Log.e(tag, message)
        LogLevel.FATAL -> Log.wtf(tag, message)
    }
}
