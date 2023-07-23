package ru.ladgertha.flavors_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.content.res.AppCompatResources
import ru.ladgertha.flavors_example.databinding.ActivityCatBinding

class CatActivity : AppCompatActivity() {

    private val getCatImageInteractor by lazy(LazyThreadSafetyMode.NONE) {
        GetCatImageInteractor()
    }
    private lateinit var binding: ActivityCatBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatBinding.inflate(layoutInflater)
        setContentView( binding.root)
        binding.catImage.background = AppCompatResources.getDrawable(this, getCatImageInteractor())
    }
}