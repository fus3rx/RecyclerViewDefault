package com.imaginers.onirban.recyclerviewdefault.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.imaginers.onirban.recyclerviewdefault.Adapter.Adapter;
import com.imaginers.onirban.recyclerviewdefault.Model.Friend;
import com.imaginers.onirban.recyclerviewdefault.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Friend> friendList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new Adapter(friendList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareFriends();
    }

    private void prepareFriends() {

        Friend friend;

        friend = new Friend("Rihan", "rihan@mail.com");
        friendList.add(friend);

        friend = new Friend("Sijan", "sijan@gmail.com");
        friendList.add(friend);

        friend = new Friend("sifat", "sifat@gmail.com");
        friendList.add(friend);

    }
}
