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
                allInvis(binding)
                parallelogramList.parallelogramGroup.visibility = View.VISIBLE
                parallelogramList.parallelogramSidesAndAngleA.setOnClickListener{
                    allInvis(binding)
                    parallelogramList.parallelogramSidesAndAngleGroup.visibility = View.VISIBLE
                }
                parallelogramList.parallelogramDiagonalAndAngleY.setOnClickListener {
                    allInvis(binding)
                    parallelogramList.parallelogramDiagonalAndAngleGroup.visibility = View.VISIBLE
                }
                parallelogramList.parallelogramDiagonalAndSideA.setOnClickListener {
                    allInvis(binding)
                    parallelogramList.parallelogramDiagonalAndSideGroup.visibility = View.VISIBLE
                }
                parallelogramList.parallelogramHeightsAndAngleA.setOnClickListener {
                    allInvis(binding)
                    parallelogramList.parallelogramHeightsAndAngle.visibility = View.VISIBLE
                }
                parallelogramList.buttonEnd.setOnClickListener {
                    allInvis(binding)
                }
                parallelogramList.buttonEndFifth.setOnClickListener {
                    allInvis(binding)
                }
                parallelogramList.buttonEndSecond.setOnClickListener {
                    allInvis(binding)
                }
                parallelogramList.buttonEndFourth.setOnClickListener {
                    allInvis(binding)
                }
                parallelogramList.buttonEndThread.setOnClickListener {
                    allInvis(binding)
                }
            }
            rectangle.setOnClickListener{
                allInvis(binding)
                rectangleList.rectangleGroup.visibility = View.VISIBLE
                rectangleList.buttonEnd.setOnClickListener { allInvis(binding) }
                rectangleList.buttonEndFirst.setOnClickListener { allInvis(binding) }
                rectangleList.buttonEndSecond.setOnClickListener { allInvis(binding) }
                rectangleList.buttonEndFourth.setOnClickListener { allInvis(binding) }
                rectangleList.buttonEndTheard.setOnClickListener { allInvis(binding) }
                rectangleList.rectangleAngleABetweenTheDiagonals.setOnClickListener{
                    allInvis(binding)
                    rectangleList.rectangleAngleFromDiagonalGroup.visibility = View.VISIBLE
                }
                rectangleList.diagonalAndSideA.setOnClickListener {
                    allInvis(binding)
                    rectangleList.diagonalAndSideGroup.visibility = View.VISIBLE
                }
                rectangleList.rectangleAngleDFromDiagonal.setOnClickListener {
                    allInvis(binding)
                    rectangleList.rectangleAngleFromDiagonalGroup.visibility = View.VISIBLE
                }
                rectangleList.rectangleAreaAndSideA.setOnClickListener {
                    allInvis(binding)
                    rectangleList.rectangleAreaAndSideGroup.visibility = View.VISIBLE
                }
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
                allInvis(binding)
                squareList.squareGroup.visibility = View.VISIBLE
                squareList.buttonEnd.setOnClickListener{
                    allInvis(binding)
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
            parallelogramList.parallelogramGroup.visibility = View.GONE
            parallelogramList.parallelogramSidesAndAngleGroup.visibility = View.GONE
            parallelogramList.parallelogramDiagonalAndAngleGroup.visibility = View.GONE
            parallelogramList.parallelogramDiagonalAndSideGroup.visibility = View.GONE
            parallelogramList.parallelogramHeightsAndAngle.visibility = View.GONE
            rectangleList.rectangleGroup.visibility = View.GONE
            rectangleList.rectangleAngleFromDiagonalGroup.visibility = View.GONE
            rectangleList.diagonalAndSideGroup.visibility = View.GONE
            rectangleList.rectangleAngleFromDiagonalGroup.visibility = View.GONE
            rectangleList.rectangleAreaAndSideGroup.visibility = View.GONE
            squareList.squareGroup.visibility = View.GONE
        }
    }
}