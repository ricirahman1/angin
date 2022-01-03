package com.example.cobalagi;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class BuahActivity extends AppCompatActivity {

    private RecyclerView courseRV;

    // Arraylist for storing data
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        courseRV = findViewById(R.id.idRVCourse);

        // here we have created new array list and added data to it.
        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("DSA in Java", 4, R.drawable.gfgimage));
        courseModelArrayList.add(new CourseModel("Java Course", 3, R.drawable.gfgimage));
        courseModelArrayList.add(new CourseModel("C++ COurse", 4, R.drawable.gfgimage));
        courseModelArrayList.add(new CourseModel("DSA in C++", 4, R.drawable.gfgimage));
        courseModelArrayList.add(new CourseModel("Kotlin for Android", 4, R.drawable.gfgimage));
        courseModelArrayList.add(new CourseModel("Java for Android", 4, R.drawable.gfgimage));
        courseModelArrayList.add(new CourseModel("HTML and CSS", 4, R.drawable.gfgimage));

        // we are initializing our adapter class and passing our arraylist to it.
        CourseAdapter courseAdapter = new CourseAdapter(this, courseModelArrayList);

        // below line is for setting a layout manager for our recycler view.
        // here we are creating vertical list so we will provide orientation as vertical
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        // in below two lines we are setting layoutmanager and adapter to our recycler view.
        courseRV.setLayoutManager(linearLayoutManager);
        courseRV.setAdapter(courseAdapter);
    }
}
