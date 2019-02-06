package com.systangotest.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.systangotest.Adapters.ProductAdapter;
import com.systangotest.Bean.ProductBean;
import com.systangotest.Client.ApiUtil;
import com.systangotest.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductActivity extends AppCompatActivity {


    private final String TAG = MainActivity.class.getSimpleName();

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        recyclerView = (RecyclerView) findViewById(R.id.rv_product_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        ApiUtil.getServiceClass().getAllPost().enqueue(new Callback<List<ProductBean>>() {
            @Override
            public void onResponse(Call<List<ProductBean>> call, Response<List<ProductBean>> response) {
                if (response.isSuccessful()) {
                    List<ProductBean> postList = response.body();
                    Log.d(TAG, "Returned count " + postList.size());
                    ProductAdapter adapter = new ProductAdapter(getApplicationContext(), postList);
                    recyclerView.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<List<ProductBean>> call, Throwable t) {
                //showErrorMessage();
                Log.d(TAG, "error loading from API");
            }
        });
    }

}

