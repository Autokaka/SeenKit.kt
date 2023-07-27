package graphics.seen.base

const val TAG = "SeenKit"

internal enum class LogLevel { INFO, WARN, ERROR, FATAL }

private fun log(level: LogLevel, message: String) {
    platformLog(level, TAG, message)
}

internal fun logi(message: String) = log(LogLevel.INFO, message)
internal fun logw(message: String) = log(LogLevel.WARN, message)
internal fun loge(message: String) = log(LogLevel.ERROR, message)
internal fun logf(message: String) = log(LogLevel.FATAL, message)

internal expect fun platformLog(level: LogLevel, tag: String, message: String)
