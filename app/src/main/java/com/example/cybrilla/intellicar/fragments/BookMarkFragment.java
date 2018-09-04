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

import com.example.cybrilla.intellicar.R;
import com.example.cybrilla.intellicar.adapters.BookReviewsAdapter;
import com.example.cybrilla.intellicar.adapters.BookmarksAdapter;
import com.example.cybrilla.intellicar.model.BookReviews;
import com.example.cybrilla.intellicar.model.BookTypes;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BookMarkFragment extends Fragment {

    @BindView(R.id.rvBookCategory)
    RecyclerView mRvBookCategory;

    @BindView(R.id.rvReviews)
    RecyclerView mRvReviews;

    BookmarksAdapter mBookMarksAdapter;
    BookReviewsAdapter mBookReviewsAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bookmarks, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        initBookCategoryUi();
        initReviewsUi();
    }

    private void initReviewsUi() {
        mRvReviews.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, true));
        mBookReviewsAdapter = new BookReviewsAdapter(getReviewData());
        mRvReviews.setAdapter(mBookReviewsAdapter);
    }

    private void initBookCategoryUi() {
        mRvBookCategory.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));
        mBookMarksAdapter = new BookmarksAdapter(getBookTypes());
        mRvBookCategory.setAdapter(mBookMarksAdapter);


    }


    private List<BookTypes> getBookTypes() {
        List<BookTypes> bookTypes = new ArrayList<>();
        bookTypes.add(new BookTypes(getString(R.string.literature)));
        bookTypes.add(new BookTypes(getString(R.string.business)));
        bookTypes.add(new BookTypes(getString(R.string.horror)));
        return bookTypes;
    }


    private List<BookReviews> getReviewData() {
        List<BookReviews> bookReviews = new ArrayList<>();
        bookReviews.add(new BookReviews(getString(R.string.all_this),
                getString(R.string.review_1), "Lilly", "8.6"));
        bookReviews.add(new BookReviews(getString(R.string.promise),
                getString(R.string.review_2),
                "Jerome Walters", "8.6"));
        return bookReviews;
    }
}
