package com.example.common

import android.content.Context
import android.content.res.Resources

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(context: Context): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val resources: Resources = context.resources
        // 1
        val que1 = Question(
            1,
            resources.getString(R.string.the_question),
            R.drawable.q1_img,
            resources.getString(R.string.option1), resources.getString(R.string.option2),
            resources.getString(R.string.option3), resources.getString(R.string.option4), 1
        )

        questionsList.add(que1)

        2
        val que2 = Question(
            2, resources.getString(R.string.the_question),
            R.drawable.q2_img,
            resources.getString(R.string.option5), resources.getString(R.string.option4),
            resources.getString(R.string.option2), resources.getString(R.string.option3), 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, resources.getString(R.string.the_question),
            R.drawable.q3_img,
            resources.getString(R.string.option6), resources.getString(R.string.option7),
            resources.getString(R.string.option8), resources.getString(R.string.option9), 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, resources.getString(R.string.the_question),
            R.drawable.q4_img,
            resources.getString(R.string.option10), resources.getString(R.string.option11),
            resources.getString(R.string.option12), resources.getString(R.string.option7), 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, resources.getString(R.string.the_question),
            R.drawable.q5_img,
            resources.getString(R.string.option13), resources.getString(R.string.option14),
            resources.getString(R.string.option15), resources.getString(R.string.option16), 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, resources.getString(R.string.the_question),
            R.drawable.q6_img,
            resources.getString(R.string.option17), resources.getString(R.string.option18),
            resources.getString(R.string.option19), resources.getString(R.string.option20), 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, resources.getString(R.string.the_question),
            R.drawable.q7_img,
            resources.getString(R.string.option21), resources.getString(R.string.option22),
            resources.getString(R.string.option23), resources.getString(R.string.option24), 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, resources.getString(R.string.the_question),
            R.drawable.q8_img,
            resources.getString(R.string.option25), resources.getString(R.string.option26),
            resources.getString(R.string.option27), resources.getString(R.string.option28), 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, resources.getString(R.string.the_question),
            R.drawable.q9_img,
            resources.getString(R.string.option2), resources.getString(R.string.option29),
            resources.getString(R.string.option30), resources.getString(R.string.option31), 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, resources.getString(R.string.the_question),
            R.drawable.q10_img,
            resources.getString(R.string.option32), resources.getString(R.string.option33),
            resources.getString(R.string.option34), resources.getString(R.string.option35), 1
        )

        questionsList.add(que10)

        return questionsList
    }
}