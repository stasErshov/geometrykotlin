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
                allInvis(binding)
                circleList.circleGroup.visibility = View.VISIBLE
                circleList.buttonEnd.setOnClickListener{
                    allInvis(binding)
                }
            }
            circularSector.setOnClickListener{
                allInvis(binding)
                circularSectorList.circleSectorGroup.visibility = View.VISIBLE
                circularSectorList.buttonEnd.setOnClickListener {
                    allInvis(binding)
                }
            }
            circularSegment.setOnClickListener{
                allInvis(binding)
                circularSegmentList.circularSegmentGroup.visibility = View.VISIBLE
                circularSegmentList.buttonEnd.setOnClickListener {
                    allInvis(binding)
                }
            }
            ellipseAxis.setOnClickListener{
                allInvis(binding)
                ellipseList.ellipseGroup.visibility = View.VISIBLE
                ellipseList.buttonEnd.setOnClickListener {
                    allInvis(binding)
                }
            }
            isoscelesTriangle.setOnClickListener{
                allInvis(binding)
                isoscelesTriangleList.isoscelesTriangleGroup.visibility = View.VISIBLE
                isoscelesTriangleList.buttonEnd.setOnClickListener {
                    allInvis(binding)
                }
                isoscelesTriangleList.triangleIsoscelesTriangleSides.setOnClickListener {
                    allInvis(binding)
                    isoscelesTriangleList.triangleIsoscelesTriangleSidesGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.buttonEndSecond.setOnClickListener {
                    allInvis(binding)
                    isoscelesTriangleList.isoscelesTriangleGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.triangleEquilateralTriangleSide.setOnClickListener {
                    allInvis(binding)
                    isoscelesTriangleList.triangleEquilateralTriangleSideGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.buttonEndThird.setOnClickListener {
                    allInvis(binding)
                    isoscelesTriangleList.isoscelesTriangleGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.triangleIsoscelesTriangleHeightAndSidesA.setOnClickListener {
                    allInvis(binding)
                    isoscelesTriangleList.triangleIsoscelesTriangleHeightAndSidesGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.buttonTriangleIsoscelesTriangleHeightAndSides.setOnClickListener {
                    allInvis(binding)
                    isoscelesTriangleList.triangleIsoscelesTriangleSidesGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.triangleIsoscelesTriangleSidesAAndAngleA.setOnClickListener{
                    allInvis(binding)
                    isoscelesTriangleList.triangleIsoscelesTriangleSidesSecondGroup.visibility = View.VISIBLE
                }
                isoscelesTriangleList.buttonTriangleIsoscelesTriangleSides.setOnClickListener{
                    allInvis(binding)
                    isoscelesTriangleList.triangleIsoscelesTriangleSidesGroup.visibility = View.VISIBLE
                }
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
    private fun allInvis(binding: ActivityMainBinding){
        binding.apply {
            circleList.circleGroup.visibility = View.GONE
            circularSectorList.circleSectorGroup.visibility = View.GONE
            circularSegmentList.circularSegmentGroup.visibility = View.GONE
            ellipseList.ellipseGroup.visibility = View.GONE
            isoscelesTriangleList.isoscelesTriangleGroup.visibility = View.GONE
            isoscelesTriangleList.triangleIsoscelesTriangleSidesGroup.visibility = View.GONE
            isoscelesTriangleList.isoscelesTriangleGroup.visibility = View.GONE
            isoscelesTriangleList.triangleEquilateralTriangleSideGroup.visibility = View.GONE
            isoscelesTriangleList.triangleIsoscelesTriangleSidesGroup.visibility = View.GONE
            isoscelesTriangleList.triangleIsoscelesTriangleHeightAndSidesGroup.visibility = View.GONE
            isoscelesTriangleList.triangleIsoscelesTriangleSidesGroup.visibility = View.GONE
            isoscelesTriangleList.triangleIsoscelesTriangleSidesSecondGroup.visibility = View.GONE
        }
    }
}