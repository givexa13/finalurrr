package com.example.quiz

class Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val question1 = Question(
            1,
            "რომელ პოეტს ეკუთვნის ლექსი 'შემოდგომა „უმანკო ჩასახების“ მამათა სავანეში?'",
            R.drawable.galak_tioni,

            "ილია ჭავჭავაძე",
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
            3
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



        return questionList

    }

    }






