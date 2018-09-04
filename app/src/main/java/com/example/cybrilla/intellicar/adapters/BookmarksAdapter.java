package com.example.cybrilla.intellicar.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.model.BookTypes;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookmarksAdapter extends RecyclerView.Adapter<BookmarksAdapter.BookMarksDataHolder> {

    private List<BookTypes> mBookTypes;


    public BookmarksAdapter(List<BookTypes> bookTypes) {
        mBookTypes = bookTypes;
    }

    @Override
    public BookMarksDataHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_type_list_item, parent, false);
        return new BookMarksDataHolder(view);
    }

    @Override
    public void onBindViewHolder(BookMarksDataHolder holder, int position) {
        holder.tvBookType.setText(mBookTypes.get(position).getmBookCategory());
    }


    @Override
    public int getItemCount() {
        return mBookTypes.size();
    }

    class BookMarksDataHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvBookType)
         TextView tvBookType;


        public BookMarksDataHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
