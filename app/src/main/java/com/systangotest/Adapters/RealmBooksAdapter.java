package com.systangotest.Adapters;

import android.content.Context;

import com.systangotest.Bean.ProductBean;

import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<ProductBean> {

    public RealmBooksAdapter(Context context, RealmResults<ProductBean> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}