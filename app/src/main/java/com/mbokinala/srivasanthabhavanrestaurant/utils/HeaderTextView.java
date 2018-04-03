package com.mbokinala.srivasanthabhavanrestaurant.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/**
 * Created by ajonnakuti on 4/2/18.
 */

public class HeaderTextView extends android.support.v7.widget.AppCompatTextView{
    public HeaderTextView(Context context) {
        super(context);
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    }

    public HeaderTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    }

    public HeaderTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
        this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    }
}


/*import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontTextView extends TextView {


    public FontTextView(Context context) {
      super(context);
      Typeface face=Typeface.createFromAsset(context.getAssets(), "Helvetica_Neue.ttf");
      this.setTypeface(face);
    }

    public FontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
     Typeface face=Typeface.createFromAsset(context.getAssets(), "Helvetica_Neue.ttf");
  this.setTypeface(face);
    }

    public FontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
     Typeface face=Typeface.createFromAsset(context.getAssets(), "Helvetica_Neue.ttf");
  this.setTypeface(face);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);


    }

}*/