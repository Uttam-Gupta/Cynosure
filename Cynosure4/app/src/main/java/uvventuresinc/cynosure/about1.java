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


public class about1 extends Fragment  {

    View rootview;
    Button btn_service;

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.about1, container, false);

        t1=(TextView) rootview.findViewById(R.id.text_view1);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(),"allstar.ttf");
        t1.setTypeface(font1);
        t2=(TextView) rootview.findViewById(R.id.text_view2);
        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(),"allstar.ttf");
        t2.setTypeface(font2);
        t3=(TextView) rootview.findViewById(R.id.text_view3);
        Typeface font3 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t3.setTypeface(font3);
        t4=(TextView) rootview.findViewById(R.id.text_view4);
        Typeface font4 = Typeface.createFromAsset(getActivity().getAssets(),"allstar.ttf");
        t4.setTypeface(font4);
        t5=(TextView) rootview.findViewById(R.id.text_view5);
        Typeface font5 = Typeface.createFromAsset(getActivity().getAssets(),"Takara.ttf");
        t5.setTypeface(font5);


        btn_service = (Button) rootview.findViewById(R.id.button);
        btn_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Please wait....", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.srit.org/"));
                startActivity(intent);

            }
        });


        return rootview;
    }


}
