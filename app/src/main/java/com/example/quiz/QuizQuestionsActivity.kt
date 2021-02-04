package com.example.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0


    private lateinit var progressBar: ProgressBar
    private lateinit var giviko: TextView
    private lateinit var zviadi: TextView
    private lateinit var pirv: TextView
    private lateinit var meore: TextView
    private lateinit var mesame: TextView
    private lateinit var meotxe: TextView
    private lateinit var submitButton: Button








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        fun getQuestions(): ArrayList<Question> {
            val questionList = ArrayList<Question>()

            val question1 = Question(
                    1,
                    "რომელ პოეტს ეკუთვნის ლექსი 'შემოდგომა „უმანკო ჩასახების“ მამათა სავანეში?'",
                     R.drawable.galak_tioni,

                    "ბესიკი",
                    "გაგა ნახუცრიშვილი",
                    "ალექსანდრე აბაშელი","გალაკტიონ ტაბიძე",

                    4
            )
            questionList.add(question1)

            val question2 = Question(
                    2,
                    "რომელ პოეტს ეკუთვნის ლექსი 'არ ვიცი,ასე რამ შემაყვარა!'?",
                R.drawable.la_do,
                    "კოლაუ ნადირაძე",
                    "გიორგი ლეონიძე",
                    "ლადო ასათიანი","ნიკოლოზ ბარათაშვილი",
                    3
            )
            questionList.add(question2)

            val question3 = Question(
                    3,
                    "რომელ პოეტს ეკუთვნის ლექსი 'ადამიანი გაზეთის სვეტში'?",
                    R.drawable.otar_chila,
                    "ტერენტი გრანელი",
                    "მუხრან მაჭავარიანი",
                    "ოთარ ჭილაძე","მირზა გელოვანი",
                    3
            )
            questionList.add(question3)

            val question4 = Question(
                    4,
                    "რომელ პოეტს ეკუთვნის პოემა 'გამზრდელი'?",
                    R.drawable.akaki_wereteli,
                    "მურმან ლებანიძე",
                    "ილია ჭავჭავაძე",
                    "ვაჟა-ფშაველა","აკაკი წერეთელი",
                    4
            )
            questionList.add(question4)

            val question5 = Question(
                    5,
                    "რომელი პოეტი წერდა ელენე დარიანის ფსევდონიმით?",
                    R.drawable.paolo_ia,
                    "ვალერიან გაფრინდაშვილი",
                    "სიმონ ჩიქოვანი",
                    "პაოლო იაშვილი","ტიციან ტაბიძე",
                    3
            )
            questionList.add(question5)

            val question6 = Question(
                    6,
                    "რომელ პოეტს ეკუთვნის 'ლექსი მეწყერი'?",
                    R.drawable.ti_ciani,
                    "იოსებ ნონეშვილი",
                    "ტიციან ტაბიძე",
                    "თამაზ ჭილაძე","გრიგოლ აბაშიძე",
                    2
            )
            questionList.add(question6)

            val question7 = Question(
                    7,
                    "რომელ პოეტს ეკუთვნის ლექსი 'თუთა'?",
                R.drawable.ana_kalandadze,
                    "ანა კალანდაძე",
                    "ელენე დარიანი",
                    "კატო მიქელაძე",
                    "ეკატერინე გაბაშვილი",
                    1
            )
            questionList.add(question7)

            val question8 = Question(
                    8,
                    "რომელ პოეტს ეკუთვნის ლექსი 'Memento Mori'?",
                    R.drawable.haha,
                    "პაოლო იაშვილი",
                    "გალაკტიონი",
                    "ტერენტი გრანელი", "ბესიკი",
                    3
            )
            questionList.add(question8)

            val question9 = Question(
                    9,
                    "რომელ პოეტს ეკუთვნის ლექსი 'ტანო ტატანო'?" ,
                    R.drawable.wallpaper,
                    "გრიგოლ აბაშიძე",
                    "ილია ჭავჭავაძე",
                    "ბესიკი","აკაკი წერეთელი",
                    3
            )
            questionList.add(question9)

            val question10 = Question(
                    10,
                    "რომელ პოეტს ეკუთვნის ლექსი 'სენტიმენტალური ტრიოლეტი'?" ,
                    R.drawable.ana_kalandadze,
                    "ვალერიან გაფრინდაშვილი",
                    "ტიციან ტაბიძე",
                    "შოთა ჩანტლაძე", "პაოლო იაშვილი",
                    1
            )
            questionList.add(question10)

            return questionList

        }











        mQuestionList = getQuestions()

        giviko = findViewById(R.id.tv_progress)
        zviadi = findViewById(R.id.tv_question)
        pirv = findViewById(R.id.tv_option_one)
        meore = findViewById(R.id.tv_option_two)
        mesame = findViewById(R.id.tv_option_three)
        meotxe = findViewById(R.id.tv_option_four)
        submitButton = findViewById(R.id.btn_submit)
        progressBar = findViewById(R.id.progressBar)

        setQuestion()

        pirv.setOnClickListener(this )
        meore.setOnClickListener(this)
        mesame.setOnClickListener(this)
        meotxe.setOnClickListener(this)
        submitButton.setOnClickListener(this)




    }
    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        val question = mQuestionList!![mCurrentPosition-1]
        defaultOptionsView()

        if(mCurrentPosition == mQuestionList!!.size)
        {
            submitButton.text = "Finish"
        }
        else{
            submitButton.text = "Submit"
        }
        progressBar.progress = mCurrentPosition

        giviko.text = "$mCurrentPosition" + "/" + progressBar.max

        zviadi.text = question.question

        pirv.text = question.optionOne



        meore.text = question.optionTwo


        mesame.text = question.optionThree


        meotxe.text = question.optionFour




    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> {
                selectedOptionView(pirv, 1)

            }
            R.id.tv_option_two -> {
                selectedOptionView(meore, 2)

            }
            R.id.tv_option_three -> {
                selectedOptionView(mesame, 3)

            }
            R.id.tv_option_four -> {
                selectedOptionView(meotxe,4)
            }

            R.id.btn_submit -> {
                if(mSelectedOptionPosition == 0) {
                    mCurrentPosition ++
                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                            Toast.makeText(
                                    this,
                                    "You have successfully completed the quiz", Toast.LENGTH_SHORT

                            ).show()
                            val intent = Intent(this, MtavariActivity::class.java)
                            startActivity(intent)

                        }
                    }
                }
                    else run {
                        val question = mQuestionList?.get(mCurrentPosition - 1)
                        if (question!!.correctOption != mSelectedOptionPosition) {
                            answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        }
                        answerView(question.correctOption, R.drawable.correct_option_border_bg)
                        if (mCurrentPosition == mQuestionList!!.size) {
                            submitButton.text = "Finish"
                        } else {
                            submitButton.text = "Next Question"
                        }
                        mSelectedOptionPosition = 0
                    }

            }



        }







    }











    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(pirv)
        options.add(meore)
        options.add(mesame)
        options.add(meotxe)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.default_option_border_bg
            )
        }

    }
    private fun selectedOptionView(tv: TextView,selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
        R.drawable.selected_option_border_bg)
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                pirv.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 -> {
                meore.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 -> {
                mesame.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 -> {
                meotxe.background = ContextCompat.getDrawable(this,drawableView)
            }

        }
    }



}