package com.rithydemo.navigation.di.module

import com.rithydemo.navigation.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val viewModelModule: Module = module {

    viewModel { MainViewModel(get()) }
}