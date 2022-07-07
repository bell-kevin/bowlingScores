# bowlingScores
In the book (Introduction to Programming with Java A Problem Solving Approach Second Edition by John Dean and Raymond Dean) on pages 158 to 159, there is code for a Bowling Scores program that works. Copy this code to a project and follow the instructions in the book to improve it. Modify the program so the calculation for the average does not perform a division by zero. The calculation and printing of the average must remain outside of the loop for collecting the input. If the user entered no valid numbers, or typed -1 as the first entry, there were no scores, so do not calculate any average. If there was no average, don't print the line that begins "Average score is".  You don’t need an error message or other action, just don’t perform the calculation or print the phrase.  

Initialize a Boolean variable named “more” with “true”, and use it as the While loop condition. Eliminate the prompt and input before the loop (the priming input), and move the prompt and input inside the loop to the top of the loop. Use an “If-Else” structure in the loop to set “more” to “false” and skip the normal calculation if the input is negative. Add a line of output that prints the title of the project and your name first, then ask the user for bowling scores.  

Notice that the user enters input to the right of the query, on the same line. Don’t worry if the average has lots of decimal places like this – you’ll learn how to handle that in another chapter.  

This is a sample with -1 as the first entry -- no valid scores were entered

Take a screenshot of the running program matching the sample session. Run the program again and enter a different number of scores with different values, and take a screenshot of the results. Run the program again and enter -1 to quit – that will mean there are no scores so the calculation for the average will not execute and the output line for the average score will not print. Take a screenshot of the result.     

Pay careful attention to the rubric for this assignment. Even if not specifically mentioned in the assignment, you are responsible for the following:  

Use descriptive names for all variables     
Add comments describing the use or meaning of variables     
Do NOT include literal values in any calculations, always use variables     
Always include a header in the output with a descriptive title and your name     
If asking for input, make sure the user types on the same line as the question     
Where sample sessions are provided, output from your project must match it  

Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  

Submission: the specified screenshots and the root folder for the project  




== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
