import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class DatabaseHelper {

    private static  DatabaseHelper mDatabaseHelper;

    private DatabaseHelper() {
        if (mDatabaseHelper != null)
            throw new RuntimeException("Use only get Instance to instantiate");
    }

    public static DatabaseHelper getInstance() {
        if (mDatabaseHelper == null) {
            synchronized (DatabaseHelper.class) {
                if (mDatabaseHelper == null)
                    mDatabaseHelper = new DatabaseHelper();
            }
        }
        return mDatabaseHelper;
    }

}

public class AccessDatabase {

    public static void main(String[] args) {
        DatabaseHelper databaseHelper1 = DatabaseHelper.getInstance();
        DatabaseHelper databaseHelper2 = null;

        try {
            Constructor<DatabaseHelper> constructor = DatabaseHelper.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            databaseHelper2 = constructor.newInstance();

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.println(databaseHelper1.hashCode());
        System.out.println(databaseHelper2.hashCode());
    }
}
