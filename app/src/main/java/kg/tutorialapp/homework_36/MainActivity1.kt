package kg.tutorialapp.homework_36

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        setupFragmentA()
    }

    private fun setupFragmentA() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, FragmentA())
        transaction.commit()
    }
}