package exercice.matasse.beerhamyde;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by MATASSE on 01/08/2016.
 */
public class PlayerChoser extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_number);

        Intent intent = getIntent();

    }


}
