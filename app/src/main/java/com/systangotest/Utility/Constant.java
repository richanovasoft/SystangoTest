package com.systangotest.Utility;


public class Constant {

    public static final int SPLASH_TIME_OUT = 3 * 1000;
    public static final int INVALID_ID = -1;

    public static final int PRODUCT_SOLD_BY = 1;
    public static final int PRODUCT_NEW = 1;
    public static final int PRODUCT_MIN_COUNTER = 1;
    public static final int MIN_PASSWORD_LENGTH = 3;


    public static final int APPLICATION_BACK_COUNT = 0;
    public static final int APPLICATION_BACK_EXIT_COUNT = 1;
    public static final int PRODUCT_SEARCH_BY_NAME = 1;
    public static final int PRODUCT_SEARCH_BY_CATEGORY = 2;
    public static final int PRODUCT_SEARCH_BY_DEAL = 3;
    public static final int PRODUCT_SEARCH_BY_TAG = 4;
    public static final int PRODUCT_SEARCH_BY_OPTION_DEAL = 5;

    public static final int DEFAULT_COUNTRY_ID = 1;
    public static final int REQUEST_CODE_RESOLVE_ERR = 9000;
    public static final int PROVIDER_FACEBOOK = 100;

    public static final int ACTIVITY_REQUEST_FOR_PRODUCT_DETAILS_ACTIVITY_FROM_PRODUCT_LIST = 1000;
    public static final int ACTIVITY_REQUEST_FOR_PRODUCT_LIST_ACTIVITY_FROM_SEARCH_ACTIVITY = 1001;
    public static final int ACTIVITY_REQUEST_FOR_PRODUCT_LIST_ACTIVITY_FROM_HOME_ACTIVITY = 1003;
    public static final int ACTIVITY_REQUEST_FOR_PRODUCT_DETAILS_FROM_HOME = 1007;
    public static final int ACTIVITY_REQUEST_FOR_PRODUCT_DETAILS_TO_SHOPPING_BAG = 1008;
    public static final int ACTIVITY_REQUEST_FOR_ADD_ADDRESS_FROM_PROFILE = 1009;
    public static final int ACTIVITY_REQUEST_FOR_PLACE_ORDER_FROM_SHOPPING_BAG = 1012;
    public static final int ACTIVITY_REQUEST_FOR_ADD_ADDRESS_ACTIVITY_FROM_PLACE_ORDER_FOR_GUEST = 1013;
    public static final int ACTIVITY_REQUEST_FOR_ADD_ADDRESS_ACTIVITY_FROM_PLACE_ORDER_FOR_LOGIN = 1014;

    public static final int ACTIVITY_REQUEST_FOR_LOGIN_ACTIVITY_FROM_PLACE_ORDER = 1015;
    public static final int ACTIVITY_REQUEST_FOR_REGISTER_ACTIVITY_FROM_LOGIN = 1017;
    public static final int ACTIVITY_REQUEST_FOR_LOGIN_BY_HOME = 2003;
    public static final int ACTIVITY_REQUEST_FOR_FILTER_ACTIVITY = 1018;
    public static final String PREF_USER_LOGGED_IN = "user_login";
    public static final String PREF_USER_ID = "user_id";
    public static final String PREF_TOKEN_ID = "token_id";
    public static final String PREF_USER_NAME = "user_name";
    public static final String PREF_USER_INFO = "user_info";
    public static final String PREF_USER_TIPS = "user_tips";
    public static final String PREF_USER_LIKES = "user_likes";
    public static final String PREF_USER_POST = "user_post";
    public static final String PREF_USER_PROFILE = "user_profile";

    public static final int CAMERA_CAPTURE_IMAGE_REQUEST_CODE = 1337;


    public static final int MY_PERMISSIONS_REQUEST_FOR_EXTERNAL_STORAGE = 2000;
    public static final int GALLERY_CAPTURE_IMAGE_REQUEST_CODE = 12452;



    public static final int ACTIVITY_REQUEST_FROM_FILTER_TO_PRODUCT_ACTIVITY = 1019;

