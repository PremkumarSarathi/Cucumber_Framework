package constant;

import java.io.File;

public class FilePathConstant {
    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String RESOURCE_DIR = USER_DIR + File.separator + "src" + File.separator + "test" + File.separator + "resources";
    public static final String LOGIN_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "LoginPageLocators.properties";
    public static final String PRODUCTPAGE_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "ProductPageLocators.properties";
    public static final String YOURCARTPAGE_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "YourCartPageLocators.properties";
    public static final String CHECKOUTINFORMATION_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "CheckOutInformationLocators.properties";
    public static final String CHECKOUTOVERVIEW_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "CheckOutOverviewLocators.properties";
    public static final String CHECKOUTCOMPLETE_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "CheckOutCompleteLocators.properties";
    public static final String LOGOUTPAGE_LOCATORS_PATH = RESOURCE_DIR + File.separator + "Locators" + File.separator + "LogoutPageLocators.properties";
}
