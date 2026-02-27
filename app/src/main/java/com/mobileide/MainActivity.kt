
package com.mobileide
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
  findViewById<EditText>(R.id.editor).setText(
   "// Mobile Android IDE\nfun main(){ println(\"OK\") }"
  )
 }
}
