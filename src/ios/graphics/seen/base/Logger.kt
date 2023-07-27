package graphics.seen.base

import platform.posix.*

internal actual fun platformLog(level: LogLevel, tag: String, message: String) {
    val sysLevel = when (level) {
        LogLevel.INFO -> LOG_INFO
        LogLevel.WARN -> LOG_WARNING
        LogLevel.ERROR -> LOG_ERR
        LogLevel.FATAL -> LOG_CRIT
    }
    syslog(sysLevel, "[${TAG}.${level.name}]: $message")
}
