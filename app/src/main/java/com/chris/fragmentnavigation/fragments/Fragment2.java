package com.chris.fragmentnavigation.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.chris.fragmentnavigation.R;

public class Fragment2 extends Fragment {

    Button one, two, three, four, five, six, seven, eight, nine, zero, plus;
    TextView textView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        plus = view.findViewById(R.id.button12);
//        one = view.findViewById(R.id.button);
        two = view.findViewById(R.id.button2);
        three = view.findViewById(R.id.button3);
        four = view.findViewById(R.id.button6);
        five = view.findViewById(R.id.button2);
        six = view.findViewById(R.id.button2);
        seven = view.findViewById(R.id.button2);
        eight = view.findViewById(R.id.button2);
        nine = view.findViewById(R.id.button2);


        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        one = getActivity().findViewById(R.id.button);
        textView = getActivity().findViewById(R.id.textView);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    textView.setText('1');
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.println("One has been clicked");
            }
        });
    }
}
