package com.rithydemo.navigation.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.lang.reflect.ParameterizedType

abstract class BaseActivity<VM: BaseViewModel> : AppCompatActivity() {

    abstract val viewModel: VM
    abstract val layoutResource: Int @LayoutRes get

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResource)
        lifecycle.addObserver(viewModel)
    }

    @Suppress("UNCHECKED_CAST")
    private fun getGenericClass() : Class<VM> {
        return (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] as Class<VM>
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycle.removeObserver(viewModel)
    }
}