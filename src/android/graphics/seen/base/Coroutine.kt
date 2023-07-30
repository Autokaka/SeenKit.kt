package graphics.seen.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

/**
 * @author Acclex
 * Create on 2023/7/30
 */
private val renderExecutor =
    Executors.newSingleThreadExecutor { r -> Thread(r).apply { name = "seen-kit render thread" } }
actual val renderDispatcher: CoroutineDispatcher = renderExecutor.asCoroutineDispatcher()