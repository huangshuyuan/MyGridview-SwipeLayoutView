package com.app.tychodemo.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.app.tychodemo.R;
import com.app.tychodemo.view.MyGridView;
import com.app.tychodemo.view.MyListView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by xingjikang on 2017/3/27.
 */

public class HomeFragment extends BaseFragment {
    @BindView(R.id.grid_1)
    MyGridView grid1;
    @BindView(R.id.grid_2)
    MyGridView grid2;
    @BindView(R.id.list_1)
    MyListView list1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactsLayout = inflater.inflate(R.layout.fragment_home,
                container, false);
        ButterKnife.bind(this, contactsLayout);
        return contactsLayout;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initGrid1();
    }

    private void initGrid1() {
        grid1.setAdapter(new MyGrid1Adapter());
        grid2.setAdapter(new MyGrid2Adapter());
        list1.setAdapter(new MyListAdapter());

    }

    @Override
    public void onResume() {
        // TODO Auto-generated method stub
        super.onResume();


    }

    private class MyGrid1Adapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 8;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_1, parent, false);
        }
    }

    private class MyGrid2Adapter extends BaseAdapter{
        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item_2, parent, false);
        }
    }

    private class MyListAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1, parent, false);
        }
    }
}
