import React from "react";
function CourseDetails(){
    const courses=[
        {
            id:1,
            course:"Angular",
            date:"4/5/2021"
        },
        {
            id:2,
            course:"React",
            date:"6/3/2021"
        }
    ];
    return(
        <div>
            <h2>Course Details</h2>

            {courses.map(course=>(
                <div key={course.id}>
                    <h3>{course.course}</h3>
                    <strong>{course.date}</strong>
                </div>
            ))}
        </div>
    );
}

export default CourseDetails;