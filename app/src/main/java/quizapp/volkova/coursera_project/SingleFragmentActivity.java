package quizapp.volkova.coursera_project;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class SingleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_fragment);
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.s_fragment, getFragment())
                    .commit();
        }

    }
    protected abstract Fragment getFragment();

    @NonNull
    @Override
    public FragmentManager getSupportFragmentManager() {

        return super.getSupportFragmentManager();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_sec_page, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                showToast(R.string.settings);
            case R.id.search:
                showToast(R.string.search);
            case R.id.exit:
                showToast(R.string.exit);
        }
        return super.onOptionsItemSelected(item);
    }

    public void showToast(@StringRes int message) {
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();
    }

}
