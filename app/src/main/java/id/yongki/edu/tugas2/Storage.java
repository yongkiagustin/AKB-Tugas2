package id.yongki.edu.tugas2;

import android.content.SharedPreferences;

public class Storage {

    private SharedPreferences bloodSharer;

    private static final String USERNAME = "USERNAME",
            BLOODTYPE = "BLOODTYPE",
            AGREE = "AGREE";

    static final String STORAGE_NAME = "MY_STORAGE";

    Storage(SharedPreferences sharedPreferences) {
        bloodSharer = sharedPreferences;
    }

    void storeData(String username, String bloodType) {
        SharedPreferences.Editor myStorage = bloodSharer.edit();
        myStorage.putString(USERNAME, username);
        myStorage.putString(BLOODTYPE, bloodType);
//        myStorage.putBoolean(AGREE, agree);
        myStorage.apply();
    }

    String getUsername() {
        return bloodSharer.getString(USERNAME, "");
    }

    public String getBloodtype() {
        return bloodSharer.getString(BLOODTYPE, "");
    }

    public boolean getAgree() {
        return bloodSharer.getBoolean(AGREE, false);
    }

}
