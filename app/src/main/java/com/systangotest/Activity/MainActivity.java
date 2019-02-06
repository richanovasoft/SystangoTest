package com.systangotest.Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.systangotest.R;
import com.systangotest.Utility.Constant;
import com.systangotest.Utility.UIUtils;

import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainActivity extends AppCompatActivity {

    private int BackCount = Constant.APPLICATION_BACK_COUNT;
    private LoginButton mFbLoginButton;
    private CallbackManager mFbCallbackManager;
    private String StrSocialLoginLastName;
    private String strSocialLoginEmail;
    private String strSocialLoginFirstName;
    private String strSocialLoginPhoneNo;
    private String strFbid;

    private LinearLayout ll_fb_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);


        mFbLoginButton = (LoginButton) findViewById(R.id.login_button);

        ll_fb_login = findViewById(R.id.ll_fb_login);

        ll_fb_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initFbLogin();
                mFbLoginButton.performClick();

            }
        });

        findHashKey();

    }

    private void initFbLogin() {

        mFbCallbackManager = CallbackManager.Factory.create();
        mFbLoginButton.setReadPermissions(Constant.FACEBOOK_PERMISSION_STR);
        mFbLoginButton.registerCallback(mFbCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                setFaceBookdata(loginResult);
            }

            @Override
            public void onCancel() {
                UIUtils.AlertMsgWithOk(MainActivity.this,
                        getResources().getString(R.string.LoginFBCancelTitle),
                        getResources().getString(R.string.LoginFBCancelMsg), R.mipmap.ic_launcher);
            }

            @Override
            public void onError(FacebookException exception) {
                UIUtils.AlertMsgWithOk(MainActivity.this,
                        getResources().getString(R.string.FailedTitle),
                        getResources().getString(R.string.LoginFBErrorMsg), R.mipmap.ic_launcher);
            }
        });
    }

    private void setFaceBookdata(LoginResult loginResult) {
        GraphRequest request = GraphRequest.newMeRequest(
                loginResult.getAccessToken(),
                new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(
                            JSONObject object, GraphResponse response) {

                        try {

                            if (response.getError() != null) {

                                System.out.println("@@@@response = " + response);

                            } else {
                                strSocialLoginEmail = object.optString(Constant.FB_FIELD_EMAIL);
                                strSocialLoginFirstName = object.optString(Constant.FB_FIELD_FIRST_NAME);
                                StrSocialLoginLastName = object.optString(Constant.FB_FIELD_LAST_NAME);
                                strSocialLoginPhoneNo = object.optString(Constant.FB_FIELD_PHONE);
                                strFbid = object.optString(Constant.FB_FIELD_ID);


                            }

                        } catch (Exception e) {

                            UIUtils.AlertMsgWithOk(MainActivity.this, getResources().getString(R.string.FailedTitle),
                                    getString(R.string.LoginFailedMsg), R.mipmap.ic_launcher);
                        }
                    }
                });

        Bundle parameters = new Bundle();
        parameters.putString("fields", Constant.FB_FIELDS_STR);
        request.setParameters(parameters);
        request.executeAsync();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mFbCallbackManager.onActivityResult(requestCode, resultCode, data);

    }


    @Override
    public void onBackPressed() {
        showExitAlertDialog();
    }

    //Used for Exit application.
    private void showExitAlertDialog() {
        if (BackCount == Constant.APPLICATION_BACK_EXIT_COUNT) {
            BackCount = Constant.APPLICATION_BACK_COUNT;
            finish();
        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.backCountMsg), Toast.LENGTH_SHORT).show();
            BackCount++;
        }
    }


    public void findHashKey() {

        try {
            @SuppressLint("PackageManagerGetSignatures")
            PackageInfo info = getPackageManager().getPackageInfo(
                    getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }
    }

}
