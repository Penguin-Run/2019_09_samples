package superp.techpark.ru.lesson7;

import android.content.Context;

import androidx.room.Room;
import superp.techpark.ru.lesson7.dao.CredentialsDB;

public class DBHelper {

    private static DBHelper sInstance;
    private Context mContext;
    private final CredentialsDB mDb;


    public DBHelper(Context context) {
        mContext = context;
        mDb = Room.databaseBuilder(context, CredentialsDB.class, "credentails.db")
                .allowMainThreadQueries()
                .build();
    }

    public CredentialsDB getCredentialsDb() {
        return mDb;
    }


    public static DBHelper getInstance(Context context) {
        if (sInstance == null) {
            sInstance = new DBHelper(context);
        }
        return sInstance;
    }
}
