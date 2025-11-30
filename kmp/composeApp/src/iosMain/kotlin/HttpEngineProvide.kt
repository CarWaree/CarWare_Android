import io.ktor.client.engine.HttpClientEngine

actual fun getHttpClientEngine(): HttpClientEngine {
    throw NotImplementedError("iOS engine not available on Windows. Implement on macOS.")
}