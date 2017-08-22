package com.example.enpfootballlegue;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ListView;

public class SplashAlert extends Activity {
	 // JSON node keys  
	private static final String TAG_RANK = "rank";
	private static final String TAG_WIN = "win";
	private static final String TAG_DRAW = "draw";
	private static final String TAG_LOSS = "loss";
	public    String[] matcha1=null;
	public    String ownscore;
	public    String oppscore;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
	//  pass context and data to the custom adapter
		final ListView lview = (ListView) findViewById(R.id.listView2);
		final ListItemAdapter adapter = new ListItemAdapter(this, generateData());
		final AlertDialog builder = new AlertDialog.Builder(this).create();
		builder.setTitle("Download Complete");
		builder.setIcon(R.drawable.ic_check_circle);
		builder.show();
		new Handler().postDelayed(new Runnable() {

			public void run() {
				builder.dismiss();
				
			    lview.setAdapter(adapter);	//setListAdapter
			}
		}, 2000);
	
		 try {

	            JSONObject json = new JSONObject(loadJSONFromAsset());
	            if (json != null){
	            	// Getting JSON Array node
                    JSONObject alpha = json.getJSONObject("Alpha");  // Parse  JSON
	            String[] alpha1 = alpha.toString().split(":", 2);
	            String ownscore=alpha1[0];
	             String oppscore=alpha1[1];
	  	      /* String matcha1[] = alpha1.substring(12,16).split("-");
	             String ownscore=matcha1[0];
	             String oppscore=matcha1[1];*/
	          // tmp hash map for single contact
	             
	            /* String bravo = json.getString("Bravo");
	             String[] matchb1=bravo.substring(12, 16).split("-");
	             String ownscoreb=matchb1[0];
	             String oppscoreb1=matchb1[1];*/
	 		/*	String matcha2 = alpha
	 			String matcha3 = alpha.substring("match_3");
	 			String matcha4 = alpha.substring("match_4");
	             String bravo = json.getString("Bravo");
	             String charlie = json.getString("Charlie");
	             String delta = json.getString("Delta");
	             String echo = json.getString("Echo");*/
                /*  TextView tview = (TextView)findViewById(R.id.textView1);
                  String txt=("\n OwnScore::"+ownscore+"\nOpponent Score::"+oppscore+"\n Vlaue"+matchb1+"\n OWn"+ownscoreb+"\n Opp"+oppscoreb1);
           	     //   String txt = ("Alpha: " +alpha +"\nBravo:"+bravo+"\nCharlie:"+charlie+"\nDelta:"+delta+"\nEcho:"+echo);
           	         tview.setText(txt);*/
           	      /*String bravo = json.getString("Bravo");
                  TextView tview2 = (TextView)findViewById(R.id.textView2);
           	         String txt2 = ("Bravo: " + bravo);
           	         tview2.setText(txt);*/
	            }

	        } catch (JSONException e) {
	            e.printStackTrace();

	        }
	}

	public String loadJSONFromAsset() throws JSONException {
		 String json = null;

	        try {
	            InputStream is = getAssets().open("FootballScoresData.json");
	            int size = is.available();
	            byte[] buffer = new byte[size];
	           /* ByteArrayOutputStream baos = new ByteArrayOutputStream();
	            
	            while ( is.read(buffer) != -1)
	            baos.write(buffer);
	            String JSONResp = new String(baos.toByteArray());
	            
	            JSONArray arr = new JSONArray(JSONResp);
	            for (int i=0; i< arr.length(); i++) {
	            	
					result.add(convertListItem(arr.getJSONObject(i)));
	            	}
	            return result;*/
	            is.read(buffer);
	            is.close();
	            json = new String(buffer, "UTF-8");
	        } catch (IOException ex) {
		           ex.printStackTrace();
		            return null;
		        }
		        return json;
		}
/*	            // Read the stream
byte[] b = new byte[1024];
ByteArrayOutputStream baos = new ByteArrayOutputStream();
 
while ( is.read(b) != -1)
baos.write(b);
 
String JSONResp = new String(baos.toByteArray());
 
JSONArray arr = new JSONArray(JSONResp);


	        } catch (IOException ex) {
	           ex.printStackTrace();
	            return null;
	        }
	        return json;
	}private Contact convertContact(JSONObject obj) throws JSONException {
String name = obj.getString("name");
String surname = obj.getString("surname");
String email = obj.getString("email");
String phoneNum = obj.getString("phoneNum");
 
return new Contact(name, surname, email, phoneNum);
}*/
	        
	/*private ListItem convertListItem(JSONObject jsonObject) throws JSONException{
		String rank = jsonObject.getString("rank");
		String win = jsonObject.getString("win");
		String draw = jsonObject.getString("draw");
		String loss = jsonObject.getString("loss");
		 
		return new ListItem(rank,win,draw,loss);
	}*/

	private ArrayList<ListItem> generateData() {
	//	ArrayList<ListItem> items = ListItem.fromJson();

		ArrayList<ListItem> items = new ArrayList<ListItem>();
		items.add(new ListItem("Rank:Alpha", "Win :2", "Draw :1", "Loss :0"));
		items.add(new ListItem("Rank:Bravo", "Win :3", "Draw :0", "Loss :1"));
		items.add(new ListItem("Rank:Charlie", "Win :3", "Draw:1", "Loss :0"));
		items.add(new ListItem("Rank:Echo","Win :1","Draw:3","Loss :1"));
/*int index = 0;
items.addAll(index, items);*/
		return items;
	}

}
