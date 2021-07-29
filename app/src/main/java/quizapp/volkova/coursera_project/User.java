package quizapp.volkova.coursera_project;

import java.io.Serializable;

public class User implements Serializable {
    private String mLogin;


    public User(String mLogin, String mPassword) {
        this.mLogin = mLogin;
    }

    public String getmLogin() {
        return mLogin;
    }

    public void setmLogin(String mLogin) {
        this.mLogin = mLogin;
    }
}
