package com.follow.clash

import com.follow.clash.common.ServiceDelegate
import com.follow.clash.common.intent
import com.follow.clash.service.ICallbackInterface
import com.follow.clash.service.IRemoteInterface
import com.follow.clash.service.RemoteService
import com.follow.clash.service.models.VpnOptions
import java.util.concurrent.atomic.AtomicBoolean

object Service {
    private val delegate by lazy {
        ServiceDelegate<IRemoteInterface>(
            RemoteService::class.intent,
        ) {
            IRemoteInterface.Stub.asInterface(it)
        }
    }

    private val bindingState = AtomicBoolean(false)

    fun bind() {
        if (bindingState.compareAndSet(false, true)) {
            delegate.bind()
        }
    }

    fun unbind() {
        if (bindingState.compareAndSet(true, false)) {
            delegate.unbind()
        }
    }

    suspend fun invokeAction(
        data: String, cb: (result: String?) -> Unit
    ) {
        delegate.useService {
            it.invokeAction(data, object : ICallbackInterface.Stub() {
                override fun onResult(result: String?) {
                    cb(result)
                }
            })
        }
    }

    suspend fun setMessageCallback(
        cb: (result: String?) -> Unit
    ) {
        delegate.useService {
            it.setMessageCallback(object : ICallbackInterface.Stub() {
                override fun onResult(result: String?) {
                    cb(result)
                }
            })
        }
    }

    suspend fun startService(options: VpnOptions, inApp: Boolean) {
        delegate.useService { it.startService(options, inApp) }
    }

    suspend fun stopService() {
        delegate.useService { it.stopService() }
    }
}