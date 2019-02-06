package com.systangotest.Utility;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.systangotest.Bean.ProductBean;

import io.realm.Realm;
import io.realm.RealmResults;


public class RealmController {

    private static RealmController instance;
    private final Realm realm;

    public RealmController(Application application) {
        realm = Realm.getDefaultInstance();
    }

    public static RealmController with(Fragment fragment) {

        if (instance == null) {
            instance = new RealmController(fragment.getActivity().getApplication());
        }
        return instance;
    }

    public static RealmController with(Activity activity) {

        if (instance == null) {
            instance = new RealmController(activity.getApplication());
        }
        return instance;
    }

    public static RealmController with(Application application) {

        if (instance == null) {
            instance = new RealmController(application);
        }
        return instance;
    }

    public static RealmController getInstance() {

        return instance;
    }

    public Realm getRealm() {

        return realm;
    }

    //Refresh the realm istance
    public void refresh() {

        realm.refresh();
    }

    //clear all objects from Book.class
    public void clearAll() {

        realm.beginTransaction();
        realm.clear(ProductBean.class);
        realm.commitTransaction();
    }

    //find all objects in the Book.class
    public RealmResults<ProductBean> getBooks() {

        return realm.where(ProductBean.class).findAll();
    }

    //query a single item with the given id
    public ProductBean getBook(String id) {

        return realm.where(ProductBean.class).equalTo("id", id).findFirst();
    }

    //check if Book.class is empty
    public boolean hasBooks() {

        return !realm.allObjects(ProductBean.class).isEmpty();
    }

    //query example
    public RealmResults<ProductBean> queryedBooks() {

        return realm.where(ProductBean.class)
                .contains("author", "Author 0")
                .or()
                .contains("title", "Realm")
                .findAll();
    }
}
