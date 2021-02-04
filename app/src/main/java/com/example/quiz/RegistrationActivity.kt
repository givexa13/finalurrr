package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class RegistrationActivity : AppCompatActivity() {
    private lateinit var regEmailInput: EditText
    private lateinit var regPasswordInput: EditText
    private lateinit var regConfirmPasswordInput: EditText
    private lateinit var regButton: Button
    private lateinit var fromRegToMain: Button
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        mAuth = FirebaseAuth.getInstance()
        regEmailInput = findViewById(R.id.RegistarionEmailInput)
        regPasswordInput = findViewById(R.id.RegistrationPasswordInput)
        regConfirmPasswordInput = findViewById(R.id.RegistrationConfirmPasswordInput)
        fromRegToMain = findViewById(R.id.FromRegToMainButton)
        regButton = findViewById(R.id.RegistrationButton)
        regButton.setOnClickListener {
            val email = regEmailInput.text.toString()
            val regPassword = regPasswordInput.text.toString()
            val confirmPassword = regConfirmPasswordInput.text.toString()
            if (email.isEmpty() || regPassword.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "შეიყვანეთ ელფოსტა და პაროლი", Toast.LENGTH_LONG).show()
            } else {
                if (regPassword == confirmPassword) {
                    if (email.isNotEmpty() && regPassword.isNotEmpty()) {
                        mAuth.createUserWithEmailAndPassword(email, regPassword)
                                .addOnCompleteListener { task ->
                                    if (task.isSuccessful) {
                                        Toast.makeText(
                                                this,
                                                "რეგისტრაცია წარმატებით დასრულდა",
                                                Toast.LENGTH_SHORT
                                        ).show()
                                        startActivity(Intent(this, MainActivity::class.java))
                                    }
                                }
                    }

                }
                if (regPassword != confirmPassword) {
                    Toast.makeText(this, "პაროლები არ ემთხვევა გთხოვთ ცადეთ ახლიდან", Toast.LENGTH_LONG).show()
                }
            }

            }
        fromRegToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
