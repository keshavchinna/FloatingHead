package com.daya.floatinghead.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.daya.floatinghead.R;

import java.util.List;


public class CustomAdapter extends ArrayAdapter {

  private int resource;
  private LayoutInflater inflater;
  private Context context;

  public CustomAdapter(Context ctx, int resourceId, List callLogsList) {
    super(ctx, resourceId, callLogsList);
    resource = resourceId;
    inflater = LayoutInflater.from(ctx);
    context = ctx;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    convertView = (LinearLayout) inflater.inflate(resource, null);
    String phoneNumber = (String) getItem(position);
    TextView txtName = (TextView) convertView.findViewById(R.id.textView1);
    txtName.setText(phoneNumber);
    ImageView imageCity = (ImageView) convertView.findViewById(R.id.imageView1);
    return convertView;
  }
}