    public static final int ACTIVITY_REQUEST_FOR_ORDER_SUCCESSFUL_TO_PLACEORDER = 1022;

    public static final int ACTIVITY_REQUEST_FOR_ORDER_SUCCESSFUL_FROM_PLACE_ORDER = 1004;


    public static final int LOGIN_ENTRY_POINT_BY_HOME_ACTIVITY = 1;
    public static final int LOGIN_ENTRY_POINT_BY_INTRO_ACTIVITY = 2;
    public static final int LOGIN_ENTRY_POINT_BY_SPLASH_ACTIVITY = 3;
    public static final int LOGIN_ENTRY_POINT_BY_PLACE_ORDER_ACTIVITY = 4;

    public static final int MIN_USER_NAME_LENGTH = 3;
    public static final int MOBILE_NO_LENGTH = 10;
    public static final int PASSWORD_MIN_LENGTH = 3;

    public static final int LOGIN_TYPE_EMAIL = 0;
    public static final int LOGIN_TYPE_FB = 1;
    public static final int LOGIN_TYPE_GP = 2;


    public static final int MAX_RECENT_SEARCH_COUNT = 5;
    public static final int PERMISSION_REQUEST_FOR_SPLASH = 3000;
    public static final int GP_SIGN_IN = 9001;
    public static final int ACTIVITY_REQUEST_FOR_CHECK_OUT = 101;
    public static final int LOCATION_SEARCH_MIN_CHAR = 2;


    public static final int MAX_PRODUCT_IMAGE_DISPLAY = 5;
    public static final int FILTER_SCREEN_TYPE_VALUE = 6;
    public static final int FILTER_SIZE_TYPE_VALUE = 10;

    public static final int FILTER_PRICE_TYPE_VALUE = 100;

    public static final int SORTING_DEFAULT_INDEX = 1;
    public static final int SORTING_NAME_A_TO_Z = 2;
    public static final int SORTING_NAME_Z_TO_A = 3;
    public static final int SORTING_PRICE_LOW_TO_HIGH = 4;
    public static final int SORTING_PRICE_HIGH_TO_LOW = 5;
    public static final int SORTING_MODEL_A_TO_Z = 6;
    public static final int SORTING_MODEL_Z_TO_A = 7;
    public static final int SORTING_RATING_HIGHEST = 8;
    public static final int SORTING_RATING_LOWEST = 9;

    public static final int JSON_SORTING_DEFAULT_INDEX = 7;
    public static final int JSON_SORTING_NAME_A_TO_Z = 1;
    public static final int JSON_SORTING_NAME_Z_TO_A = 2;
    public static final int JSON_SORTING_PRICE_LOW_TO_HIGH = 3;
    public static final int JSON_SORTING_HIGH_TO_LOW = 4;
    public static final int JSON_SORTING_MODEL_A_TO_Z = 5;
    public static final int JSON_SORTING_MODEL_Z_TO_A = 6;
    public static final int JSON_SORTING_RATING_HIGHEST = 7;
    public static final int JSON_SORTING_RATING_LOWEST = 8;

    public static final int MAX_RETRY_COUNT = 3;
    public static final int API_TIME_OUT = 10000;



    public static final String LOGIN_USERNAME_KEY = "email";



    //---------------API DESIGN-----------------------------
    public static final String API_BASE_URL_DEV = "https://www.w3wiser.com";
    public static final String API_BASE_URL = API_BASE_URL_DEV;

    public static final String API_DOMAIN = "/praveen_hp/api";

    public static final String API_REGISTER_METHOD = "/signup";
    public static final String API_SIGNUP_METHOD = API_BASE_URL + API_DOMAIN + API_REGISTER_METHOD;


    public static final String API_LOGIN_METHOD = "/login";
    public static final String API_LOGIN = API_BASE_URL + API_DOMAIN + API_LOGIN_METHOD;


    public static final String SOCIAL_LOGIN = "/social_login";
    public static final String SOCIAL_API_LOGIN = API_BASE_URL + API_DOMAIN + SOCIAL_LOGIN;

