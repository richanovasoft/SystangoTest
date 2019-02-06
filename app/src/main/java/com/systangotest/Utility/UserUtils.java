package com.systangotest.Utility;


import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class UserUtils {

    public static UserUtils smUserUtils;

    public static final String FONT_OPEN_SANS_REGULAR = "MyriadPro_Regular.otf";
    public static final String FONT_OPEN_SANS_BOLD = "MyriadPro_Bold.otf";
    public static final String FONT_OPEN_SAMI_BOLD = "MyriadPro_Semibold.otf";
    public static final String FONT_OPEN_SAMI_BOLD_IT = "MyriadPro_SemiboldIt.otf";
    private Map<String, Typeface> mFontTypeList;


    public static UserUtils getInstance() {
        if (smUserUtils == null) {
            smUserUtils = new UserUtils();
        }
        return smUserUtils;
    }


    private void initFontList() {
        if (mFontTypeList == null) {
            mFontTypeList = new HashMap<>();
        }
    }

    public Typeface getTypeFaceForType(Context aContext, String aFontName) {
        initFontList();
        Typeface typeFace = Typeface.DEFAULT;
        if (aFontName != null) {
            Typeface selectedTypeFace = mFontTypeList.get(aFontName);
            if (selectedTypeFace == null) {
                AssetManager am = aContext.getAssets();
                Typeface curTypeFace = Typeface.createFromAsset(am,
                        String.format(Locale.US, "fonts/%s", aFontName));
                if (curTypeFace != null) {
                    mFontTypeList.put(aFontName, curTypeFace);
                    typeFace = curTypeFace;
                }
            } else {
                typeFace = selectedTypeFace;
            }
        }
        return typeFace;
    }

}



