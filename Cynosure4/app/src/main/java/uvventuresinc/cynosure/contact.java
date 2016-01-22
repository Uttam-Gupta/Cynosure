package uvventuresinc.cynosure;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class contact extends Fragment {
TextView t1;
    TextView t2;
    View rootview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.activity_contact, container, false);
        t1=(TextView) rootview.findViewById(R.id.text_view1);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t1.setTypeface(font1);
        t2=(TextView) rootview.findViewById(R.id.text_view2);
        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t2.setTypeface(font2);
        Button startBtn = (Button) rootview.findViewById(R.id.btn1);
        Button startBtn1 = (Button) rootview.findViewById(R.id.btn2);
        Button startBtn2 = (Button) rootview.findViewById(R.id.button2);
        Button startBtn3 = (Button) rootview.findViewById(R.id.button3);
        Button startBtn4 = (Button) rootview.findViewById(R.id.button4);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall();
            }
        });

        startBtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall1();
            }
        });
        startBtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall2();
            }
        });
        startBtn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall3();
            }
        });
        startBtn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                makeCall4();
            }
        });


return rootview;

    }
    protected void makeCall() {
        String phone = "+918220399099";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }

    protected void makeCall1() {
        String phone = "+919789433092";
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
        startActivity(intent);
    }
    protected void makeCall2() {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.co.in/maps/place/Sri+Ramakrishna+Institute+of+Technology/@10.941266,76.900703,17z/data=!3m1!4b1!4m2!3m1!1s0x3ba85c6b863707c7:0xeb1413e699ffb7bf"));
        startActivity(intent);
    }
    protected void makeCall3() {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/cynosure15"));
        startActivity(intent);
    }
    protected void makeCall4() {

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cynosure2k15.net/"));
        startActivity(intent);
    }
}