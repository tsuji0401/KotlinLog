package jp.techacademy.shohei.tsuji.KotlinLog

import android.util.Log

class Human: Animal,Thinkable {
    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby = hobby
    }

    var hobby : String


    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

     override fun think() {
            Log.d("kotlintest", "私は" + this.hobby + "について考える。")
        }

}