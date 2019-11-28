package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> FirstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FirstBook = new ArrayList<>();
        FirstBook.add(new Book("Becoming","Category","Description",R.drawable.becoming));
        FirstBook.add(new Book("Clinton","Category","Description",R.drawable.clinton));
        FirstBook.add(new Book("Dreams","Category","Description",R.drawable.dreams));
        FirstBook.add(new Book("Raila","Category","Description",R.drawable.flame));
        FirstBook.add(new Book("Luther","Category","Description",R.drawable.king));
        FirstBook.add(new Book("Becoming","Category","Description",R.drawable.becoming));
        FirstBook.add(new Book("Clinton","Category","Description",R.drawable.clinton));
        FirstBook.add(new Book("Dreams","Category","Description",R.drawable.dreams));
        FirstBook.add(new Book("Raila","Category","Description",R.drawable.flame));
        FirstBook.add(new Book("Luther","Category","Description",R.drawable.king));
        FirstBook.add(new Book("Becoming","Category","Description",R.drawable.becoming));
        FirstBook.add(new Book("Clinton","Category","Description",R.drawable.clinton));
        FirstBook.add(new Book("Dreams","Category","Description",R.drawable.dreams));
        FirstBook.add(new Book("Raila","Category","Description",R.drawable.flame));
        FirstBook.add(new Book("Luther","Category","Description",R.drawable.king));
        FirstBook.add(new Book("Becoming","Category","Description",R.drawable.becoming));
        FirstBook.add(new Book("Clinton","Category","Description",R.drawable.clinton));
        FirstBook.add(new Book("Dreams","Category","Description",R.drawable.dreams));
        FirstBook.add(new Book("Raila","Category","Description",R.drawable.flame));
        FirstBook.add(new Book("Luther","Category","Description",R.drawable.king));
        FirstBook.add(new Book("Miguna","Category","Description",R.drawable.peeling));

        RecyclerView myRv = (RecyclerView)findViewById(R.id.recycler_view);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(MainActivity.this,FirstBook);
        myRv.setLayoutManager(new GridLayoutManager(this,3));
        myRv.setAdapter(myAdapter);
    }
}
