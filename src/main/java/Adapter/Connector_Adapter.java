package Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.myapplication.Device;
import com.example.myapplication.R;

import java.util.List;


/**
 * Created by Administrator on 2016/7/31.
 */
public class Connector_Adapter extends BaseAdapter implements View.OnClickListener{

    int position;
    Context context;
    List<String> list;
    LayoutInflater inflater;
    ViewHolder holder;

    public Connector_Adapter(Context context, List<String> list) {
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        holder=new ViewHolder();
        if (convertView==null)
        {
            convertView=inflater.inflate(R.layout.connector_item,null);
            this.position=position;
            holder.textView= (TextView) convertView.findViewById(R.id.connector_item_textview);
            holder.textView.setOnClickListener(this);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
        if (holder!=null)
        {
            holder.textView.setText(list.get(position));
        }
        return convertView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.connector_item_textview:
                Intent intent=new Intent(context, Device.class);
                context.startActivity(intent);
                break;
        }
    }

    public class ViewHolder
    {
        TextView textView;
    }

}
