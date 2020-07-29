package com.khemetic.stardropletsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class DayAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;

    public DayAdapter(Context context) {
        this.context = context;

        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        if (v == null) {
            v = inflater.inflate(R.layout.daylayout, null);
        }

        TextView tv_day_num = v.findViewById(R.id.tv_day_num);
        tv_day_num.setText("2");
        TextView tv_day_real = v.findViewById(R.id.tv_day_real);
        tv_day_real.setText("(July 13)");
        TextView tv_day = v.findViewById(R.id.tv_day_view);
        tv_day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }
}
