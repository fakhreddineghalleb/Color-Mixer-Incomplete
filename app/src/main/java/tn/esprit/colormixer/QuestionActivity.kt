package tn.esprit.colormixer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//TODO 2 Add string constant val here for RED / BLUE / YELLOW / PURPLE / GREEN / ORANGE


//TODO 3 Add string constant val here for NAME / MIXED_COLOR / COLOR1 / COLOR2 / RESULT / SUCCESS / FAILED


class QuestionActivity : AppCompatActivity() {

    //TODO 4 Add lateint var for binding

    //TODO 5 Add var for colorMixed / color1 / color2 / name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //TODO 6 Bind the view and implement setContentView()

        //TODO 7 Implement setOnClickListener on the button Mix and call mixColor()

    }

    private fun mixColor(){

        //TODO 8 Check if the input for FullName. IF it's empty show a snackbar with the message : You must enter your name !

        //TODO 9 Check if Only 2 colors are selected then change the value of  colorMixed / color1 / color2

        //TODO 10 Change the value of name with the input

        //TODO 11 Create an Intent to AnswerActivity and add all of the values name / colorMixed / color1 / color2 Then start the Activity

    }
}