package com.example.monsterhunter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RetrofitItemAdapter extends BaseAdapter {
    Context mcontext;
    private List<Monster> mMonster;
    RecyclerView.ViewHolder vh = null;
    public RetrofitItemAdapter(List<Monster> mMonster) {

        this.mMonster = mMonster;
    }
    public RetrofitItemAdapter(List<Monster> mMonster, Context mcontext) {
        this.mMonster = mMonster;
        this.mcontext = mcontext;
    }
    public class ViewHolder {

        public TextView tvName;
        public TextView tvType;
        public TextView tvSpecies;
    }

    @Override
    public int getCount() {
        return mMonster.size();
    }

    @Override
    public Object getItem(int position) {
        return mMonster.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View vi = convertView;
        ViewHolder holder;
        if (convertView == null) {

            LayoutInflater inflater;
            inflater = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            vi = inflater.inflate(R.layout.listviewlayout, null);

            holder = new ViewHolder();
            holder.tvName = (TextView) vi.findViewById(R.id.textNama);
            holder.tvType = (TextView) vi.findViewById(R.id.textTipe);
            holder.tvSpecies = (TextView) vi.findViewById(R.id.textSpecies);


            vi.setTag(holder);

        } else
            holder = (ViewHolder) vi.getTag();

        // now set your text view here like

        // holder.tvName.setText("Bla Bla Bla");

        holder.tvName.setText(mMonster.get(position).getName());
        holder.tvType.setText(mMonster.get(position).getType());
        holder.tvSpecies.setText(mMonster.get(position).getSpecies());


        // return your view
        return vi;
    }
}