    public static final String UPDATE_PROFILE = "/update_profile";
    public static final String API_UPDATE_PROFILE = API_BASE_URL + API_DOMAIN + UPDATE_PROFILE;


    public static final String API_HOME_METHOD = "/auras_list";
    public static final String API_HOME_LIST = API_BASE_URL + API_DOMAIN + API_HOME_METHOD;


    public static final String MY_AURAS = "/myauras";
    public static final String API_MY_AURAS = API_BASE_URL + API_DOMAIN + MY_AURAS;


    public static final String CATEGORY_API = "/stickers";
    public static final String API_CATEGORY_LIST = API_BASE_URL + API_DOMAIN + CATEGORY_API;

    public static final String SEARCH_API = "/search";
    public static final String API_SEARCH_LIST = API_BASE_URL + API_DOMAIN + SEARCH_API;

    public static final String CATEGORY_PRODUCT_LIST = "/categoryProductInfo";
    public static final String CATEGORY_PRODUCT_API = API_BASE_URL + API_DOMAIN + CATEGORY_PRODUCT_LIST;

    public static final String ABOUT_US = "/aboutUs";
    public static final String API_ABOUT_US = API_BASE_URL + API_DOMAIN + ABOUT_US;

    public static final String PRODUCT = "/productList";
    public static final String PRODUCT_API = API_BASE_URL + API_DOMAIN + PRODUCT;
    public static final String JSON_PRODUCT_LIST = "product_info";

    public static final String CHANNEL_LIST = "/channel_list";
    public static final String API_CHANNEL_LIST = API_BASE_URL + API_DOMAIN + CHANNEL_LIST;


    public static final String FOLLOWING = "/following";
    public static final String API_FOLLOWING = API_BASE_URL + API_DOMAIN + FOLLOWING;


    public static final String LIKES = "/likes";
    public static final String API_LIKES = API_BASE_URL + API_DOMAIN + LIKES;


    public static final String FORGET_PASSWORD = "/forgot_password";
    public static final String API_FORGOT_PASSWORD = API_BASE_URL + API_DOMAIN + FORGET_PASSWORD;



    public static final String FORGET_USERNAME = "/forgot_username";
    public static final String API_FORGET_USERNAME = API_BASE_URL + API_DOMAIN + FORGET_USERNAME;


    public static final String CREATE_CHANNEL = "/create_channel";
    public static final String API_CREATE_CHANNEL = API_BASE_URL + API_DOMAIN + CREATE_CHANNEL;


    public static final String FOLLOWER_LIST = "/follower_list";
    public static final String API_FOLLOWER_LIST = API_BASE_URL + API_DOMAIN + FOLLOWER_LIST;


    public static final String CHANNEL_INFO = "/channel_info";
    public static final String API_CHANNEL_INFO = API_BASE_URL + API_DOMAIN + CHANNEL_INFO;


    public static final String ORDER_GENERATE = "/user_info";
    public static final String API_USER_INFO = API_BASE_URL + API_DOMAIN + ORDER_GENERATE;


    //=====================================API KEYS=================================
    //Register API keys
    public static final String REGISTER_NAME_KEY = "name";
    public static final String REGISTER_EMAIL_KEY = "email";
    public static final String REGISTER_PASSWORD_KEY = "password";
    public static final String REGISTER_PHONE_KEY = " phone_no";
    public static final String REGISTER_USER_NAME = " username";
    public static final String REGISTER_REFERENCE_KEY = "reference_id";
    public static final String REGISTER_DEVICE_ID_KEY = "device_id";


    //Login
    public static final String LOGIN_EMAIL_KEY = "email";
    public static final String LOGIN_PASSWORD_KEY = "password";

    public static final String LOGIN_TYPE_KEY = "type";

    public static final String LOGIN_FB_ID_KEY = "fb_id";

    public static final String IMEI_KEY = "imei";


