package com.ntuzer.reweldemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ntuzer.reweldemo.R;


/**
 * Created by ntuzer on 1/25/2017.
 */

public class ListViewAdapter extends BaseAdapter {

    private final LayoutInflater mInflater;
    private Context mContext;

    public ListViewAdapter(Context context) {
        mContext = context;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
//        TextView view = new View(mContext);
//        view.setText(String.valueOf(i));
//        return view;
        View rowView = mInflater.inflate(R.layout.list_item, viewGroup, false);
        TextView testView = (TextView) rowView.findViewById(R.id.list_view_tv);
        testView.setText(String.valueOf(i));
        return rowView;
    }
}
