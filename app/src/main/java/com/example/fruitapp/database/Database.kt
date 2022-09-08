package com.example.fruitapp.database

import com.example.fruitapp.R
import com.example.fruitapp.model.Fruit

class Database() {
    fun loadfruits() : List<Fruit> {
        return listOf(
            Fruit("Mangoes", R.drawable.mangoes,R.string.mangoes),
            Fruit("Oranges", R.drawable.oranges,R.string.oranges),
            Fruit("Apples", R.drawable.apples,R.string.apples),
            Fruit("Pomegranates", R.drawable.pomegranates,R.string.Pomegranates),
            Fruit("Watermelons", R.drawable.watermelons,R.string.Watermelons),
            Fruit("Bananas", R.drawable.bananas,R.string.Bananas),
            Fruit("Papaya", R.drawable.papaya,R.string.Papaya),
            Fruit("Guava", R.drawable.guava,R.string.Guava),
            Fruit("Strawberries", R.drawable.strawberries,R.string.Strawberries),
            Fruit("Grapes", R.drawable.grapes,R.string.Grapes),
            Fruit("Apricot", R.drawable.apricot,R.string.Apricot),
            Fruit("Avocado", R.drawable.avocado,R.string.Avocado),
            Fruit("Dragonfruit", R.drawable.dragonfruit,R.string.Dragonfruit),
            Fruit("Fig", R.drawable.fig,R.string.Fig),
            Fruit("Kiwifruit", R.drawable.kiwifruit,R.string.Kiwifruit),
            Fruit("Pineapple", R.drawable.pineapple ,R.string.Pineapple)
        )
    }
}