package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import junit.framework.TestCase
import org.junit.Test

class StatisticsUtilsTest : TestCase(){

    @Test
    fun testGetActiveAndCompletedStats_noCompleted_returnsHundredZero(){
        //Create an active task
        val tasks = listOf<Task>(
                Task("title", "desc", isCompleted = true)
        )
        //Call your function
        val result = getActiveAndCompletedStats(tasks)

        //Check your result
        assertEquals(result.activeTasksPercent, 0f)
        assertEquals(result.completedTasksPercent, 100f)
    }
}