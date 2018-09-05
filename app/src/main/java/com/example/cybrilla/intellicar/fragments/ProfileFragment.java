package com.example.cybrilla.intellicar.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.adapters.AllBooksAdapter;
import com.example.cybrilla.intellicar.adapters.AllReviewsAdapter;
import com.example.cybrilla.intellicar.adapters.BookReviewsAdapter;
import com.example.cybrilla.intellicar.model.AllBooks;
import com.example.cybrilla.intellicar.model.BookReviews;
import com.example.cybrilla.intellicar.utils.Constants;
import com.example.cybrilla.intellicar.utils.Utility;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileFragment extends Fragment {

    @BindView(R.id.rvAllBooks)
    RecyclerView mRvAllBooks;

    @BindView(R.id.rvAllReviews)
    RecyclerView mRvAllReviews;

    @BindView(R.id.tvAllBooks)
    TextView tvAllBooks;

    @BindView(R.id.tvReviews)
    TextView tvReviews;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        initAllBooks();
        initAllReviews();
    }

    private void initAllReviews() {

        tvReviews.setText(Utility.getAppendedString(getContext(), getString(R.string.all_reviews),
                getReviewData().size()));
        mRvAllReviews.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, true));
        mRvAllReviews.setAdapter(new AllReviewsAdapter(getReviewData()));
    }

    private void initAllBooks() {


        tvAllBooks.setText(Utility.getAppendedString(getContext(), getString(R.string.all_books),
                getAllBookThumbnails().size()));
        mRvAllBooks.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, true));
        mRvAllBooks.setAdapter(new AllBooksAdapter(getAllBookThumbnails()));
    }


    private List<AllBooks> getAllBookThumbnails() {

        List<AllBooks> allBooks = new ArrayList<>();

        allBooks.add(new AllBooks(Utility.getThumbnail(getContext(), "ic_brain")));
        allBooks.add(new AllBooks(Utility.getThumbnail(getContext(), "ic_thumbnail_one")));
        allBooks.add(new AllBooks(Utility.getThumbnail(getContext(), "ic_vinegar_girl")));
        allBooks.add(new AllBooks(Utility.getThumbnail(getContext(), "ic_dan_brown")));
        return allBooks;
    }

    public List<BookReviews> getReviewData() {
        List<BookReviews> bookReviews = new ArrayList<>();
        bookReviews.add(new BookReviews(getString(R.string.all_this),
                getString(R.string.review_1), "Lilly", "8.6",
                Utility.getThumbnail(getContext(), "ic_vinegar_girl")));
        bookReviews.add(new BookReviews(getString(R.string.promise),
                getString(R.string.review_2),
                "Jerome Walters", "8.6",
                Utility.getThumbnail(getContext(), "ic_brain")));
        return bookReviews;
    }

}
