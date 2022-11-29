package com.example.geometrykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.geometrykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = Html.fromHtml("<font color = \"black\">" + getString(R.string.app_name))

        binding.apply {
            circle.setOnClickListener{
                //TODO circleActivity
            }
            circularSector.setOnClickListener{
                //TODO circularSectorActivity
            }
            circularSegment.setOnClickListener{
                //TODO circularSegmentActivity
            }
            ellipseAxis.setOnClickListener{
                //TODO ellipseAxisActivity
            }
            isoscelesTriangle.setOnClickListener{
                //TODO isoscelesTriangleActivity
            }
            parallelogram.setOnClickListener{
                //TODO parallelogramActivity
            }
            rectangle.setOnClickListener{
                //TODO rectangleActivity
            }
            regularPolygon.setOnClickListener{
                //TODO regularPolygonActivity
            }
            rhombus.setOnClickListener{
                //TODO rhombusActivity
            }
            rightTriangle.setOnClickListener{
                //TODO rightTriangleActivity
            }
            ring.setOnClickListener{
                //TODO ringActivity
            }
            square.setOnClickListener{
                //TODO squareActivity
            }
            trapezoid.setOnClickListener{
                //TODO trapezoidActivity
            }
            triangle.setOnClickListener{
                //TODO triangleActivity
            }
        }
    }
}