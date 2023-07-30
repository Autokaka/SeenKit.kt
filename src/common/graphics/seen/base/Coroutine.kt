package graphics.seen.base

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

/**
 * @author Acclex
 * Create on 2023/7/28
 */
expect val renderDispatcher: CoroutineDispatcher

internal object RenderScope : CoroutineScope {
    private val handler = CoroutineExceptionHandler { coroutineContext, throwable ->

    }
    override val coroutineContext: CoroutineContext
        get() = renderDispatcher + Job() + handler

}