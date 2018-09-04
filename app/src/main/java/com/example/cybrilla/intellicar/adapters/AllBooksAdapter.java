package com.example.cybrilla.intellicar.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cybrilla.intellicar.R;

public class AllBooksAdapter extends RecyclerView.Adapter<AllBooksAdapter.AllBooksHolder> {
    @Override
    public AllBooksAdapter.AllBooksHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_books_list_item, parent, false);
        return new AllBooksHolder(view);
    }

    @Override
    public void onBindViewHolder(AllBooksAdapter.AllBooksHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }


    class AllBooksHolder extends RecyclerView.ViewHolder {

        public AllBooksHolder(View itemView) {
            super(itemView);
        }
    }
}
