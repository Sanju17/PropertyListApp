package com.csangharsha.propertylist.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.csangharsha.propertylist.R;
import com.csangharsha.propertylist.application.PropertyListApplication;
import com.csangharsha.propertylist.model.PropertyListService;
import com.csangharsha.propertylist.model.dto.Property;
import com.csangharsha.propertylist.view.adapter.PropertyListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    Call<List<Property>> propertyListServiceCall;

    private List<Property> propertyList;

    private PropertyListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        propertyList = new ArrayList<>();
        setAdapter();

        callPropertyListService();

    }

    private void callPropertyListService() {

        PropertyListService propertyListService = PropertyListApplication.get(this).getPropertyListService();
        propertyListServiceCall = propertyListService.getProperties();

        propertyList = new ArrayList<>();
        adapter.notifyDataSetChanged(propertyList);

        progressBar.setVisibility(View.VISIBLE);

        propertyListServiceCall.enqueue(new Callback<List<Property>>() {

            @Override
            public void onResponse(Call<List<Property>> call, Response<List<Property>> response) {
                progressBar.setVisibility(View.GONE);
                propertyList = response.body();
                adapter.notifyDataSetChanged(propertyList);
            }

            @Override
            public void onFailure(Call<List<Property>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error while retrieving data!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setAdapter() {

        adapter = new PropertyListAdapter(this, propertyList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_refresh:
                callPropertyListService();
                break;
            default:
                break;
        }

        return true;
    }

}