
// refer to http://thenewboston.org/watch.php?cat=6&number=21
package com.paddy10tellys.aaitools;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity {
	String classes[] = {"AAITools", "example2", "example3", "example4", "example5", "example6"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));  // each list item corresponds to a position in the classes array
	}	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {		// called when a list item is clicked  nb the int position parameter gives us the corresponding text in the classes array
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String selectedClass = classes[position]; // nb the int position parameter gives us the corresponding text in the classes array
		Class ourClass;
		try {
			ourClass = Class.forName("com.paddy10tellys.aaitools." + selectedClass); // e.g., the combination is the path to the selected class
			Intent ourIntent = new Intent(Menu.this, ourClass);	// an intent to use this class
			startActivity(ourIntent); // start activity based on this intent i.e., start that particular class
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // make a class
	}
}
