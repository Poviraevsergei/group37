package lesson8;

//    //Создай класс Config с static final полями APP_NAME, VERSION, MAX_USERS.
//    // Заполните эти значения в статическом блоке через VM options.
//    // Используй эти значения в методе main() другого класса — имитируй доступ к конфигу приложения.
public class Config {
    public static final String APP_NAME;
    public static final String VERSION;
    public static final int MAX_USERS;

    static {
        APP_NAME = System.getProperty("app_name");
        VERSION = System.getProperty("app_version");
        MAX_USERS = Integer.parseInt(System.getProperty("max_users"));
    }

}
