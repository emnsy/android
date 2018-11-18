/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    public int numberOfCoffee = 2 ;
  public  int quantity =2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {


        display(numberOfCoffee);
        displayPrice(quantity * 5);

    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
 /**   public void increase(View view) {
        inc();
    }

    /**
     * This method displays the given quantity value on the screen.
     */
 /**   private void inc() {

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        //int quantity= Integer.parseInt(getText( findViewById(R.id.quantity_text_view)));
        //CharSequence quantity = getText(quantityTextView);
        int num1 =  Integer.parseInt(getText(quantityTextView));
int num1= getText(quantityTextView));


        quantityTextView.setText(getText(findViewById(R.id.quantity_text_view))++) ;
    }*/
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void increment(View view){
       quantity ++ ;
        display(quantity);
        displayPrice(quantity * 5);
    }
    public void decrement(View view){
        quantity -- ;

        display(quantity);
        displayPrice(quantity * 5);
    }
}
