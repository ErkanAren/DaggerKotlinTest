package earen.com.daggertest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import earen.com.daggertest.objects.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerCarComponent.create()
        component.inject(this)
        car.drive()

        //car.drive()


    }
}
