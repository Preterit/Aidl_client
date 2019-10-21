package com.xiangxue.aidl_client

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RemoteException
import android.view.View
import android.widget.TextView
import com.xiangxue.aidl_service.Person
import com.xiangxue.aidl_service.ILeoAidl


class MainActivity : AppCompatActivity() {

    private val iLeoAidl: ILeoAidl? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv_click = findViewById<TextView>(R.id.tv_click);

        tv_click.setOnClickListener { v ->
            run {
                try {
                    var person: Person = Person("张三", 19)
                    iLeoAidl?.addPerson(person)
                } catch (e: RemoteException) {
                    e.printStackTrace()
                }
            }
        }
    }
}
