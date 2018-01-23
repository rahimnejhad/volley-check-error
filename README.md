# volley-check-error
Class VolleyCheckError

>usage

```
StringRequest mStringRequest=new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
    @Override
    public void onResponse(String response)
    {
        CheckResponse(response);
    }
}, new Response.ErrorListener() {
    @Override
    public void onErrorResponse(VolleyError error)
    {
        new VolleyCheckError(error,IntroActivity.this,"introActivity").CheckError();
    }
});
```
