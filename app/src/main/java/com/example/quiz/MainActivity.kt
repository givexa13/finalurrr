package com.example.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var emailInput:EditText
    private lateinit var passwordInput: EditText
    private lateinit var loginButton:Button
    private lateinit var registerButton: Button
    private lateinit var resetButton: Button
    private lateinit var mAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth= FirebaseAuth.getInstance()
        emailInput=findViewById(R.id.signInEmailEditText)
        passwordInput=findViewById(R.id.signInPasswordEditText)
        registerButton=findViewById(R.id.goToRegistration)
        loginButton=findViewById(R.id.logIn)
        resetButton=findViewById(R.id.goToResetPassword)
        loginButton.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            if (email.isEmpty() or password.isEmpty())
                Toast.makeText(this,"შეიყვანეთ თქვენი ელ-ფოსტა და პაროლი",Toast.LENGTH_LONG).show()
            else{
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful)
                    {
                        startActivity(Intent(this, MtavariActivity::class.java))
                    }
                }
            }
        }
        registerButton.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
        resetButton.setOnClickListener {
            startActivity(Intent(this, ResetPasswordActivity::class.java))
        }
    }
}