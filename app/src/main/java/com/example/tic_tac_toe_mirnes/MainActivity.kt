package com.example.tic_tac_toe_mirnes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
                binding.btn1.isEnabled=false
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
                binding.btn2.isEnabled=false
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
                binding.btn3.isEnabled=false
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
                binding.btn4.isEnabled=false
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
                binding.btn5.isEnabled=false
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
                binding.btn6.isEnabled=false
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
                binding.btn7.isEnabled=false
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
                binding.btn8.isEnabled=false
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
                binding.btn9.isEnabled=false

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



    private fun win() {

        if (binding.btn1.text == binding.btn2.text && binding.btn2.text == binding.btn3.text && binding.btn1.text != "") {//prvi red ---
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn2.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            // newGame()

        } else if (binding.btn4.text == binding.btn5.text && binding.btn5.text == binding.btn6.text && binding.btn6.text != "") {//drugi red ---
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn6.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            //  newGame()
        } else if (binding.btn7.text == binding.btn8.text && binding.btn8.text == binding.btn9.text && binding.btn9.text != "") {//treci red ---
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn7.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            //  newGame()
        } else if (binding.btn1.text == binding.btn4.text && binding.btn4.text == binding.btn7.text && binding.btn7.text != "") {// 1 kol |
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn1.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            // newGame()
        } else if (binding.btn2.text == binding.btn5.text && binding.btn5.text == binding.btn8.text && binding.btn8.text != "") {// 2. kol |
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn2.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            // newGame()
        } else if (binding.btn3.text == binding.btn6.text && binding.btn6.text == binding.btn9.text && binding.btn9.text != "") {// 3. kol |
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn3.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            //newGame()
        } else if (binding.btn1.text == binding.btn5.text && binding.btn5.text == binding.btn9.text && binding.btn9.text != "") {//kao \
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn1.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            //newGame()
        } else if (binding.btn3.text == binding.btn5.text && binding.btn5.text == binding.btn7.text && binding.btn7.text != "") {//kao /
            Toast.makeText(this@MainActivity, "Winner is: ${binding.btn3.text}", Toast.LENGTH_LONG)
                .show()
            disableButtons()
            //newGame()
        } else if (!binding.btn1.isEnabled && !binding.btn2.isEnabled && !binding.btn3.isEnabled && !binding.btn4.isEnabled && !binding.btn5.isEnabled && !binding.btn6.isEnabled && !binding.btn7.isEnabled && !binding.btn8.isEnabled && !binding.btn9.isEnabled) {
            Toast.makeText(this@MainActivity, "Match is Drawn.", Toast.LENGTH_LONG).show()

        }
    }




    private fun disableButtons(){
        binding.btn1.isEnabled=false
        binding.btn2.isEnabled=false
        binding.btn3.isEnabled=false
        binding.btn4.isEnabled=false
        binding.btn5.isEnabled=false
        binding.btn6.isEnabled=false
        binding.btn7.isEnabled=false
        binding.btn8.isEnabled=false
        binding.btn9.isEnabled=false
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
    }
}