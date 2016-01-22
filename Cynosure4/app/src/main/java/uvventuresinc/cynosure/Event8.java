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
import android.widget.Toast;


public class Event8 extends Fragment  {

    View rootview;
    Button btn_service;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    TextView t9;
    TextView t10;
    TextView t11;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.event_8, container, false);

        t1=(TextView) rootview.findViewById(R.id.text_view2);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(),"allstar.ttf");
        t1.setTypeface(font1);
        t2=(TextView) rootview.findViewById(R.id.text_view3);
        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t2.setTypeface(font2);
        t3=(TextView) rootview.findViewById(R.id.text_view4);
        Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(),"allstar.ttf");
        t3.setTypeface(font3);
        t4=(TextView) rootview.findViewById(R.id.text_view5);
        Typeface font4 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t4.setTypeface(font4);
        t5=(TextView) rootview.findViewById(R.id.text_view6);
        Typeface font5 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t5.setTypeface(font5);
        t6=(TextView) rootview.findViewById(R.id.text_view7);
        Typeface font6 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t6.setTypeface(font6);
        t7=(TextView) rootview.findViewById(R.id.text_view8);
        Typeface font7 = Typeface.createFromAsset(getActivity().getAssets(),"allstar.ttf");
        t7.setTypeface(font7);
        t8=(TextView) rootview.findViewById(R.id.text_view9);
        Typeface font8 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t8.setTypeface(font8);
        t9=(TextView) rootview.findViewById(R.id.text_view10);
        Typeface font9 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t9.setTypeface(font9);
        t10=(TextView) rootview.findViewById(R.id.text_view11);
        Typeface font10 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t10.setTypeface(font10);
        t11=(TextView) rootview.findViewById(R.id.text_view12);
        Typeface font11 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t11.setTypeface(font11);



        btn_service = (Button) rootview.findViewById(R.id.button);
        btn_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 Toast.makeText(getActivity(), "Please wait....", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://goo.gl/forms/UM2SprL3OZ"));
                startActivity(intent);

            }
        });
        return rootview;
    }


}
