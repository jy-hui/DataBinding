package android.example.databinding

import android.example.databinding.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student=Student("W123","Alex")

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myData=student
       // binding.tvStudentID.text=student.studentId
       // binding.tvName.text=student.name

        binding.btnUpdate.setOnClickListener(){
            student.name="John"
           // binding.tvName.text=student.name

            binding.apply{

                invalidateAll()
            }
        }
    }
}