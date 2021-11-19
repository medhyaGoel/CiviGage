package com.example.helloworlddemo.ui.main;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.helloworlddemo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VotingRulesFrag1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VotingRulesFrag1 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VotingRulesFrag1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VotingRules.
     */
    // TODO: Rename and change types and number of parameters

    public static VotingRulesFrag1 newInstance(String param1, String param2) {
        VotingRulesFrag1 fragment = new VotingRulesFrag1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1_rules, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);





        //voter registration status button
        Button eligibility = view.findViewById(R.id.check_eligibility);
        eligibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.vote.org/am-i-registered-to-vote/"));
                startActivity(viewIntent);
            }
        });

        //voter registration button
        Button register = view.findViewById(R.id.register_to_vote);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://vote.gov/"));
                startActivity(viewIntent);
            }
        });

        //deadlines button
        Button deadlines = view.findViewById(R.id.find_my_deadlines);
        deadlines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.rockthevote.org/how-to-vote/election-dates-and-deadlines/"));
                startActivity(viewIntent);
            }
        });


    }
}