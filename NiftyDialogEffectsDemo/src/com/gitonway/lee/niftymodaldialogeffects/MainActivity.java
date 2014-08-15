package com.gitonway.lee.niftymodaldialogeffects;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

public class MainActivity extends Activity {

	private Effectstype effect;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void dialogShow(View v) {
		final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(this);

		switch (v.getId()) {
		case 1:
		case R.id.fadein:
			effect = Effectstype.Fadein;
			break;
		case R.id.slideright:
			effect = Effectstype.Slideright;
			break;
		case R.id.slideleft:
			effect = Effectstype.Slideleft;
			break;
		case R.id.slidetop:
			effect = Effectstype.Slidetop;
			break;
		case R.id.slideBottom:
			effect = Effectstype.SlideBottom;
			break;
		case R.id.newspager:
			effect = Effectstype.Newspager;
			break;
		case R.id.fall:
			effect = Effectstype.Fall;
			break;
		case R.id.sidefall:
			effect = Effectstype.Sidefill;
			break;
		case R.id.fliph:
			effect = Effectstype.Fliph;
			break;
		case R.id.flipv:
			effect = Effectstype.Flipv;
			break;
		case R.id.rotatebottom:
			effect = Effectstype.RotateBottom;
			break;
		case R.id.rotateleft:
			effect = Effectstype.RotateLeft;
			break;
		case R.id.slit:
			effect = Effectstype.Slit;
			break;
		case R.id.shake:
			effect = Effectstype.Shake;
			break;
		}

		dialogBuilder.withTitle("弹出框")
				// .withTitle(null) no title
				.withTitleColor("#FFFFFF")
				// def
				.withDividerColor("#11000000")
				// def
				.withMessage("这是信息文本。")
				// .withMessage(null) no Msg
				.withMessageColor("#FFFFFF")
				// def
				.withIcon(getResources().getDrawable(R.drawable.icon))
				.isCancelableOnTouchOutside(true) // def | isCancelable(true)
				.withDuration(500) // def
				.withEffect(effect) // def Effectstype.Slidetop
				.withButton1Text("确定") // def gone
				.withButton2Text("取消") // def gone
				.setCustomView(R.layout.custom_view, v.getContext()) // .setCustomView(View
																		// or
																		// ResId,context)
				.setButton1Click(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(v.getContext(), "确定",
								Toast.LENGTH_SHORT).show();
					}
				}).setButton2Click(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Toast.makeText(v.getContext(), "取消",
								Toast.LENGTH_SHORT).show();
						dialogBuilder.dismiss();
					}
				}).show();

	}

}
