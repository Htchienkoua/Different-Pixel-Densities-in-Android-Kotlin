package com.example.differentpixeldensities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.logo_image)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        // as for the resolutions of the image logo to use in the action bar, the android OS decicdes
        //automatically based on the DPI(Density Pixel Resolution) of the device detected

        //to use different image densitiies in the different project UI's , a plugin is needed to be installed
        //this plugin is called "android drawable importer" installed via settings, then install and then restart android studio

        //another plugin is the "DrawableXhdpi" plugin which does this job also

        //the third method is searching on google "Android Asset Studio" then select the corresponding image
        //then download the image resolution corresponding to your projects , and move the downloaded image resolution folder to the drawable folder

        setContentView(R.layout.activity_main)
    }
}