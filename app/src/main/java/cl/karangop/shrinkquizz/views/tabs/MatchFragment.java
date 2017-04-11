package cl.karangop.shrinkquizz.views.tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import cl.karangop.shrinkquizz.R;
import cl.karangop.shrinkquizz.data.MatchResult;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class MatchFragment extends Fragment {


    public MatchFragment() {
        // Required empty public constructor
    }

    public static MatchFragment newInstance(){
        return new MatchFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_match, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final TextView userAgeTv = (TextView) view.findViewById(R.id.userAgeTv);
        final SeekBar userSb= (SeekBar) view.findViewById(R.id.userAgeSb);

        final TextView loverAgeTv = (TextView) view.findViewById(R.id.loverAgeTv);
        final SeekBar loverAgeSb= (SeekBar) view.findViewById(R.id.loverAgeSb);

        //Click al 1er Seekbar
        userSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                userAgeTv.setText(String.valueOf(progress)); //Esto modifica el textview con valores de Seekbar
            }

            @Override
            //metodo cuando comienzo a mover seekbar
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.d(TAG, "onStartTrackingTouch: ");

            }

            @Override
            //metodo cuando suelto el seekbar
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Click al 2do Seekbar
        loverAgeSb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                loverAgeTv.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Button enviarBtn= (Button) view.findViewById(R.id.sendBtnMatch);
        enviarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int userAge= Integer.parseInt(userAgeTv.getText().toString());
                int userAge= userSb.getProgress();
                int loverAge= loverAgeSb.getProgress();

                //MatchResult result= new MatchResult(userAge, loverAge);
                new AlertDialog.Builder(getContext())
                        .setTitle("El amor el amor")
                        .setMessage(new MatchResult(userAge, loverAge).get())
                        .show();

            }
        });

    }
}
