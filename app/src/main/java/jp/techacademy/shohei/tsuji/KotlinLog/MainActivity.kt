package jp.techacademy.shohei.tsuji.KotlinLog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  //ここを追加

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("翔平", 20,"音楽")      // 名前を翔平、年齢20歳で、Humanのインスタンスを作る

        human.think()
        human.say()

        val man = Human("辻",20,"読書")
        man.think()
        man.say()
    }
}
