package myapp.ru.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<RecyclerViewItem> recyclerViewItems;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.marghuerita, Utils.PIZZA_1_TITLE, Utils.PIZZA_1_DESCRIPTION, Utils.PIZZA_1_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.margherita, Utils.PIZZA_2_TITLE, Utils.PIZZA_2_DESCRIPTION, Utils.PIZZA_2_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.caramelised, Utils.PIZZA_3_TITLE, Utils.PIZZA_3_DESCRIPTION, Utils.PIZZA_3_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.superhealthy, Utils.PIZZA_4_TITLE, Utils.PIZZA_4_DESCRIPTION, Utils.PIZZA_4_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.fryingpan, Utils.PIZZA_5_TITLE, Utils.PIZZA_5_DESCRIPTION, Utils.PIZZA_5_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.egg, Utils.PIZZA_6_TITLE, Utils.PIZZA_6_DESCRIPTION, Utils.PIZZA_6_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.chickentikka, Utils.PIZZA_7_TITLE, Utils.PIZZA_7_DESCRIPTION, Utils.PIZZA_7_RECIPE));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ultimate, Utils.PIZZA_8_TITLE, Utils.PIZZA_8_DESCRIPTION, Utils.PIZZA_8_RECIPE));
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems, this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
