package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

import Model.DeviceModel;

/**
 * Created by Administrator on 2016/8/1.
 */
public class Device_Adapter extends BaseAdapter {

    ViewHolder holder;
    List<DeviceModel> list;
    Context context;
    LayoutInflater inflater;

    public Device_Adapter(Context context, List<DeviceModel> list) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
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
        holder = new ViewHolder();
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.device_list_item, null);
            holder.Device_list_Item_Name = (TextView) convertView.findViewById(R.id.Device_list_Item_Name);
            holder.Device_list_Item_Type = (TextView) convertView.findViewById(R.id.Device_list_Item_Type);
            holder.Device_list_Item_Status = (TextView) convertView.findViewById(R.id.Device_list_Item_Status);
            holder.Device_list_Item_CheckBox = (CheckBox) convertView.findViewById(R.id.Device_list_Item_CheckBox);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (holder != null) {
            holder.Device_list_Item_Name.setText(list.get(position).getName());
            holder.Device_list_Item_Type.setText(list.get(position).getType());
            holder.Device_list_Item_Status.setText(list.get(position).getStatus());
            holder.Device_list_Item_CheckBox.setChecked(list.get(position).getControl());
        }
        return convertView;
    }

    public class ViewHolder {
        TextView Device_list_Item_Name;
        TextView Device_list_Item_Type;
        TextView Device_list_Item_Status;
        CheckBox Device_list_Item_CheckBox;
    }
}
