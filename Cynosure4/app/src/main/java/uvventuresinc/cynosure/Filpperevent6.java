package uvventuresinc.cynosure;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ViewFlipper;


public class Filpperevent6 extends Activity {
    ViewFlipper flippy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_6);
        flippy = (ViewFlipper) findViewById(R.id.viewFlipper);

        flippy.setFlipInterval(50);
        flippy.startFlipping();

    }

}