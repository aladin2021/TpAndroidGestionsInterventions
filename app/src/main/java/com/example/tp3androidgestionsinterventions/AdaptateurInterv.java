package com.example.tp3androidgestionsinterventions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptateurInterv extends ArrayAdapter<interventions> {

    public AdaptateurInterv(@NonNull Context context, ArrayList<interventions> interventions) {
        super(context, 0, interventions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.elementinterv, parent, false);

        }
        interventions motCourant = getItem(position);
        TextView txtTitreInterv = (TextView) listItemView.findViewById(R.id.txtTitreInterv);
        txtTitreInterv.setText(motCourant.getTitreInterv());

        TextView txtClient = (TextView) listItemView.findViewById(R.id.txtClient);
        txtClient.setText(motCourant.getClient());
        TextView txtAdresseClient = (TextView) listItemView.findViewById(R.id.txtAdresseClient);
        txtAdresseClient.setText(motCourant.getAdressClient());
        TextView txtHeureInterv = (TextView) listItemView.findViewById(R.id.txtHeureInterv);
        txtHeureInterv.setText(motCourant.getHeureInterv());
        CheckBox chkTermine = (CheckBox) listItemView.findViewById(R.id.chkTermine);
        chkTermine.setChecked(motCourant.getTermine());

        return listItemView;

    }
}
