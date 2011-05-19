package net.centerleft.localshops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Config {

    // Shop Size settings
    public static long SHOP_SIZE_DEF_WIDTH = 5;
    public static long SHOP_SIZE_DEF_HEIGHT = 3;
    public static long SHOP_SIZE_MAX_WIDTH = 30;
    public static long SHOP_SIZE_MAX_HEIGHT = 10;
    
    // Shop Charge settings
    public static double SHOP_CHARGE_CREATE_COST = 100;
    public static double SHOP_CHARGE_MOVE_COST = 10;
    public static boolean SHOP_CHARGE_CREATE = true;
    public static boolean SHOP_CHARGE_MOVE = true;
    public static boolean SHOP_NOTIFICATION = true;
    public static int SHOP_NOTIFICATION_TIMER = 300;
    
    // Search Settings
    public static int SEARCH_MAX_DISTANCE = 150;
    
    // Server Settings
    public static boolean SRV_LOG_TRANSACTIONS = true;
    public static boolean SRV_DEBUG = false;
    public static UUID SRV_UUID = null;
    public static boolean SRV_REPORT = true;
    
    // Player Settings
    public static int PLAYER_MAX_SHOPS = -1;        // Anything < 0 = unlimited player shops.
    
    // Item Settings
    public static int ITEM_MAX_DAMAGE = 35;
    
    // UUID settings
    public static int UUID_MIN_LENGTH = 1;
    protected static List<String> UUID_LIST = Collections.synchronizedList(new ArrayList<String>());
}
