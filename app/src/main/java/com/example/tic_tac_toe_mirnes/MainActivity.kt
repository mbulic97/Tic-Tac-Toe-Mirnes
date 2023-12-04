package com.example.tic_tac_toe_mirnes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import com.example.tic_tac_toe_mirnes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var flag=0
    private var count=0

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
            binding.btn1.setOnClickListener {
                one_Button_disable_and_color(binding.btn1)

                if (flag == 0) {
                    binding.btn1.text = "X"
                    flag = 1
                } else {
                    binding.btn1.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn2.setOnClickListener {
                one_Button_disable_and_color(binding.btn2)

                if (flag == 0) {
                    binding.btn2.text = "X"
                    flag = 1
                } else {
                    binding.btn2.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn3.setOnClickListener {
                one_Button_disable_and_color(binding.btn3)

                if (flag == 0) {
                    binding.btn3.text = "X"
                    flag = 1
                } else {
                    binding.btn3.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn4.setOnClickListener {
                one_Button_disable_and_color(binding.btn4)

                if (flag == 0) {
                    binding.btn4.text = "X"
                    flag = 1
                } else {
                    binding.btn4.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn5.setOnClickListener {
                one_Button_disable_and_color(binding.btn5)

                if (flag == 0) {
                    binding.btn5.text = "X"
                    flag = 1
                } else {
                    binding.btn5.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn6.setOnClickListener {
                one_Button_disable_and_color(binding.btn6)

                if (flag == 0) {
                    binding.btn6.text = "X"
                    flag = 1
                } else {
                    binding.btn6.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn7.setOnClickListener {
                one_Button_disable_and_color(binding.btn7)

                if (flag == 0) {
                    binding.btn7.text = "X"
                    flag = 1
                } else {
                    binding.btn7.text = "O"
                    flag = 0
                }
                win()
                count++
            }


            binding.btn8.setOnClickListener {
                one_Button_disable_and_color(binding.btn8)

                if (flag == 0) {
                    binding.btn8.text = "X"
                    flag = 1
                } else {
                    binding.btn8.text = "O"
                    flag = 0
                }
                win()
                count++
            }
            binding.btn9.setOnClickListener {
                one_Button_disable_and_color(binding.btn9)
                if (flag == 0) {
                    binding.btn9.text = "X"
                    flag = 1
                } else {
                    binding.btn9.text = "O"
                    flag = 0
                }
                win()
                count++
            }

        binding.reset.setOnClickListener {
            binding.btn1.text=""
            binding.btn2.text=""
            binding.btn3.text=""
            binding.btn4.text=""
            binding.btn5.text=""
            binding.btn6.text=""
            binding.btn7.text=""
            binding.btn8.text=""
            binding.btn9.text=""
            enableButtons()
            flag=0
            count=0

        }

    }

    private fun one_Button_disable_and_color(btn1: Button) {
        btn1.isEnabled=false
        btn1.setBackgroundColor(getColor(R.color.silver))
    }


    private fun win() {

        if (binding.btn1.text == binding.btn2.text && binding.btn2.text == binding.btn3.text && binding.btn1.text != "") {//prvi red ---
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn2.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn1,binding.btn2,binding.btn3)
        } else if (binding.btn4.text == binding.btn5.text && binding.btn5.text == binding.btn6.text && binding.btn6.text != "") {//drugi red ---
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn6.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn4,binding.btn5,binding.btn6)

        } else if (binding.btn7.text == binding.btn8.text && binding.btn8.text == binding.btn9.text && binding.btn9.text != "") {//treci red ---
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn7.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn7,binding.btn8,binding.btn9)
        } else if (binding.btn1.text == binding.btn4.text && binding.btn4.text == binding.btn7.text && binding.btn7.text != "") {// 1 kol |
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn1.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn1,binding.btn4,binding.btn7)
        } else if (binding.btn2.text == binding.btn5.text && binding.btn5.text == binding.btn8.text && binding.btn8.text != "") {// 2. kol |
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn2.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn2,binding.btn5,binding.btn8)
        } else if (binding.btn3.text == binding.btn6.text && binding.btn6.text == binding.btn9.text && binding.btn9.text != "") {// 3. kol |
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn3.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn3,binding.btn6,binding.btn9)
        } else if (binding.btn1.text == binding.btn5.text && binding.btn5.text == binding.btn9.text && binding.btn9.text != "") {//kao \
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn1.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn1,binding.btn5,binding.btn9)
        } else if (binding.btn3.text == binding.btn5.text && binding.btn5.text == binding.btn7.text && binding.btn7.text != "") {//kao /
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn3.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons_and_colors()
            showbuttonwinner(binding.btn3,binding.btn5,binding.btn7)
        } else if (!binding.btn1.isEnabled && !binding.btn2.isEnabled && !binding.btn3.isEnabled && !binding.btn4.isEnabled && !binding.btn5.isEnabled && !binding.btn6.isEnabled && !binding.btn7.isEnabled && !binding.btn8.isEnabled && !binding.btn9.isEnabled) {
            Toast.makeText(this@MainActivity, "Match is Drawn.", Toast.LENGTH_LONG).show()
        }
    }

    private fun showbuttonwinner(btn1: Button, btn2: Button, btn3: Button) {
        btn1.setBackgroundColor(Color.BLUE)
        btn2.setBackgroundColor(Color.BLUE)
        btn3.setBackgroundColor(Color.BLUE)
    }

    private fun disableButtons_and_colors(){
        binding.btn1.isEnabled=false
        binding.btn2.isEnabled=false
        binding.btn3.isEnabled=false
        binding.btn4.isEnabled=false
        binding.btn5.isEnabled=false
        binding.btn6.isEnabled=false
        binding.btn7.isEnabled=false
        binding.btn8.isEnabled=false
        binding.btn9.isEnabled=false
        binding.btn1.setBackgroundColor(getColor(R.color.silver))
        binding.btn2.setBackgroundColor(getColor(R.color.silver))
        binding.btn3.setBackgroundColor(getColor(R.color.silver))
        binding.btn4.setBackgroundColor(getColor(R.color.silver))
        binding.btn5.setBackgroundColor(getColor(R.color.silver))
        binding.btn6.setBackgroundColor(getColor(R.color.silver))
        binding.btn7.setBackgroundColor(getColor(R.color.silver))
        binding.btn8.setBackgroundColor(getColor(R.color.silver))
        binding.btn9.setBackgroundColor(getColor(R.color.silver))

    }
    private fun enableButtons(){
        binding.btn1.isEnabled=true
        binding.btn2.isEnabled=true
        binding.btn3.isEnabled=true
        binding.btn4.isEnabled=true
        binding.btn5.isEnabled=true
        binding.btn6.isEnabled=true
        binding.btn7.isEnabled=true
        binding.btn8.isEnabled=true
        binding.btn9.isEnabled=true
        binding.btn1.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn2.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn3.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn4.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn5.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn6.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn7.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn8.setBackgroundColor(getColor(R.color.purple_500))
        binding.btn9.setBackgroundColor(getColor(R.color.purple_500))
    }
}