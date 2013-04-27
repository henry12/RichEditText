package com.kemallette.RichEditText.Widget;


import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.EditText;


public class RichEditTextField extends EditText{

	private static final String	    TAG	= "RichEditTextField";


	private SelectionChangeListener	selectionListener;


	public RichEditTextField(final Context context){

		this(context,
		     null);
	}


	public RichEditTextField(final Context context, final AttributeSet attrs){

		this(context,
		     attrs,
		     -1);
	}


	public RichEditTextField(final Context context, final AttributeSet attrs,
	    final int defStyle){

		super(context,
		      attrs,
		      defStyle);


	}


	@Override
	protected void onSelectionChanged(final int selStart, final int selEnd){

		super.onSelectionChanged(selStart,
		                         selEnd);

		if (selectionListener != null){
			selectionListener.onSelectionChanged(selStart,
			                                     selEnd);
		}
	}


	@Override
	public void setText(CharSequence text, BufferType type){

		super.setText(text,
		              type);
	}


	public void
	    setOnSelectionChangedListener(final SelectionChangeListener selectionListener){

		this.selectionListener = selectionListener;
	}

}