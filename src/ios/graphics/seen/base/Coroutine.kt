package graphics.seen.base

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Runnable
import platform.darwin.dispatch_async
import platform.darwin.dispatch_get_main_queue

/**
 * @author Acclex
 * Create on 2023/7/30
 */
actual val renderDispatcher: CoroutineDispatcher = RenderDispatcher

@ThreadLocal
internal object RenderDispatcher : CoroutineDispatcher() {
    override fun dispatch(context: CoroutineContext, block: Runnable) {
        dispatch_async(dispatch_get_main_queue()) {
            try {
                block.run()
            } catch (err: Throwable) {
                throw err
            }
        }
    }
}