package com.example.broadcastbestpractice;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class ForceOfflineBroadcast extends BroadcastReceiver {

	@Override
	public void onReceive(final Context context, Intent intent) {
		// TODO Auto-generated method stub
AlertDialog.Builder builder=new AlertDialog.Builder(context);
Log.e("hehe", "rece");
AlertDialog dialog= builder.setTitle("warning").setMessage("your are force to be offline").setCancelable(false).setPositiveButton("OK", new OnClickListener() {
	
	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
	ActivityCollector.finishALL();
	Intent i=new Intent(context,LoginActivity.class);
	i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
	context.startActivity(i);
	}
}).create();
dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		dialog.show();
		
	}

}
