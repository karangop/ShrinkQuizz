package cl.karangop.shrinkquizz.views.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import cl.karangop.shrinkquizz.R;
import cl.karangop.shrinkquizz.data.LuckyResult;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuckyFragment extends Fragment {


    public LuckyFragment() {
        // Required empty public constructor
    }

    public static LuckyFragment newInstance(){
        return new LuckyFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CheckBox happyCb= (CheckBox) view.findViewById(R.id.happyCb);
        CheckBox inputCb= (CheckBox) view.findViewById(R.id.inputCb);

        inputCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                happyCb.setChecked(isChecked);

            }
        });

        Button sendBtn= (Button) view.findViewById(R.id.sendBtn);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean status= happyCb.isChecked();

                AlertDialog.Builder alertDialog= new AlertDialog.Builder(getContext());
                alertDialog.setTitle("Suerte!");
                alertDialog.setMessage(new LuckyResult(status).get());
                alertDialog.show();
            }
        });

    }
}
