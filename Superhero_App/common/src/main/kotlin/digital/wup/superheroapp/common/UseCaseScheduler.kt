package digital.wup.superheroapp.common

interface UseCaseScheduler {

    fun execute(runnable: () -> Unit)

    fun <Rs> notifyResponse(success: (Rs) -> Unit, response: Rs)

    fun notifyError(error: () -> Unit)
}