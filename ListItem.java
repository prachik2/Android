package com.example.enpfootballlegue;

import java.util.ArrayList;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

public  class ListItem implements ListAdapter {

    public String rank;
    public String wins;
    public String draw;
    public String loss;
    ListItem itemList = null;
    public ListItem(String rank, String wins,String draw,String loss) {

       this.rank=rank;
       this.wins=wins;
       this.draw=draw;
       this.loss=loss;
    }

	public ListItem(SplashAlert splashAlert, ArrayList<ListItem> generateData) {
		// TODO Auto-generated constructor stub
	}

	public CharSequence getRank() {
		// TODO Auto-generated method stub
		return null;
	}
	public CharSequence getWins() {
		// TODO Auto-generated method stub
		return null;
	}

	public CharSequence getDraw() {
		// TODO Auto-generated method stub
		return null;
	}

	public CharSequence getLoss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListItem getItem(int position) {
		
		if (itemList != null)
			return itemList.get(position);
			return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getItemViewType(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getViewTypeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean areAllItemsEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public ListItem get(int position) {
		// TODO Auto-generated method stub
		return null;
	}

}