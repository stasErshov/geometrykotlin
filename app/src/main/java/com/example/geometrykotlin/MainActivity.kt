package com.example.geometrykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import com.example.geometrykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = Html.fromHtml("<font color = \"black\">" + getString(R.string.app_name))

        binding.apply {
            circle.setOnClickListener{
                circleList.circleGroup.visibility = View.VISIBLE
                circleList.buttonEnd.setOnClickListener{
                    circleList.circleGroup.visibility = View.GONE
                }
            }
            circularSector.setOnClickListener{
                circularSectorList.circleSectorGroup.visibility = View.VISIBLE
                circularSectorList.buttonEnd.setOnClickListener {
                    circularSectorList.circleSectorGroup.visibility = View.GONE
                }
            }
            circularSegment.setOnClickListener{
                circularSegmentList.circularSegmentGroup.visibility = View.VISIBLE
                circularSegmentList.buttonEnd.setOnClickListener {
                    circularSegmentList.circularSegmentGroup.visibility = View.GONE
                }
            }
            ellipseAxis.setOnClickListener{
                ellipseList.ellipseGroup.visibility = View.VISIBLE
                ellipseList.buttonEnd.setOnClickListener {
                    ellipseList.ellipseGroup.visibility = View.GONE
                }
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
                squareList.squareGroup.visibility = View.VISIBLE
                squareList.buttonEnd.setOnClickListener{
                    squareList.squareGroup.visibility = View.GONE
                }
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