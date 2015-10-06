package pl.srw.example.databinding;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import pl.srw.example.databinding.databinding.DetailsBinding;
import pl.srw.example.databinding.model.Details;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {


    public DetailsFragment() {
        // Required empty public constructor
    }

    public static DetailsFragment newInstance() {

        Bundle args = new Bundle();

        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final DetailsBinding binding = DetailsBinding.inflate(inflater);
        // option 2:
//        final View view = inflater.inflate(R.layout.fragment_details, container, false);
//        final DetailsBinding binding = DetailsBinding.bind(view);

        // option 3:
//        final DetailsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);

        binding.setDetails(new Details("He is very funny"));
        return binding.getRoot();
    }


}
