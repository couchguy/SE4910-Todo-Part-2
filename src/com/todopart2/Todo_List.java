package com.todopart2;


import com.todopart2.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Todo_List extends Fragment {
	
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceStae) {
		//Inflates the view from the xml layout file
		View view = inflater.inflate(R.layout.fragment_todo_list, container, false);
		
		ListView myListView = (ListView) view.findViewById(R.id.myListView);
		
		
		//binding the adapter to the view
		myListView.setAdapter(((MainActivity)getActivity()).getAdapter());
		
		return view;
	}
	
	
}
