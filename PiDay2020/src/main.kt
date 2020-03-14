import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

    val numberOfPoints = 100000000

    var pointsInsideCircle = 0
    val center = Pair(0.toDouble(), 0.toDouble())
    for(i in 0 until numberOfPoints) {
        val point = getRandomPoint(0f, 1f, 0f, 1f)
        val distance = distanceBetweenPoints(center, point)
        if(distance <= 1) {
            pointsInsideCircle++
        }
    }

    val ratio = pointsInsideCircle.toFloat()/numberOfPoints
    println(4*ratio)
}

fun getRandomPoint(xMin: Float, xMax: Float, yMin: Float, yMax: Float): Pair<Double, Double> {
    val x = xMin + Math.random() * (xMax - xMin)
    val y = yMin + Math.random() * (yMax - yMin)
    return Pair(x, y)
}

fun distanceBetweenPoints(p1: Pair<Double, Double>, p2: Pair<Double, Double>): Double {
    return sqrt((p1.first - p2.first).pow(2) + (p1.second - p2.second).pow(2))
}