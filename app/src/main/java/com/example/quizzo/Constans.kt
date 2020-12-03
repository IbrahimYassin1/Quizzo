package com.example.quizzo

object Constans {

    const val mUserName: String = "userName"
    const val mTotalQuestion: String = "TotalQuestions"
    const val mCorrectAnswers: String = "CorrectAnswers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which team has Zlatan played for?",
            R.drawable.png_zlatan,
            "Fc Barcelona",
            "Liverpool",
            "Arsenal",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the name of the football player?",
            R.drawable.png_mourinho,
            "Zlatan Ibrahimovic",
            "Lionel Messi",
            "Cristiano Ronaldo",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What is the name of the team?",
            R.drawable.png_chicagooow,
            "Denver Nuggets",
            "Boston Celtics",
            "Chicago Bulls",
            3
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the name of the football player?",
            R.drawable.png_lottanyaaa,
            "Lotta Schelin",
            "Kosovare Asllani",
            "Hanna Marklund",
            1
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What is the name of the basketball player?",
            R.drawable.png_lebronjames,
            "Lebron James",
            "Dwayne Wade",
            "Carmelo Anthony",
            1
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which league does Arsenal play in?",
            R.drawable.png_arsenall,
            "Serie A",
            "Premier League",
            "La Liga",
            2
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this team?",
            R.drawable.png_stluisbluesnyaa,
            "Edmonton Oilers",
            "Winnipeg Jets",
            "St. Luis Blues",
            3
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What position does Tom Brady play?",
            R.drawable.png_tomm,
            "Quarterback",
            "Runningback",
            "Cornerback",
            1
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "Which team plays in this league",
            R.drawable.png_premierleague,
            "Real Madrid",
            "Aik",
            "Manchester United",
            3
        )

        questionsList.add(que9)
        val que10 = Question(
            10,
            "What sport does he train in?",
            R.drawable.png_pepguardiola,
            "Football",
            "Basketball",
            "ice Hockey",
            1
        )

        questionsList.add(que10)


        return questionsList

    }

}