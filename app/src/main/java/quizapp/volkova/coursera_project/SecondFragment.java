package quizapp.volkova.coursera_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    public static String USER_KEY = "bundle_key";
    //public static String PASS_KEY = "PASS_KEY";

    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;

    private String whichBrowser;

    private View.OnClickListener mOnPhotoClickListener = v -> {

    };


    public void onRadioButtonClicked (View v) {
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId()) {

        }
    }

    public static SecondFragment newInstance() {
        Bundle args = new Bundle();
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(args);
        return fragment;
    }




    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.settings_fragment, container, false);
        rb1 = v.findViewById(R.id.radioButton1);
        rb2 = v.findViewById(R.id.radioButton2);
        rb3 = v.findViewById(R.id.radioButton3);


        Bundle bundle = getActivity().getIntent().getExtras();
        return v;
    }

}


