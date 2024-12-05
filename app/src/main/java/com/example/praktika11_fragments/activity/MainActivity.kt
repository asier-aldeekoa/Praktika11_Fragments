package com.example.praktika11_fragments.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.praktika11_fragments.R
import com.example.praktika11_fragments.databinding.ActivityMainBinding
import com.example.praktika11_fragments.fragments.HomeFragment
import com.example.praktika11_fragments.fragments.ProfileFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //Vinculamos con la vista
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Una vez vinculada la vista podemos usar su contenido
        //Vamos a inflar la vista con el fragments que no interesa
        //commit se utiliza para confirmar solicitus
        supportFragmentManager.beginTransaction().add(R.id.frameContainer, HomeFragment()).commit()

        binding.bottonNavMenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.mHome -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer, HomeFragment()).commit()
                R.id.mGehitu -> supportFragmentManager.beginTransaction().replace(R.id.frameContainer, ProfileFragment()).commit()
                R.id.mExit -> finish()
            }
            true
        }
    }
}