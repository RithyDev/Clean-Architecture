package com.rithydemo.navigation.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.rithydemo.navigation.R
import com.rithydemo.navigation.base.BaseActivity
import com.rithydemo.navigation.database.model.User
import com.rithydemo.navigation.extension.toast
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<MainViewModel>() {

    override val viewModel: MainViewModel by viewModel()
    override val layoutResource: Int get() = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.users.observe(this, Observer(this::updateUI))
    }

    private fun updateUI(users: List<User>) {
        toast("users size ${users.size}")
    }
}
