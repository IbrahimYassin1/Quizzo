package com.example.quizzo

object Constans {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which team has Zlatan played for?",
            R.drawable.zlatan,
            "Fc Barcelona",
            "Liverpool",
            "Arsenal",
            1
        )

        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the name of the football player?",
            R.drawable.messi,
            "Zlatan Ibrahimovic",
            "Lionel Messi",
            "Cristiano Ronaldo",
            2
        )

        questionsList.add(que2)

        val que3 = Question(
            3,
            "What is the name of the team?",
            R.drawable.chicago,
            "Denver Nuggets",
            "Boston Celtics",
            "Chicago Bulls",
            3
        )

        questionsList.add(que3)

        val que4 = Question(
            4,
            "What is the name of the football player?",
            R.drawable.lottaschelin,
            "Lotta Schelin",
            "Kosovare Asllani",
            "Hanna Marklund",
            1
        )

        questionsList.add(que4)

        val que5 = Question(
            5,
            "What is the name of the basketball player?",
            R.drawable.lebronjames,
            "Lebron James",
            "Dwayne Wade",
            "Carmelo Anthony",
            1
        )

        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which league does Arsenal play in?",
            R.drawable.arsenal,
            "Serie A",
            "Premier League",
            "La Liga",
            2
        )

        questionsList.add(que6)

        val que7 = Question(
            7,
            "What is the name of this team??",
            R.drawable.stluisblues,
            "Edmonton Oilers",
            "Winnipeg Jets",
            "St. Luis Blues",
            3
        )

        questionsList.add(que7)

        val que8 = Question(
            8,
            "What position does Tom Brady play?",
            R.drawable.tombrady,
            "Quarterback",
            "Runningback",
            "Cornerback",
            1
        )

        questionsList.add(que8)

        val que9 = Question(
            9,
            "Which team plays in this league",
            R.drawable.allsvenskan,
            "Real Madrid",
            "Aik",
            "Manchester United",
            2
        )

        questionsList.add(que9)
        val que10 = Question(
            10,
            "What sport does he train in?",
            R.drawable.mourinho,
            "Football",
            "Basketball",
            "ice Hockey",
            3
        )

        questionsList.add(que10)


        return questionsList

    }

}