    public static final String UPDATED_SOCIAL_LOGIN_FIRST_NAME_KEY = "fname";
    public static final String UPDATED_SOCIAL_LOGIN_LAST_NAME_KEY = "lname";
    public static final String UPDATED_SOCIAL_LOGIN_USER_ID = "user_id";
    public static final String UPDATED_SOCIAL_LOGIN_EMAIL = "email";
    public static final String UPDATED_SOCIAL_LOGIN_PHONE_NO = "phone_no";

    public static final String UPDATED_SOCIAL_LOGIN_DEVICE_ID = "device_id";
    public static final String UPDATED_SOCIAL_LOGIN_REFERENCE_KEY = "reference_id";

    public static final String LOGIN_GP_ID_KEY = "email";
    public static final String LOGIN_GP_NAME_KEY = "name";

    public static final String FORGOT_ID_EMAIL_KEY = "email";

    public static final String CONTACT_EMAIL_ID_KEY = "email";
    public static final String CONTACT_NAME_KEY = "name";
    public static final String CONTACT_ENQUIRY_KEY = "enquiry";

    //

    public static final String PROFILE_USER_ID = "USER_ID";
    public static final String PROFILE_DISPLAY_NAME = "PROFILE_DISPLAY_NAME";
    public static final String PROFILE_USER_EMAIL = "USER_PROFILE_EMAIL";
    public static final String PROFILE_IMAGE_URL = "PROFILE_IMAGE_URL";


    //FaceBook
    public static final String FB_PERMISSION_PROFILE = "public_profile";
    public static final String FB_PERMISSION_EMAIL = "email";
    public static final String FB_PERMISSION_BIRTHDAY = "user_birthday";
    public static final String FB_PERMISSION_LOCATION = "user_location";

    public static final String FACEBOOK_PERMISSION_STR = FB_PERMISSION_PROFILE + "," +
            FB_PERMISSION_EMAIL + "," +
            FB_PERMISSION_BIRTHDAY + "," +
            FB_PERMISSION_LOCATION;

    public static final String FB_FIELD_ID = "id";
    public static final String FB_FIELD_NAME = "name";
    public static final String FB_FIELD_FIRST_NAME = "first_name";
    public static final String FB_FIELD_LAST_NAME = "last_name";
    public static final String FB_FIELD_EMAIL = "email";
    public static final String FB_FIELD_GENDER = "gender";
    public static final String FB_FIELD_BIRTHDAY = "birthday";
    public static final String FB_FIELD_LOCATION = "location";
    public static final String FB_FIELD_COVER = "cover";
    public static final String FB_FIELD_PICTURE_TYPE = "picture.type(large)";
    public static final String FB_FIELD_PHONE = "phone";

    public static final String FB_FIELDS_STR = FB_FIELD_ID + "," +
            FB_FIELD_NAME + "," +
            FB_FIELD_FIRST_NAME + "," +
            FB_FIELD_LAST_NAME + "," +
            FB_FIELD_EMAIL + "," +
            FB_FIELD_GENDER + "," +
            FB_FIELD_BIRTHDAY + "," +
            FB_FIELD_LOCATION + "," +
            FB_FIELD_COVER + "," +
            FB_FIELD_PICTURE_TYPE;


    public static final String PROFILE_ID_KEY = "id";
    public static final String PLACE_ORDER_API_LOGIN_TYPE = "user_type";

    public static final String PLACE_ORDER_API_ADDRESS_USER_ID_KEY = "user_id";
    public static final String PLACE_ORDER_API_ADDRESS_FIRST_NAME_KEY = "firstname";
    public static final String PLACE_ORDER_API_ADDRESS_LAST_NAME_KEY = "lastname";
    public static final String PLACE_ORDER_API_ADDRESS_EMAIL_KEY = "";
    public static final String PLACE_ORDER_API_ADDRESS_PHONE_NO_KEY = "";
    public static final String PLACE_ORDER_API_ADDRESS_COMPANY_KEY = "company";
    public static final String PLACE_ORDER_API_ADDRESS_ADDRESS_ONE_KEY = "address1";
    public static final String PLACE_ORDER_API_ADDRESS_ADDRESS_TWO_KEY = "address2";
    public static final String PLACE_ORDER_API_ADDRESS_CITY_KEY = "city";
    public static final String PLACE_ORDER_API_ADDRESS_POST_CODE_KEY = "post_code";
    public static final String PLACE_ORDER_API_ADDRESS_STATE_ID_KEY = "state_id";
    public static final String PLACE_ORDER_API_ADDRESS_COUNTRY_ID_KEY = "country_id";
    public static final String PLACE_USER_LOGIN_TYPE_LOGGEDIN = "1";
    public static final String PLACE_ORDER_USER_BALANCE_KEY = "balance";
    public static final String PLACE_USER_LOGIN_TYPE_GUEST = "2";
    public static final String PLACE_ORDER_API_ADDRESS_PRODUCT_ID_KEY = "products";


