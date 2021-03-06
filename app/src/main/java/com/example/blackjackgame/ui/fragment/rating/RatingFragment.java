package com.example.blackjackgame.ui.fragment.rating;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.blackjackgame.R;
import com.example.blackjackgame.databinding.FragmentRatingBinding;

public class RatingFragment extends Fragment {

    private FragmentRatingBinding binding;

    public static RatingFragment newInstance() {

        Bundle args = new Bundle();

        RatingFragment fragment = new RatingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_rating,container,false);

        return binding.getRoot();
    }
}
