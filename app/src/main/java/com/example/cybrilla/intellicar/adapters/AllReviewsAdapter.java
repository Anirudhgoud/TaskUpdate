package com.example.cybrilla.intellicar.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.model.BookReviews;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AllReviewsAdapter extends RecyclerView.Adapter<AllReviewsAdapter.AllReviewHolder> {

    private List<BookReviews> mAllBookReviews;

    public AllReviewsAdapter(List<BookReviews> bookReviews) {
        mAllBookReviews = bookReviews;
    }

    @Override
    public AllReviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_reviews_list_item,
                parent, false);
        return new AllReviewHolder(view);
    }

    @Override
    public void onBindViewHolder(AllReviewHolder holder, int position) {

        holder.tvReview.setText(mAllBookReviews.get(position).getmReview());
        holder.tvRating.setText(mAllBookReviews.get(position).getReviewRating());
        holder.ivThumbNail.setImageResource(mAllBookReviews.get(position).getmThumbNail());
    }

    @Override
    public int getItemCount() {
        return mAllBookReviews.size();
    }

    class AllReviewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvRevie)
        TextView tvReview;

        @BindView(R.id.tvRate)
        TextView tvRating;

        @BindView(R.id.ivBookThumbnail)
        ImageView ivThumbNail;


        public AllReviewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

}

