package com.olabode.wilson.pytutor.files

import com.olabode.wilson.pytutor.models.remote.tutorial.TopicResponse

/**
 * Created by Ogheneruona Onobrakpeya on 9/10/20.
 */

fun genTopicResponse(): List<TopicResponse> {
    return listOf(
        TopicResponse(
            orderKey = 1,
            title = "Introduction",
            description = "Get an overview of Python and what it entails.",
            noOfPages = 3,
            topicId = "introduction",
            isLocked = false,
            isCompleted = false,
            stars = 0f
        ),

        TopicResponse(
            orderKey = 2,
            title = "Basic Syntax",
            description = "Go through ways code is written in Python.You don't have to understand this yet.",
            noOfPages = 3,
            topicId = "",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 3,
            title = "Variables",
            description = "Learn how to store data in variables.",
            noOfPages = 3,
            topicId = "variables",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),

        TopicResponse(
            orderKey = 4,
            title = "Strings",
            description = "Learn what Strings are and how to manipulate Strings.",
            noOfPages = 3,
            topicId = "strings",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),

        TopicResponse(
            orderKey = 5,
            title = "Numbers",
            description = "Number data types store numeric values. Number objects are created when you assign a value to them.",
            noOfPages = 3,
            topicId = "numbers",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 6,
            title = "Input/Output",
            description = "Handle user input and perform output operations.",
            noOfPages = 3,
            topicId = "input_output",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 7,
            title = "Data Structures",
            description = "Learn about data structures.",
            noOfPages = 3,
            topicId = "data_structures",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 8,
            title = "Lists",
            description = "Learn about Python lists.",
            noOfPages = 3,
            topicId = "lists",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 9,
            title = "Tuples",
            description = "Learn about Python tuples.",
            noOfPages = 3,
            topicId = "tuples",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 10,
            title = "Dictionaries",
            description = "Learn about Python dictionaries.",
            noOfPages = 3,
            topicId = "dictionaries",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 11,
            title = "Sets",
            description = "Learn about Python sets.",
            noOfPages = 3,
            topicId = "sets",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),

        TopicResponse(
            orderKey = 12,
            title = "Operators",
            description = "Learn about Python operators, their order and associated types.",
            noOfPages = 3,
            topicId = "operators",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),

        TopicResponse(
            orderKey = 13,
            title = "If...Else Statements",
            description = "Learn flow control with if...else statements.",
            noOfPages = 3,
            topicId = "if_else_statements",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 14,
            title = "For Loops",
            description = "Learn flow control with for loops.",
            noOfPages = 3,
            topicId = "for_loops",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 15,
            title = "While Loops",
            description = "Learn flow control with while loops.",
            noOfPages = 3,
            topicId = "while_loops",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 16,
            title = "Pass,Break & Continue",
            description = "Use break and continue statements for further flow control.",
            noOfPages = 3,
            topicId = "break_continue",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 17,
            title = "Functions",
            description = "Learn how to group procedures in functions.",
            noOfPages = 3,
            topicId = "functions",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        ),
        TopicResponse(
            orderKey = 18,
            title = "Exception Handling",
            description = "Learn how to deal with exceptions.",
            noOfPages = 3,
            topicId = "exception_handling",
            isLocked = true,
            isCompleted = false,
            stars = 0f
        )
    )
}


