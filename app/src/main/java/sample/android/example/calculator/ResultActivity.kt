package sample.android.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView as TextView

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //入力画面でIntentに詰めた値を取得
        val price = intent.getIntExtra("price",0)
        val discount = intent.getIntExtra("discount",0)

        val expression = findViewById<TextView>(R.id.expressuin_label)
        expression.text = getString(R.string.expression, price,discount)

        //割引後の価格を計算
        val discountedPrice = price * (100 - discount) / 100

        val result = findViewById<TextView>(R.id.result_lable)
        result.text = getString(R.string.result, discountedPrice)
    }
}
