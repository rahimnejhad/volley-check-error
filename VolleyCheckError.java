package com.hamavaran.starland.network;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;

/**
 * Created by m.rahimnejhad on 2017-12-05.
 */

public class VolleyCheckError {
    VolleyError mVolleyError;
    Context mContext;
    String mFrom;

    public VolleyCheckError(VolleyError mVolleyError, Context mContext, String mFrom) {
        this.mVolleyError = mVolleyError;
        this.mContext = mContext;
        this.mFrom=mFrom;
    }

    public void CheckError()
    {
        if (mVolleyError instanceof TimeoutError || mVolleyError instanceof NoConnectionError)
        {
            //TimeoutError
            Toast.makeText(mContext, mFrom+"پاسخ از سرور دریافت نشد", Toast.LENGTH_LONG).show();
        }
        else if (mVolleyError instanceof AuthFailureError)
        {
            //AuthFailureError
            Toast.makeText(mContext,"My Error AuthFailureError : "+mFrom, Toast.LENGTH_LONG).show();
        }
        else if (mVolleyError instanceof ServerError)
        {
            //ServerError
            Toast.makeText(mContext,"My Error ServerError : "+mFrom, Toast.LENGTH_LONG).show();
        }
        else if (mVolleyError instanceof NetworkError)
        {
            //NetworkError
            Toast.makeText(mContext,"My Error NetworkError : "+mFrom, Toast.LENGTH_LONG).show();
        }
        else if (mVolleyError instanceof ParseError)
        {
            //ParseError
            Toast.makeText(mContext,"My Error ParseError : "+mFrom, Toast.LENGTH_LONG).show();
        }
    }
}
