package com.example.actionbar_dan_drawerlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id:Int = item.getItemId()
        if(id==R.id.group){
            Toast.makeText(this,"create a new group", Toast.LENGTH_SHORT).show()
        }

        if(id==R.id.broadcase){
            Toast.makeText(this,"create a new broadcast", Toast.LENGTH_SHORT).show()
        }

        if(id==R.id.linkedDevices){
            Toast.makeText(this,"check linked device", Toast.LENGTH_SHORT).show()
        }

        if(id==R.id.settings){
            Toast.makeText(this,"change settings", Toast.LENGTH_SHORT).show()
        }

        return true
    }
}