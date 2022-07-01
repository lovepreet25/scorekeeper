// Name : Lovepreet Kaur
// Student Id: A00238391
// Assignment 5 : Events



package com.lovepreet.scorekeeper;



        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioGroup;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    // declaring components
    private TextView teamScoreRedTextView;
    private TextView teamScoreBlueTextView;

    private int incrementBy;
    private int teamRedScore;
    private int teamBlueScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        teamRedScore = 0;
        teamBlueScore = 0;

        //finding all the views by ids, refer to the xml page for the ids,
        
        RadioGroup radioGroup = findViewById(R.id.radio_group);

        teamScoreRedTextView = findViewById(R.id.team_score_red);
        teamScoreBlueTextView = findViewById(R.id.team_score_blue);

        teamScoreBlueTextView.setText(Integer.toString(teamBlueScore));
        teamScoreRedTextView.setText(Integer.toString(teamRedScore));

        Button upButtonRed = findViewById(R.id.buttonUp_red);
        Button downButtonRed = findViewById(R.id.buttonDown_red);
        Button upButtonBlue = findViewById(R.id.buttonUp_blue);
        Button downButtonBlue = findViewById(R.id.buttonDown_blue);

        //setting onClickListeners for these vie
        radioGroup.setOnCheckedChangeListener(this);
        upButtonRed.setOnClickListener(this);
        downButtonRed.setOnClickListener(this);
        upButtonBlue.setOnClickListener(this);
        downButtonBlue.setOnClickListener(this);
    }
// setting on click for radio buttons
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        
        switch (i){
            case 1:
                incrementBy = 1;
                break;
            case 2:
                incrementBy = 2;
                break;
            case 3:
                incrementBy = 3;
                break;
        }
    }
 //setting on click buttons to perform the  respective functions 
    @Override
    public void onClick(View view) {
        int id = view.getId();
          switch (id){
            case R.id.buttonUp_blue:
                teamBlueScore += incrementBy;
                teamScoreBlueTextView.setText(Integer.toString(teamBlueScore));
                break;
            case R.id.buttonDown_blue:
                teamBlueScore -= incrementBy;
                teamScoreBlueTextView.setText(Integer.toString(teamBlueScore));
                break;
            case R.id.buttonUp_red:
                teamRedScore += incrementBy;
                teamScoreRedTextView.setText(Integer.toString(teamRedScore));
                break;
            case R.id.buttonDown_red:
                teamRedScore -= incrementBy;
                teamScoreRedTextView.setText(Integer.toString(teamRedScore));
                break;
        }
    }
}
