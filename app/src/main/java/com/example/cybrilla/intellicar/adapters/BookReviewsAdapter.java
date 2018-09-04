package com.example.cybrilla.intellicar.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.model.BookReviews;
import com.example.cybrilla.intellicar.model.BookTypes;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookReviewsAdapter extends RecyclerView.Adapter<BookReviewsAdapter.ReviewsHolder> {

    private List<BookReviews> mBookReviews;


    public BookReviewsAdapter(List<BookReviews> reviewData) {
        mBookReviews = reviewData;
    }

    @Override
    public ReviewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_list_item, parent, false);
        return new ReviewsHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewsHolder holder, int position) {
        holder.tvName.setText(String.format("%s rated it", mBookReviews.get(position).getmReviewerName()));
        holder.tvReview.setText(mBookReviews.get(position).getmReview());
        holder.tvTitle.setText(mBookReviews.get(position).getmBookName());
        holder.tvRating.setText(mBookReviews.get(position).getReviewRating());
    }

    @Override
    public int getItemCount() {
        return mBookReviews.size();
    }


    class ReviewsHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tvName)
        TextView tvName;

        @BindView(R.id.tvBookName)
        TextView tvTitle;

        @BindView(R.id.tvReview)
        TextView tvReview;

        @BindView(R.id.tvRating)
        TextView tvRating;

        public ReviewsHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
