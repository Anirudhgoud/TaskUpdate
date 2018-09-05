package com.example.cybrilla.intellicar.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.model.AllBooks;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllBooksAdapter extends RecyclerView.Adapter<AllBooksAdapter.AllBooksHolder> {

    private List<AllBooks> mAllBooks;

    public AllBooksAdapter(List<AllBooks> allBookThumbnails) {
        mAllBooks = allBookThumbnails;
    }

    @Override
    public AllBooksAdapter.AllBooksHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_books_list_item, parent, false);
        return new AllBooksHolder(view);
    }

    @Override
    public void onBindViewHolder(AllBooksAdapter.AllBooksHolder holder, int position) {
        holder.ivThumbnail.setImageResource(mAllBooks.get(position).getmThumbnail());
    }

    @Override
    public int getItemCount() {
        return mAllBooks.size();
    }


    class AllBooksHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivThumbnail)
        ImageView ivThumbnail;


        public AllBooksHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