    //=======INTENT VALUES
    public static final String INTENT_IMAGE_SELECTED_INDEX_KEY = "image_selected_index";
    public static final String INTENT_IMAGE_LIST_INDEX_KEY = "image_list";
    public static final String INTENT_PRODUCT_ITEM_KEY = "product_bean_home";
    public static final String INTENT_PRODUCT_SEARCH_TYPE_KEY = "product_search_type";
    public static final String INTENT_PRODUCT_LIST_CATEGORY_NAME_TYPE_KEY = "product_cat_name";
    public static final String INTENT_PRODUCT_LIST_CATEGORY_ID_TYPE_KEY = "product_cat_id";
    public static final String INTENT_PRODUCT_LIST_SEARCH_KEYWORD_KEY = "product_search_keyword";
    public static final String INTENT_ENTRY_POINT_FOR_LOGIN_SCREEN = "login_screen_type_key";
    public static final String INTENT_ADDRESS_EDIT_MODE_KEY = "address_edit_mode";
    public static final String INTENT_ADDRESS_BEAN_KEY = "address_bean";
    public static final String INTENT_ORDER_GENERATED_SUCCESSFULLY = "order_generated";

    public static final String INTENT_ORDER_SUCCESSFUL_ID = "order_id";
    public static final String INTENT_SUCCESSFUL_MSG = "success";

    public static final int FILTER_USER_SELECTED_MAXIMUM = 101;
    public static final int FILTER_USER_SELECTED_MINIMUM = 100;
    public static final String INTENT_FILTER_DATA_KEY = "filter";
    public static final String INTENT_FILTER_DATA_CHANGED_KEY = "filter_changed";


    public static final String TEXT_SEARCH = "TEXT";
    public static final String CATEGORY_PRODUCT_ID_KEY = "id";
    public static final String CATEGORY_PAGE_INDEX_KEY = "page_no";
    public static final String CATEGORY_ORDER_BY = "order_by";
    public static final String SEARCH_LIST_NAME_KEY = "name";

    public static final String CATEGORY_PRICE_MAXIMUM = "max";
    public static final String CATEGORY_PRICE_MINIMUM = "min";
    public static final String CATEGORY_FILTER_PARENT_ID_KEY = "option_parent_id";
    public static final String CATEGORY_FILTER_VALUE_ID_KEY = "option_id";


    public static final String FILTER_COLOR_TYPE_VALUE = "color";
    public static final String FILTER_BRAND_TYPE_VALUE = "brand";


    //======================Shared Preference ======================
    public static final String PREF_HOME_ITEM_LIST = "user_itemlist";
    public static final String PREF_FIRST_LAUNCH = "skipIntro";
    public static final String PREF_SKIP_USER_ACCESS = "skipAccess";

    public static final String PREF_USER_EMAIL = "user_email";
    public static final String PREF_USER_PHONE_NO = "user_phone";
    public static final String PREF_USER_ADDRESS_STR = "user_address";
    public static final String PREF_USER_LOGIN_TYPE = "login_type";
    public static final String PREF_USER_SEARCH_ITEMS = "user_search_item";
    public static final String PREF_USER_FIRST_NAME = "user_firstname";
    public static final String PREF_USER_LAST_NAME = "user_lastname";
    public static final String PREF_USER_BALANCE_KEY = "user_balance";
    public static final String PREF_USER_REFERENCE_KEY = "user_reference";



}
