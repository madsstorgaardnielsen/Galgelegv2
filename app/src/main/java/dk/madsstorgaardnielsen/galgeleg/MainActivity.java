package dk.madsstorgaardnielsen.galgeleg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//TODO STARTMENU, HIGHSCORES, BEDRE LOGIK, AFSLUT SPIL SKAL TAGE EN TIL MENU OG IKKE LUKKE APP

    Button startNewGame, help, highscore;
    Intent newGameIntent, helpIntent, highscoreIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newGameIntent = new Intent(this, Galgeleg.class);
        helpIntent = new Intent(this, HelpMenu.class);
        highscoreIntent = new Intent(this, Highscore.class);

        startNewGame = findViewById(R.id.startGame);
        help = findViewById(R.id.helpButton);
        highscore = findViewById(R.id.highScore);

        startNewGame.setOnClickListener(this);
        help.setOnClickListener(this);
        highscore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == startNewGame) {
            startActivity(newGameIntent);
        } else if (v == help) {
            startActivity(helpIntent);
        } else if (v == highscore) {
            startActivity(highscoreIntent);
        }
    }
}