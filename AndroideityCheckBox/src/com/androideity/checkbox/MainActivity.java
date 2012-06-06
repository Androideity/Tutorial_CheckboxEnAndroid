package com.androideity.checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends Activity implements CompoundButton.OnCheckedChangeListener {
	CheckBox cb;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        cb = (CheckBox) findViewById(R.id.checkb);
        cb.setOnCheckedChangeListener(this);
    }
 
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
    	if(isChecked){
    		cb.setText("Este checkbox está: checked");
    	}else{
    		cb.setText("Este checkbox está: unchecked");
    	}
    }
}