package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    private lateinit var resetEmailInput: EditText
    private lateinit var submitButton: Button
    private lateinit var fromResToMain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        mAuth = FirebaseAuth.getInstance()
        resetEmailInput=findViewById(R.id.resetPasswordEmailInput)
        fromResToMain=findViewById(R.id.fromResToMainButton)
        submitButton=findViewById(R.id.resetPasswordSubmitButton)
        fromResToMain.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        submitButton.setOnClickListener {
            val email=resetEmailInput.text.toString()
            if (email.isEmpty()){
                Toast.makeText(this, "გთხოვთ შეიყვანოთ ელ-ფოსტა", Toast.LENGTH_LONG).show()
            }
            else{
                mAuth.sendPasswordResetEmail(email).addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        Toast.makeText(this,"ინსტრუქციები გამოგეგზავნათ ელექტრონულ ფოსტაზე.", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this, MainActivity::class.java))
                    }
                }
            }
        }
    }
}
