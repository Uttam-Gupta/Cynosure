package uvventuresinc.cynosure;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ViewFlipper;


public class Filpperhome extends Activity {
    ViewFlipper flippy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        flippy = (ViewFlipper) findViewById(R.id.viewFlipper);

        flippy.setFlipInterval(50);
        flippy.startFlipping();

    }

}