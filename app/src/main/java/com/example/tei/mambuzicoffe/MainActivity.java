package com.example.tei.mambuzicoffe;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.RadioButton;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView quantity;
    Button numOfcups;
    TextView price;
    int cups=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity=(TextView)findViewById(R.id.quantity_text_view);
        numOfcups=(Button)findViewById(R.id.number_of_cups);
        price=(TextView)findViewById(R.id.price);
    }

    public void addCups(View view)
    {
        cups=cups+1;
        String strCups=String.valueOf(cups);
        quantity.setText(strCups+"cups ordered");
        setPrice(view);
    }

    public void setPrice(View view)
    {

        int priceInt=20*cups;
        String strPrice=String.valueOf(priceInt);
        price.setText("Sh."+strPrice);
    }
    public  void removeCups(View view)

    {
        if (cups > 0)
        {
            cups = cups - 1;
            String strCups = String.valueOf(cups);
            quantity.setText("Cups ordered" + strCups);
            setPrice(view);
        }
        else
            {
            Toast.makeText(this,"lamba lolo",Toast.LENGTH_SHORT).show();
            }
    }
    public void feedback(View view)
    {
        Toast.makeText( this, "Thank you customer",Toast.LENGTH_SHORT).show();openMessage(view);
   }
    public void  openMessage(View view)
    {
        Intent intent=new Intent(this,Message.class);
        startActivity(intent);
    }
    public void selectCoffee(View view)
    {
boolean checked =((RadioButton) view).isChecked();
switch (view.getId()) {
    case R.id.whitecoffee:
        if (checked)
            break;
    case R.id.blackcoffee:
        if (checked)
            break;
}
    }
}

