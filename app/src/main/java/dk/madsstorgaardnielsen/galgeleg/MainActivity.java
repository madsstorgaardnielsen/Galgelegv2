package dk.madsstorgaardnielsen.galgeleg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button startNewGame;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, Galgeleg.class);
        startNewGame = findViewById(R.id.startGame);

        startNewGame.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        startActivity(intent);
    }
}