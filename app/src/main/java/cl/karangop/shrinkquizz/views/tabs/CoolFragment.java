package cl.karangop.shrinkquizz.views.tabs;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import cl.karangop.shrinkquizz.R;
import cl.karangop.shrinkquizz.data.CoolResult;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoolFragment extends Fragment {


    public CoolFragment() {
        // Required empty public constructor
    }

    public static CoolFragment newInstance(){
        return new CoolFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cool, container, false);
    }

    //Sobreescribir vista creada
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup= (RadioGroup) view.findViewById(R.id.coolRg);
        Button sendBtn= (Button) view.findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int btnId= radioGroup.getCheckedRadioButtonId();
                if(btnId != -1)
                {
                    RadioButton radioBtn= (RadioButton) radioGroup.findViewById(btnId);
                    String party= radioBtn.getText().toString();

                    /*
                    new AlertDialog.Builder para concatenar
                    */
                    AlertDialog.Builder alertDialog= new AlertDialog.Builder(getContext());
                    alertDialog.setTitle("Fiesta");
                    alertDialog.setMessage(new CoolResult(party).get());
                    alertDialog.setCancelable(false); //para que no se desactive dialogo pinchando afuera
                    //solo 3 botones en dialogo
                    alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    alertDialog.show(); //para mostrar el díalogo
                }
                else
                    Toast.makeText(getContext(), "Seleccione por favor", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
