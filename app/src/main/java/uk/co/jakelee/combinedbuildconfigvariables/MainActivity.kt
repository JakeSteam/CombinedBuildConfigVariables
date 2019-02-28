package uk.co.jakelee.combinedbuildconfigvariables

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "The server's URL is: ${BuildConfig.SERVER_URL}!", Toast.LENGTH_LONG).show()
    }
}
