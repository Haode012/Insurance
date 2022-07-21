package my.edu.tarc.insurance

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isEmpty
import my.edu.tarc.insurance.databinding.ActivityMainBinding
import java.text.NumberFormat
import javax.net.ssl.SSLSessionBindingEvent

class MainActivity : AppCompatActivity() {
    //TODO 2: Create an instance of view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //TODO 3: Initialize the view binding
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener() {
            val age = binding.spinnerAge.selectedItemPosition
            val gender = binding.radioGroup2.checkedRadioButtonId
            val smoker = binding.checkBoxSmoker.isChecked
            var premium = 0
            if (age == 0) {
                premium += 60
            }

            premium = when (age) {
                0 -> 60
                1 -> 70
                2 -> 90
                3 -> 120
                else -> 150
            }

            if (gender == binding.radioButttonMale.id) {
                premium += when (age) {
                    0 -> 0
                    1 -> 50
                    2 -> 100
                    3 -> 150
                    else -> 200
                }
                }

                if (gender == binding.radioButtonFemale.id) {

                    }

                    if (smoker) {

                    }
                    val outputPremium = NumberFormat.getCurrencyInstance().format(premium)
                    binding.textViewPremium.text = outputPremium
                }

                binding.buttonReset.setOnClickListener {
                }
            }
        }
