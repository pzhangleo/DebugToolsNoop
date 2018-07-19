package com.zhp.tools

import android.app.Application
import okhttp3.Interceptor

fun init(app: Application) {
    initPandora(app)
    initStetho(app)
}

/**
 * https://github.com/whataa/pandora
 */
fun initPandora(app: Application) {
}

/**
 * https://github.com/whataa/pandora
 */
fun initPandoraEnableShake(app: Application) {
}

/**
 * https://github.com/facebook/stetho
 */
fun initStetho(app: Application) {
}

fun openPandora() {
}

fun closePandora() {
}

fun getPandoraInterceptor(): Interceptor {
    return NoopInterceptor()
}

fun getStethoIntercepter(): Interceptor {
    return NoopInterceptor()
}