package com.example.giwantha.mobiDine.activity;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.example.giwantha.mobiDine.interfaces.AddorRemoveCallbacks;
import com.example.giwantha.mobiDine.model.Cart;
import com.example.giwantha.mobiDine.model.Order;
import com.example.giwantha.mobiDine.util.localstorage.LocalStorage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;



public class BaseActivity extends AppCompatActivity implements AddorRemoveCallbacks {
    public static final String TAG = "BaseActivity";

    List<Cart> cartList = new ArrayList<Cart>();
    List<Order> orderList = new ArrayList<Order>();
    Gson gson;
    LocalStorage localStorage;
    String userJson;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        localStorage = new LocalStorage(getApplicationContext());
        gson = new Gson();
        userJson = localStorage.getUserLogin();
        progressDialog = new ProgressDialog(BaseActivity.this);
        //user = gson.fromJson(userJson, UserResult.class);
        //  NetworkCheck.isNetworkAvailable(getApplicationContext());
        cartCount();

    }

    public int cartCount() {

        gson = new Gson();
        if (localStorage.getCart() != null) {
            String jsonCart = localStorage.getCart();
            Log.d("CART : ", jsonCart);
            Type type = new TypeToken<List<Cart>>() {
            }.getType();
            cartList = gson.fromJson(jsonCart, type);


            //Toast.makeText(getContext(),remedyList.size()+"",Toast.LENGTH_LONG).show();
            return cartList.size();
        }
        return 0;
    }

    public List<Cart> getCartList() {
        if (localStorage.getCart() != null) {
            String jsonCart = localStorage.getCart();
            //Log.d("CART : ", jsonCart);
            Type type = new TypeToken<List<Cart>>() {
            }.getType();
            cartList = gson.fromJson(jsonCart, type);
            return cartList;
        }
        return cartList;
    }

    public List<Order> getOrderList() {
        if (localStorage.getOrder() != null) {

            Type type = new TypeToken<List<Order>>() {
            }.getType();

            return orderList;
        }
        return orderList;
    }

    public Double getTotalPrice() {
        cartList = getCartList();
        Double total = 0.0;
        if (cartCount() > 0) {
            for (int i = 0; i < cartList.size(); i++) {
                total = total + Double.valueOf(cartList.get(i).getSubTotal());
                Log.d(TAG, "Total :" + total + "");
            }
            Log.d(TAG, "Total :" + total + "");
            return total;
        }
        return total;
    }


    @Override
    public void onAddProduct() {

    }

    @Override
    public void onRemoveProduct() {

    }

    @Override
    public void updateTotalPrice() {

    }




    public ProgressDialog showProgressDialog(String message) {

        progressDialog.setMessage(message);
        progressDialog.show();
        return progressDialog;
    }
}
