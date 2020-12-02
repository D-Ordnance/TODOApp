package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task
import junit.framework.TestCase
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class StatisticsUtilsTest : TestCase(){

    @Test
    fun testGetTaskStats_noCompleted_returnsHundredZero(){
        //Create an active task
        val tasks = listOf<Task>(
                Task(isCompleted = true),
                Task()
        )
        val tasks2 = null
        //Call your function
        val result = getTaskStats(tasks2)

        //Check your result
//        assertEquals(result.activeTasksPercent, 50f)
//        assertEquals(result.completedTasksPercent, 50f)
//        assertEquals(result.isActiveCount, 1)
//        assertEquals(result.isCompletedCount, 1)
//        assertEquals(result.allTasks, 2)
        //Check your result using hamcrest matcher test framework
        assertThat(result.activeTasksPercent, `is`(50f))
        assertThat(result.completedTasksPercent, `is`(50f))
        assertThat(result.isActiveCount, `is`(1))
        assertThat(result.isCompletedCount, `is`(1))
        assertThat(result.allTasks, `is`(2))
    }
}