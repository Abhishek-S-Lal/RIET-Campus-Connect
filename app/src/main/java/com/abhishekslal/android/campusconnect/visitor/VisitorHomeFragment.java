package com.abhishekslal.android.campusconnect.visitor;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.abhishekslal.android.campusconnect.R;

public class VisitorHomeFragment extends Fragment {

    private Button Vabtbtn, Vcoursebtn, Vnavigbtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_visitor_home, null);

        Vabtbtn = (Button) view.findViewById(R.id.abtbtn);
        Vabtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VisitorHomeFragment.this.getActivity(), AboutCampus.class);

                startActivity(intent);
            }
        });

        Vcoursebtn = (Button) view.findViewById(R.id.coursebtn);
        Vcoursebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VisitorHomeFragment.this.getActivity(), CoursesOffered.class);

                startActivity(intent);
            }
        });

        Vnavigbtn = (Button) view.findViewById(R.id.navigbtn);
        Vnavigbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VisitorHomeFragment.this.getActivity(), CampusNavigation.class);

                startActivity(intent);
            }
        });
        return view;
    }


}



