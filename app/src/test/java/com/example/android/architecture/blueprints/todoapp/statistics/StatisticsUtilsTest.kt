package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import junit.framework.TestCase
import org.junit.Test

class StatisticsUtilsTest : TestCase(){

    @Test
    fun testGetActiveAndCompletedStats_noCompleted_returnsHundredZero(){
        //Create an active task
        val tasks = listOf<Task>(
                Task(isCompleted = true),
                Task()
        )
        //Call your function
        val result = getActiveAndCompletedStats(tasks)

        //Check your result
        assertEquals(result.activeTasksPercent, 50f)
        assertEquals(result.completedTasksPercent, 50f)
        assertEquals(result.isActiveCount, 1)
        assertEquals(result.isCompletedCount, 1)
        assertEquals(result.allTasks, 2)
    }
}