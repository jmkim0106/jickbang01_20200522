package com.example.jickbang01_20200522.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.jickbang01_20200522.R;
import com.example.jickbang01_20200522.datas.Room;

import java.util.List;

public class RoomAdepter extends ArrayAdapter<Room> {

    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdepter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.room_list_item, null);
        }

        TextView priceTxt = row.findViewById(R.id.priceTxt);
        TextView addressAndFloorTxt = row.findViewById(R.id.addressAndFloorTxt);
        TextView descTxt = row.findViewById(R.id.descTxt);

        Room data = mList.get(position);


        priceTxt.setText(data.getFormattedPrice());
        descTxt.setText(data.getDescription());
        addressAndFloorTxt.setText(String.format("%s,%s", data.getAddress(), data.getFormattedFloor()));

        return row;

    }
}
