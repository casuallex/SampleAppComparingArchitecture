package com.example.sampleappcomparingarchitecture.ui

import android.app.Activity
import android.content.Context
import android.util.AttributeSet
import android.view.View
import arrow.core.Either
import arrow.core.Tuple2Of
import arrow.core.rightIfNull
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : Activity() {
    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        Either.left("asd")
        Either.right("asd").rightIfNull {  }
        return super.onCreateView(name, context, attrs)
    }
}