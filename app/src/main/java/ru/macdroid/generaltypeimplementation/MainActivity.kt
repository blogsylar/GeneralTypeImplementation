package ru.macdroid.generaltypeimplementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MyInterface<String> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * As you can see, only one interface with T generic, and so many realizations
     */

    override fun first(obj: String) {
        TODO("Not yet implemented")
    }

    override fun second(obj: String) {
        TODO("Not yet implemented")
    }
}


class Second : MyInterface<Int> {
    override fun first(obj: Int) {
        TODO("Not yet implemented")
    }

    override fun second(obj: Int) {
        TODO("Not yet implemented")
    }

}


class Third: MyInterface<MainData> {
    override fun first(obj: MainData) {
        TODO("Not yet implemented")
    }

    override fun second(obj: MainData) {
        TODO("Not yet implemented")
    }

}