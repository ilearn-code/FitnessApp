package com.example.bmibuttomnav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//import java.io.*;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//import com.example.bmibuttomnav.R;

public class FirstFragment extends Fragment {

    public FirstFragment(){
        // require a empty public constructor
    }

        // or  (ImageView) view.findViewById(R.id.foo);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);

        }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button button = (Button) getView().findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(),st.class));
            }
        });
        }
   }







