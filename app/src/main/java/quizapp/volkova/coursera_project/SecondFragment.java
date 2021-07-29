package quizapp.volkova.coursera_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import java.util.zip.Inflater;

public class SecondFragment extends Fragment {

    public static String USER_KEY = "bundle_key";
    //public static String PASS_KEY = "PASS_KEY";

    private AppCompatImageView mPhoto;
    private TextView mLogin;
    private TextView mPassword;

    private View.OnClickListener mOnPhotoClickListener = v -> {

    };

    public static SecondFragment newInstance() {
        Bundle args = new Bundle();
        SecondFragment fragment = new SecondFragment();
        fragment.setArguments(args);
        return fragment;
    }




    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable  ViewGroup container, @Nullable  Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.ac_profile, container, false);
        mLogin = v.findViewById(R.id.text_view_page2);

        Bundle bundle = getActivity().getIntent().getExtras();
        mLogin.setText(bundle.getString(SecondFragment.USER_KEY));
        return v;
    }

}


