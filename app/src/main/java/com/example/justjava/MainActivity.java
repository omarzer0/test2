package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    TextView priceTextView, quantityTextView;
    int numberOfCoffees, priceOfCoffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOfCoffees = 0;
        priceOfCoffee = 5;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(numberOfCoffees);
        String message = "Total: "+(numberOfCoffees* priceOfCoffee)+"$"+"\nThank You!";
        displayMessage(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText(String.valueOf(number));
    }

    /**
     * This method displays the given price on the screen.
     */


    private void displayPrice(int number) {
        priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number ));
    }

    private void displayMessage(String s) {
        priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(s);
    }



    public void Increment(View view) {
        numberOfCoffees++;
        display(numberOfCoffees);
//        displayPrice(numberOfCoffees);
    }



    public void Decrement(View view) {
        if (numberOfCoffees > 0) {
            numberOfCoffees--;
            display(numberOfCoffees);
//            displayPrice(numberOfCoffees);
        }
    }
}
