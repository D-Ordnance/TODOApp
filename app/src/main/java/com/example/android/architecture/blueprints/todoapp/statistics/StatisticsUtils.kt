/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.architecture.blueprints.todoapp.statistics

import com.example.android.architecture.blueprints.todoapp.data.Task

/**
 * Function that does some trivial computation. Used to showcase unit tests.
 */
internal fun getTaskStats(tasks: List<Task>?): StatsResult {
    return if (tasks == null || tasks.isEmpty()) {
        StatsResult(0f, 0f, 0, 0, 0)
    } else {
        val totalTasks = tasks.size
        val numberOfCompletedTasks = tasks.count { it.completedTask }
        val numberOfActiveTasks = tasks.count { it.isActive }
        StatsResult(
                activeTasksPercent = 100f * numberOfActiveTasks / tasks.size,
                completedTasksPercent = 100f * (totalTasks - numberOfActiveTasks) / tasks.size,
                isActiveCount = numberOfActiveTasks,
                isCompletedCount = numberOfCompletedTasks,
                allTasks = totalTasks
        )
    }
}

data class StatsResult @JvmOverloads constructor(
        val activeTasksPercent: Float = 0.0f,
        val completedTasksPercent: Float = 0.0f,
        val isActiveCount: Int = 0,
        val isCompletedCount: Int = 0,
        val allTasks: Int = 0)
