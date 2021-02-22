package helpers;

import static java.lang.Boolean.parseBoolean;


public class EnvironmentHelper {

// PLATFORM CONFIG
    public final static String
//        platform = System.getProperty("platform", "web");
        platform = System.getProperty("platform", "android");
//        platform = System.getProperty("platform", "ios");

// BROWSERSTACK CONFIG
    public static final String
            bsLogin = System.getProperty("bs_login", "bsuser7502161082"),
            bsPassword = System.getProperty("bs_password", "w9zxfb1VuUxPEGNdDL43");

// ANDROID CONFIG
    public static final boolean isAndroid = platform.equals("android");
    public static final String
        androidDevice = System.getProperty("mobile_device", "Google Pixel 3"),
        androidVersion = System.getProperty("mobile_version", "10.0"),
        androidBrowserstackApp = System.getProperty("bs_app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

// IOS CONFIG
    public static final boolean isIos = platform.equals("ios");
    public static final String
        iosDevice = System.getProperty("mobile_device", "iPhone 12 Pro Max"),
        iosVersion = System.getProperty("mobile_version", "14"),
        iosBrowserstackApp = System.getProperty("bs_app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
}
