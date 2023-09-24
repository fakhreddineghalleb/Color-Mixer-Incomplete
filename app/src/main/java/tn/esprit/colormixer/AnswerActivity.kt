package tn.esprit.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AnswerActivity : AppCompatActivity() {

    //TODO 12 Add lateint var for binding

    private var correctColor = "NONE"
    private var name = "NONE"
    private var color1 = "NONE"
    private var color2 = "NONE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO 13 Bind the view and implement setContentView()

        //TODO 14 Change the value of correctColor / name / color1 / color2 with the DATA from the INTENT

        //TODO 15 Change the txtChoosed with : "You chose $color1 and $color2"

        //TODO 16 Implement setOnClickListener on the btnSubmit and call checkAnswer()
        // You must check if only one radio button is selected the navigate to the ResultActivity with the data name and RESULT (FAILED/SUCCESS)

    }

    private fun checkAnswer(): Boolean{

        //TODO 17 Check if the answer of the chosen color is correct

        return false
    }
}