package uvventuresinc.cynosure;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;


/**
 * Created by admin on 2/12/2015.
 */
public class Filpper extends Activity {
    ViewFlipper flippy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        flippy = (ViewFlipper) findViewById(R.id.viewFlipper);

        flippy.setFlipInterval(50);
        flippy.startFlipping();

    }

}