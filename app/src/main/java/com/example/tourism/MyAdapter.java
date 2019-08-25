package com.example.tourism;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
public class MyAdapter extends BaseAdapter
{
    Context context;
    List<Place> places;
    MyAdapter(Context context, List<Place> places)
    {
     this.context=context;
     this.places=places;
    }
    @Override
    public int getCount()
    {
        return (places.size());
    }
    @Override
    public Object getItem(int position)
    {
        return null;
    }
    @Override
    public long getItemId(int position)
    {
        return(0);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent)
    {
        LayoutInflater inflater= LayoutInflater.from(context);
        View v=inflater.inflate(R.layout.single,null,false);
        ImageView img=v.findViewById(R.id.single_image);
        TextView tv1=v.findViewById(R.id.single_title);
        TextView tv2=v.findViewById(R.id.single_loc);
        Place p=places.get(position);
        img.setImageResource(p.getImage());
        tv1.setText(p.getTitle());
        tv2.setText(p.getLoc());
        return(v);
    }
}
