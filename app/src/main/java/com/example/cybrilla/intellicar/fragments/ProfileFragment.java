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
import com.example.cybrilla.intellicar.adapters.AllBooksAdapter;
import com.example.cybrilla.intellicar.adapters.BookReviewsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProfileFragment extends Fragment {

    @BindView(R.id.rvAllBooks)
    RecyclerView mRvAllBooks;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        initAllBooks();
    }

    private void initAllBooks() {
        mRvAllBooks.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, true));
        mRvAllBooks.setAdapter(new AllBooksAdapter());
    }
}
