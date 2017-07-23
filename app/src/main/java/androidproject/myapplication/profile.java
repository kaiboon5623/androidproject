package androidproject.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class profile extends Fragment {

    public profile() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnNayeon = (Button) view.findViewById(R.id.BtnNayeon);
        BtnNayeon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), nayeon.class);
                startActivity(in);
            }
        });

        View view2 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnJeongyeon = (Button) view.findViewById(R.id.BtnJeongyeon);
        BtnJeongyeon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), jeongyeon.class);
                startActivity(in);
            }
        });

        View view3 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnMomo = (Button) view.findViewById(R.id.BtnMomo);
        BtnMomo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), momo.class);
                startActivity(in);
            }
        });

        View view4 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnSana = (Button) view.findViewById(R.id.BtnSana);
        BtnSana.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), sana.class);
                startActivity(in);
            }
        });

        View view5 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnJihyo = (Button) view.findViewById(R.id.BtnJihyo);
        BtnJihyo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), jihyo.class);
                startActivity(in);
            }
        });

        View view6 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnMina = (Button) view.findViewById(R.id.BtnMina);
        BtnMina.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), mina.class);
                startActivity(in);
            }
        });

        View view7 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnDahyun = (Button) view.findViewById(R.id.BtnDahyun);
        BtnDahyun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), dahyun.class);
                startActivity(in);
            }
        });

        View view8 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnChaeyeong = (Button) view.findViewById(R.id.BtnChaeyeong);
        BtnChaeyeong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), chaeyeong.class);
                startActivity(in);
            }
        });

        View view9 = inflater.inflate(R.layout.fragment_profile, container, false);
        Button BtnTzuyu = (Button) view.findViewById(R.id.BtnTzuyu);
        BtnTzuyu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent in = new Intent(getActivity(), tzuyu.class);
                startActivity(in);
            }
        });

        return view;
    }




}
