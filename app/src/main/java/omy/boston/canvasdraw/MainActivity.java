package omy.boston.canvasdraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import omy.boston.canvasdraw.views.CanvasView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CanvasView(this));

        /**FRAGMENTS*/
        // Za dodavanje iz .class
        // View rootView = new SimpleShape(getActivity());

        // Za dodavanje .xml
        // View rootView = inflater.inflate(R.layout.fragment_layout, conteiner, false);
    }
}
