package com.example.fruitapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Fruit(
    val Name : String ,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int

)