package pl.srw.example.databinding;


import android.app.Fragment;
import android.os.Bundle;
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
        final DetailsBinding binding = inflate(inflater);

        binding.setDetails(new Details("He is very funny"));
        binding.desc.setAllCaps(true);
        return binding.getRoot();
    }

    private DetailsBinding inflate(LayoutInflater inflater) {
        // option 2:
//        final View view = inflater.inflate(R.layout.fragment_details, container, false);
//        final DetailsBinding binding = DetailsBinding.bind(view);

        // option 3:
//        final DetailsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);

        return DetailsBinding.inflate(inflater);
    }


}
